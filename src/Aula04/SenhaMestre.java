package Aula04;

public class SenhaMestre {
    public static void main(String[] args) {
        final int MAIOR=5;
        int sorteio;
        String senha ="";
        sorteio=(int)(Math.random()*MAIOR+5);
        System.out.println(sorteio);
        for (int i=0; i<sorteio; i++){
            senha += Integer.toString((int)(Math.random()*10));
        }
        System.out.println(senha);
    }
}
