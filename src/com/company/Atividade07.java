package com.company;

import java.util.Scanner;

public class Atividade07 {
    public Atividade07() {
    }

    public static void main(String[] args) {
        String usuarioAutorizado = "Java08";
        String senhaAutorizada = "Java08";
        int cont = 0;
        boolean logado = false;
        Scanner tc = new Scanner(System.in);

        do {
            System.out.println("Digite o usuário:");
            String usuarioInformado = tc.next();
            System.out.println("Digite a senha:");
            String senhaInformada = tc.next();
            ++cont;
            if (usuarioInformado.equals(usuarioAutorizado) && senhaAutorizada.equals(senhaInformada)) {
                System.out.println("Login efetuado com sucesso! Número de tentativas" + cont);
                logado = true;
            } else {
                System.out.println("Login não efetuado! Número de tentativas " + cont);
            }
        } while(cont > 3 || !logado);

    }
}
