package Pizzaria;

import java.util.Objects;
import java.util.Scanner;

public class Sabores {
    String sabor;
    Double valor;
    boolean alergia;
    Scanner tc= new Scanner(System.in);

    public void ler(){
        System.out.println("Digite o sabor:");
        sabor = tc.next();
        System.out.println("Digite o valor: R$");
        valor = tc.nextDouble();
        System.out.println("Contém produtos alérgicos?");
        String ok= tc.next();
        if(ok.equals("sim")){
            alergia = true;
        }

    }
    public Sabores(){
        System.out.println("Digite o sabor:");
        sabor = tc.next();
        System.out.println("Digite o valor:");
        valor = tc.nextDouble();
        System.out.println("Contém produtos alérgicos?");
        String ok= tc.next();
        if(ok.equals("sim")){
            alergia = true;
        }
    }
    public Sabores(String sabor){
        this.sabor = sabor;
    }

    public  void mostrar(){
        System.out.println("Sabor: "+this.sabor);
        System.out.println("Valor R$ "+this.valor);
        System.out.println("Alergia: "+this.alergia);
        if(this.alergia){
            System.out.println("Alergia: Sim.");
        }else{
            System.out.println("Alergia: Não.");
        }
        System.out.println("-------------------------");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sabores sabores = (Sabores) o;
        return Objects.equals(sabor, sabores.sabor);
    }

}
