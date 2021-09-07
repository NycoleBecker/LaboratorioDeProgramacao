package Aula04;

import java.util.Locale;

public class UsandoStrings {
    public static void main(String[] args) {
        String nome = "Nycole Becker";
        int number=nome.length();
        System.out.println(number);
        System.out.println(nome.charAt(10));
        System.out.println(nome.toLowerCase());

        //nome=nome.toUpperCase();//
        //System.out.println(nome);

        System.out.println(nome.toUpperCase());
        System.out.println(nome);
        System.out.println(nome.substring(6));
        System.out.println(nome.substring(6,9));
    }
}
