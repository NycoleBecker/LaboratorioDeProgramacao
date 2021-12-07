package ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        Cao cao = new Cao();
        cao.ler();
        Lista canil = new Lista();
        canil.add(cao);
        Cao cao2 = new Cao();
        cao.ler();
        canil.addFim(cao2);
        Cao cao3 = new Cao();
        cao.ler();
        canil.addFim(cao3);

        System.out.println("Quantos elementos têm na minha lista?"+ canil.size());

        if(canil.isEmpty()){
            System.out.println("VAZIO");
        }else{
            System.out.println("CHEIO");
        }
        canil.exibir();
        canil.remover();
        System.out.println("remover");
        canil.exibir();

    }

}
