package AulaArray;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        somarDoisNumeros(5, 8);
        System.out.println("Digite valor de C");
        int c = tc.nextInt();
        System.out.println("Digite valor de D");
        int d = tc.nextInt();
        mostrarSoma(c, d);

    }

    public static int somarDoisNumeros(int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;
    }

    public static void mostrarSoma(int c, int d) {
        System.out.println(somarDoisNumeros(c, d));

    }

}
