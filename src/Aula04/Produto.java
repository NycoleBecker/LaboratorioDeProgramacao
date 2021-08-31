package Aula04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        String nomeProduto;
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("#.00");
        final double PERCENTUAL=1.12;
        double valorProduto;
        Scanner tc = new Scanner(System.in);
        do{
            System.out.println("Valor do produto:");
            valorProduto=tc.nextDouble();

            if (valorProduto>0){
                System.out.println("Nome do produto:");
                nomeProduto= tc.next();

                valorProduto=valorProduto*PERCENTUAL;
                System.out.println("Produto: "+nomeProduto);
                System.out.println("Novo preço do produto: R$"+df.format(valorProduto));
            }else{
                System.out.println("PROGRAMA ENCERRADO. ATÉ MAIS!");
            }

        }while (valorProduto!=0);
    }
}
