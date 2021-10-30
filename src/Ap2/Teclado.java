package Ap2;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.util.Scanner;
import java.lang.String;

// DUPLA NYCOLE BECKER E EMANOEL MITTMANN //

public class Teclado {
    //  STRING  //
    public String lerStringJOP() {
        return JOptionPane.showInputDialog("Digite uma String: ");
        }

    public String lerString(String msg) {
        Scanner tc = new Scanner(System.in);
        System.out.println(msg);
        return tc.next().toString();
    }

    //  INT //
    public int lerInt() {
        System.out.println("Digite um inteiro:");
        Scanner tc = new Scanner(System.in);
        try{
            return tc.nextInt();

        }catch (Exception ie){
            System.out.println("Dado inserido é "+ie.getMessage());
            return 0;
        }
    }

    public int lerInt(String msg) {
        System.out.println(msg);
        Scanner tc = new Scanner(System.in);
        try {
            return tc.nextInt();

        } catch (Exception ie) {
            System.out.println("Dado inserido é " + ie.getMessage());
            return 0;
        }
    }

    //  FLOAT   //
    public float lerFloat() {
        System.out.println("Digite um float: ");
        Scanner tc = new Scanner(System.in);
        try {
            return tc.nextFloat();

        } catch (Exception ie) {
            System.out.println("Dado inserido é " + ie.getMessage());
            return 0;
        }
    }
    public float lerFloat(String msg) {
        System.out.println(msg);
        Scanner tc = new Scanner(System.in);
        try {
            return tc.nextFloat();

        } catch (Exception ie) {
            System.out.println("Dado inserido é " + ie.getMessage());
            return 0;
        }
    }

    //  DOUBLE  //
    public double lerDouble() {
        System.out.println("Digite um Double: ");
        Scanner tc = new Scanner(System.in);
        try {
            return tc.nextDouble();

        } catch (Exception ie) {
            System.out.println("Dado inserido é " + ie.getMessage());
            return 0;
        }
    }


    public double lerDouble(String msg) {
        System.out.println(msg);
        Scanner tc = new Scanner(System.in);
        try {
            return tc.nextDouble();

        } catch (Exception ie) {
            System.out.println("Dado inserido é " + ie.getMessage());
            return 0;
        }
    }

    // CHAR //
    public char lerChar() {
        System.out.println("Digite um Char");
        Scanner tc = new Scanner(System.in);
        return tc.next().charAt(0);

    }

    public char lerChar(String msg) {
        System.out.println(msg);
        Scanner tc = new Scanner(System.in);
        return tc.next().charAt(0);
    }

    // EMAIL //
    public String lerEmail() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o email: ");
        String email = input.next();
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9_+&*-]+\\.)+[a-z" + "A-Z]{2,7}$";
        boolean validacao = email.matches(regex);

        do{
            if (validacao == true) {
                return email;
            } else {
                return null;
            }
        }while(validacao == false);

    }

    //  TELEFONE    //
    public String lerNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de telefone (DDD-xxxxxxxxx)");
        String telefone = input.next();
        final int telefonelenght = 13;

        if (telefone.charAt(3) == '-' && telefone.length() == telefonelenght) {
            return telefone;
        } else {
            return null;
        }
    }

    //  DATA    //
    public String lerData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um data em formato (dd/mm/yyyy)");
        String date = input.next();
        final int datelenght = 10;

        if (date.length() == datelenght && date.charAt(2) == '/' && date.charAt(5) == '/') {
            return date;
        } else {
            return null;
        }
    }

    //  ALTERAR DATA    //
    public String alterarData() {
        Scanner input = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String dataInvertida = dateFormat.format(date);
        System.out.println("A data de hoje invertida é: ");
        return dataInvertida;
    }

    public String lerCodigo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um dado para verificar se é numérico: ");
        String numero = input.next();
        String regex = "([0-9])*";
        boolean validacao = numero.matches(regex);

        if (validacao == true) {
            return "TRUE";
        }else {
            return null;
        }
    }
}

