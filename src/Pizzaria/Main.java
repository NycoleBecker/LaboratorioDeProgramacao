package Pizzaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    int programa=0;
        ArrayList<Sabores> arraySabores = new ArrayList<>();
        Scanner tc = new Scanner(System.in);

        do{
            System.out.println("Sabores cadastrados "+arraySabores.size());
            System.out.println("1: Cadastrar sabores:");
            System.out.println("2: Exibir sabores: ");
            System.out.println("3: Encontrar sabor:");
            System.out.println("4: Atualizar sabores: ");
            System.out.println("5: Listar produtos com alergia: ");
            System.out.println("6: Remover sabores: ");
            programa = tc.nextInt();

            switch (programa){
                case 1:{
                    Sabores sabor = new Sabores();
                    if(arraySabores.add(sabor)){
                        System.out.println("Sabor cadastrado: ");
                        sabor.mostrar();
                    }else{
                        System.out.println("Sabor não cadastrado.");
                    }
                    break;
                }
                case 2:{
                    if(arraySabores.isEmpty()){
                        System.out.println("Sabores não cadastrador");
                    }else{
                        for (int i=0; i<arraySabores.size(); i++){
                            //arraySabores.get(i).mostrar();
                            Sabores s= arraySabores.get(i);
                            s.mostrar();
                        }
                    }
                    break;
                }
                case 3:{
                    String sabor = tc.next();
                    Sabores busca = new Sabores(sabor);
                    if(arraySabores.contains(busca)){
                        System.out.println("Sabor já cadastrado");
                        System.out.println("Posição "+arraySabores.indexOf(busca));
                    }else{
                        System.out.println("Sabor não encontrado");
                    }
                    break;
                }
                case 4: {
                    String sabor = tc.next();
                    Sabores busca = new Sabores(sabor);
                    if (arraySabores.contains(busca)) {
                        busca.mostrar();
                       int i=arraySabores.indexOf(busca);
                       busca = arraySabores.get(i);
                       busca.mostrar();
                       busca.ler();
                       //arraySabores.set(i, busca);
                    } else {
                        System.out.println("Sabor não atualizado");
                    }
                    break;
                }
                case 5:{
                    for(int i=0; i<arraySabores.size(); i++){
                        if(!arraySabores.get(i).alergia){
                            arraySabores.get(i).mostrar();
                        }
                    }
                }
                case 6:{
                    String sabor=tc.next();
                    Sabores busca = new Sabores(sabor);
                    if(arraySabores.contains(busca)){
                        arraySabores.remove(busca);
                        System.out.println("O sabor "+busca.sabor+" foi removido.");
                    }else{
                        System.out.println("O sabor "+busca.sabor+" não foi encontrado.");
                    }
                    break;
                }
            }

        }while (programa!=99);
    }
}
