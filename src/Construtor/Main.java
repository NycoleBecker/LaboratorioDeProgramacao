package Construtor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Livros l1 = new Livros();
        l1.lerDados();
        l1.exibirDados();

        Livros l2 = new Livros();
        l2.lerDados();
        l2.exibirDados();

        if (l1.equals(l2)) {
            System.out.println("Livros iguais");
        } else {
            System.out.println("Livros Difetentes");
        }
        */

        ArrayList<Livros> biblioteca = new ArrayList<Livros>();
        Scanner tc = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("\nDigite 1 para add");
            System.out.println("Digite 2 para listar os livros");
            System.out.println("Digite 3 para remover um livro por posição");
            System.out.println("Digite 4 para remover um livro por objeto");
            System.out.println("Digite 5 para encontrar um objeto");
            System.out.println("Digite 6 para mostrar o tamanho da lista:");
            System.out.println("Digite 7 para para atualizar um livro");
            System.out.println("Digite 8 para parar o programa.");
            op = tc.nextInt();
            switch (op) {
                case 1: {
                    Livros livro = new Livros();
                    livro.lerDados();
                    biblioteca.add(livro);
                    break;
                }
                case 2: {
                    for (int i=0; i<biblioteca.size(); i++){
                        biblioteca.get(i).exibirDados();
                    }
                    break;
                }
                case 3: {
                    System.out.println("Digite a ´posição para remover o livro");
                    int posicao= tc.nextInt();
                    Livros apagar = biblioteca.remove(posicao);
                    if(apagar!=null){
                        System.out.println("O LIVRO "+apagar.titulo+ " FOI REMOVIDO");
                    }else{
                        System.out.println("LIVRO NÃO ENCONTRADO");
                    }
                    break;
                }

                case 4: {
                    System.out.println("Digite o nome para remover o livro");
                    String nome = tc.next();
                    Livros apagar = new Livros(nome);
                    if(biblioteca.remove(apagar)){
                        System.out.println("O LIVRO "+apagar.titulo+" FOI REMOVIDO");
                    }else{
                        System.out.println("LIVRO NÃO ENCONTRADO");
                    }
                    break;
                }

                case 5: {
                    System.out.println("Digite o nome para encontrar o livro");
                    String nome = tc.next();
                    Livros buscar = new Livros(nome);
                    if(biblioteca.contains(buscar)){
                        System.out.println("LIVRO ENCONTRADO NA POSIÇÃO: "+biblioteca.indexOf(buscar));
                    }else{
                        System.out.println("Livro não encontrado");
                    }
                    break;
                }

                case 6: {
                    System.out.println("A quantidade de livros registrados é "+biblioteca.size());
                }

                case 7:{
                    System.out.println("Digite o nome do livro que deseja atualizar: ");
                    String nome = tc.next();
                    Livros busca = new Livros(nome);
                    if(biblioteca.contains(busca)){
                        int i = biblioteca.indexOf(busca);
                        Livros newLivro = new Livros();
                        newLivro.lerDados();
                        biblioteca.set(i, newLivro);
                    }

                }
                case 8:{
                    System.out.println("PROGRAMA ENCERRADO");
                }
            }
        }while (op != 8);
    }
}

