package com.company;

import java.util.Scanner;

public class Atividade01 {
    public Atividade01() {
    }

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double preco = (double)tc.nextFloat();
        System.out.println("Digite a procentagem do desconto:");
        double porcentagem = (double)tc.nextFloat();
        double desconto = preco * porcentagem / 100.0D;
        double precoComDesconto = preco - desconto;
        System.out.println("Valor do produto: " + preco);
        System.out.println("Valor do desconto" + desconto);
        System.out.println("Valor do produto com desconto" + precoComDesconto);
    }
}
