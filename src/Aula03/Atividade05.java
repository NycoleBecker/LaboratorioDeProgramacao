package Aula03;

import java.util.Scanner;

public class Atividade05 {
    public Atividade05() {
    }

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o nome do produto:");
        String produto = tc.next();
        System.out.println("Digite o valor do produto:");
        double valor = tc.nextDouble();
        if (valor >= 50.0D && valor < 200.0D) {
            valor *= 0.95D;
        } else if (valor >= 200.0D && valor < 500.0D) {
            valor *= 0.94D;
        } else if (valor >= 500.0D && valor < 1000.0D) {
            valor *= 0.93D;
        } else if (valor >= 1000.0D) {
            valor *= 0.92D;
        }

        System.out.println("O produto " + produto + " possui o valor R$" + valor);
    }
}
