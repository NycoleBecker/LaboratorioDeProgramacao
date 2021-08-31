package com.company;

import java.util.Scanner;

public class Atividade08 {
    public Atividade08() {
    }

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o número");
        int numero = tc.nextInt();

        for(int i = 1; i < 10; ++i) {
            System.out.println(i + " X " + numero + " = " + i * numero);
        }

    }
}
