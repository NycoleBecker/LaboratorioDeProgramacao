package Ap2;

public class Main {
    public static void main(String[] args){
        Teclado tc= new Teclado();
        System.out.println(tc.lerStringJOP());
        System.out.println(tc.lerString("Digite uma String passada por parâmetro:"));
        System.out.println(tc.lerInt());
        System.out.println(tc.lerInt("Digite um inteiro passado por parâmetro: "));
        System.out.println(tc.lerFloat());
        System.out.println(tc.lerFloat("Digite um Float passado por parâmetro:"));
        System.out.println(tc.lerDouble());
        System.out.println(tc.lerDouble("Digite um Double por parâmetro:"));
        System.out.println(tc.lerChar());
        System.out.println(tc.lerChar("Digite um Char por parâmetro: "));
        System.out.println(tc.lerEmail());
        System.out.println(tc.lerNumero());
        System.out.println(tc.lerData());
        System.out.println(tc.alterarData());
        System.out.println(tc.lerCodigo());

    }
}
