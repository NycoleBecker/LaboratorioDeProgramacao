package Aula04;

import java.util.Scanner;

public class PalavrasImproprias {
    public static void main(String[] args) {
        String improprio1 = "sexo";
        String improprio2 = "sexual";
        String frase;
        boolean invalido = true;

        Scanner tc = new Scanner(System.in);
        System.out.println("Escreva uma frase:");
        frase = tc.next();

        if (frase.equals(improprio1) && (frase.equals(improprio2))){
            System.out.println("Invalido");

        }else{
            invalido = false;
            System.out.println("Que frase legal");
        }

    }
}
