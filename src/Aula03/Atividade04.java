package Aula03;

import java.util.Scanner;

public class Atividade04 {
    public Atividade04() {
    }

    public static void main(String[] args) {
        int IDADE_MASC_APOSENTAR = 65;
        int IDADE_MASC_CONTRIBUICAO =35;
        int IDADE_FEM_APOSENTAR = 60;
        int IDADE_FEM_CONTRIBUICAO = 30;
        Scanner tc = new Scanner(System.in);
        System.out.printf("Digite sua idade: ");
        int idade = tc.nextInt();
        System.out.println("Digite o tempo de contribuição: ");
        int contribuicao = tc.nextInt();
        System.out.println("Digite seu sexo: ");
        String sexo = tc.next();
        if (sexo.equalsIgnoreCase("m")) {
            if (idade >= 65) {
                System.out.println("Você já pode se aposentar por idade.");
            } else if (contribuicao >= 35) {
                System.out.println("Você já pode se aposentar por tempo de contribuição! ");
            } else {
                System.out.println("Você ainda não pode se aposentar. Faltam ");
                System.out.println(35 - contribuicao + " anos de contribuição.");
                System.out.println(65 - idade + " anos de idade.");
            }
        } else if (idade >= 60) {
            System.out.println("Você já pode se aposentar por idade.");
        } else if (contribuicao >= 30) {
            System.out.println("Você já pode se aposentar por tempo de contribuição! ");
        } else {
            System.out.println("Você ainda não pode se aposentar. Faltam: ");
            System.out.println(30 - contribuicao + " anos de contribuição.");
            System.out.println(60 - idade + " anos de idade.");
        }

    }
}
