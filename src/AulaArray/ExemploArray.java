package AulaArray;

import java.util.Scanner;

public class ExemploArray {
    public static void main(String[] args) {
        int[] numeros= new int[100];

        String[] frutas = {"Maçã", "Pera", "Abacaxi", "Mamão"};
        String busca = "Pera";
        numeros[0]=3;
        numeros[1]=4;

        for(int i=0; i< frutas.length; i++){
            if(busca.equals(frutas[i])){
                System.out.println(frutas[i].toLowerCase());
                System.out.println(frutas[i].length());
                System.out.println(frutas[i].charAt(0));
            }
        }
        /*for (int i=0; i<10; i++){
            numeros[i]= (i+2)*5;
            System.out.println(numeros[i]);
        }
        for (int i=0; i<10; i++){
           if(numeros[i]==10){
               System.out.println("Achoou");
                break;
            }
            System.out.println(numeros[i]);
        }

        for (int i=0; i<10; i++){
            if(frutas[i].equals("Maçã")){
                System.out.println("Achoou");
            }
        }



        /*double[] numeroDouble= new double[10];
        String[] strings= new String[10];
        Scanner[]scanners = new Scanner[10];

        int[][] meusNumeros = new int [4][5];*/




        /*int[][] vetorIrregular = new int[3][];
        vetorIrregular[0] = new int[10];
        vetorIrregular[1] = new int[3];
        vetorIrregular[2] = new int[7];*/


    }
}
