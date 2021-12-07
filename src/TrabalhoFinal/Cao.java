package TrabalhoFinal;

import java.util.Scanner;

public class Cao {
    public String nome;
    public String raca;
    public Cao proximo;

    public void ler(){
        System.out.println("Digite nome:");
        Scanner tc = new Scanner(System.in);
        nome=tc.next();
        System.out.println("Digite a raça: ");
        raca=tc.next();

    }
    public void exibir(){
        System.out.println("Nome: "+nome);
        System.out.println("Raça: "+raca);
    }

}
