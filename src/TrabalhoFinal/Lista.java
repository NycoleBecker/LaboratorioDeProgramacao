package TrabalhoFinal;

public class Lista {
    public Cao primeiro;
    public int tam;
    public Cao ultimo;

    public Lista() {
    }

    public int size() {
        return this.tam;
    }

    public String toString() {
        return "Lista{primeiro=" + this.primeiro + ", tam=" + this.tam + "}";
    }

    public boolean isEmpty() {
        return this.primeiro == null;
    }

    public boolean add(Cao caozinho) {
        if (this.primeiro == null) {
            this.primeiro = caozinho;
            this.ultimo = caozinho;
            ++this.tam;
            return true;
        } else {
            caozinho.proximo = this.primeiro;
            this.primeiro = caozinho;
            ++this.tam;
            return true;
        }
    }

    public boolean addFim(Cao caozinho) {
        if (this.primeiro == null) {
            return this.add(caozinho);
        } else {
            Cao aux;
            for(aux = this.primeiro; aux.proximo != null; aux = aux.proximo) {
            }

            aux.proximo = caozinho;
            this.ultimo = caozinho;
            ++this.tam;
            return true;
        }
    }

    public boolean addFim2(Cao caozinho) {
        if (this.primeiro == null) {
            return this.add(caozinho);
        } else {
            Cao aux = this.ultimo;
            aux.proximo = caozinho;
            this.ultimo = caozinho;
            ++this.tam;
            return true;
        }
    }

    public void exibir() {
        if (this.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            Cao aux = this.primeiro;
            aux.exibir();

            while(aux.proximo != null) {
                aux = aux.proximo;
                aux.exibir();
            }
        }

    }

    public boolean remover(Cao cao) {
        if (!this.isEmpty()) {
            Cao p = this.primeiro;
            this.primeiro = p.proximo;
            --this.tam;
            return true;
        } else {
            System.out.println("Lista vazia");
            return false;
        }
    }

    public void remocao(String nome) {
        Cao aux = this.primeiro;

        for(int count = 0; aux.proximo != null; ++count) {
            if (aux.nome.equals(nome)) {
                this.remover(count);
            }

            aux = aux.proximo;
        }

    }

    public boolean remover(int x) {
        if (x == 0) {
            return this.remover(this.primeiro);
        } else if (x >= this.tam) {
            return false;
        } else if (x == this.tam - 1) {
            return this.removerFim();
        } else {
            int cout = 0;
            Cao elemento = this.primeiro;

            Cao anterior;
            for(anterior = this.primeiro; x > cout; elemento = elemento.proximo) {
                ++cout;
                anterior = elemento;
            }

            anterior.proximo = elemento.proximo;
            --this.tam;
            return true;
        }
    }

    public boolean removerFim() {
        if (this.primeiro == null) {
            System.out.println("Lista vazia");
            return false;
        } else {
            Cao aux = this.primeiro;

            Cao penultimo;
            for(penultimo = this.primeiro; aux.proximo != null; aux = aux.proximo) {
                penultimo = aux;
            }

            penultimo.proximo = null;
            this.ultimo = penultimo;
            --this.tam;
            return true;
        }
    }
}
