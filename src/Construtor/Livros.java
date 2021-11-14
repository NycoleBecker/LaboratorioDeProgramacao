package Construtor;

import java.util.Objects;
import java.util.Scanner;

public class Livros {
    public int qntdPaginas;
    public int qntsCapitulos;
    public String titulo;
    public String sinopse;

    public void lerDados(){
        System.out.println("Informe o título do livro: ");
        Scanner tc = new Scanner(System.in);
        titulo = tc.nextLine();

        System.out.println("Informe a sinopse do livro: ");
        sinopse = tc.nextLine();

        System.out.println("Informe a quantidade de páginas do livro: ");
        qntdPaginas = tc.nextInt();

        System.out.println("Informe a quantidade de capítulos do livro: ");
        qntsCapitulos = tc.nextInt();



    }
    public Livros(){

    }
    public Livros(String nome){
        this.titulo=nome;
    }

    public void exibirDados(){
        System.out.println("Título: "+this.titulo);
        System.out.println("Sinopse do Livro: "+this.sinopse);
        System.out.println("Quantidade de Páginas: "+this.qntdPaginas);
        System.out.println("Quantidade de capítulos: "+this.qntsCapitulos+"\n");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return Objects.equals(titulo, livros.titulo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
