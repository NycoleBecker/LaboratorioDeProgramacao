package Aula04;

public class Dado {
    public static void main(String[] args) {
        final int FACES=6;
        final int VEZES = 2;
        int sorteio, total=0;

        for (int i=0; i<VEZES; i++){
            sorteio = (int)(Math.random()*FACES+1);
            total+=sorteio;
            System.out.println(sorteio);
        }
        System.out.println(total);
    }
}
