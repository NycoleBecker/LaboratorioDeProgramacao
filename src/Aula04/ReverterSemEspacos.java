package Aula04;

import java.util.Scanner;

public class ReverterSemEspacos {
    public ReverterSemEspacos() {
    }
    public static void main(String[] args){
        String frase;
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        frase=tc.nextLine();
        StringBuilder reverter = new StringBuilder(frase);

        frase = reverter.reverse().toString().replace(" ","");
        System.out.println(frase);
        }
}
