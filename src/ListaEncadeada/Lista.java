package ListaEncadeada;

public class Lista {
    public Cao primeiro;
    public int tamanho;
    public Cao ultimo;

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        if (primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean add(Cao caozinho) {
        if (this.primeiro == null) {
            this.primeiro = caozinho;
            this.ultimo=caozinho;
            this.tamanho++;
            return true;
        } else {
            caozinho.proximo = primeiro;
            primeiro = caozinho;
            this.tamanho++;
            return true;
        }
    }

    public boolean addFim(Cao caozinho) {
        if (this.primeiro == null) {
            return add(caozinho);
        } else {
            Cao auxiliar = primeiro;
            while (auxiliar.proximo != null) {
                auxiliar = auxiliar.proximo;
            }
            auxiliar.proximo = caozinho;
            this.ultimo=caozinho;
            tamanho++;
            return true;
        }
    }
    public boolean addFim2(Cao caozinho) {
        if (this.primeiro == null) {
            return add(caozinho);
        } else {
            Cao auxiliar = ultimo;
            auxiliar.proximo = caozinho;
            this.ultimo=caozinho;
            tamanho++;
            return true;
        }
    }
    public void exibir(){
        if (isEmpty()) {
            System.out.println("LISTA VAZIA");
        }else{
            Cao auxiliar = primeiro;
            auxiliar.exibir();
            while (auxiliar.proximo != null) {
                auxiliar = auxiliar.proximo;
                auxiliar.exibir();

            }
        }
    }
    public boolean remover(){
        if(!isEmpty()){
            Cao p=this.primeiro;
            this.primeiro=p.proximo;
            this.tamanho--;
            return true;
           // this.primeiro=this.primeiro.proximo;
        }else{
            System.out.println("LISTA VAZIA");
            return false;
        }
    }

}
