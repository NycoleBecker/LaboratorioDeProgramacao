package TrabalhoFinal;

import ListaEncadeada.Cao;

    public class RemoverElemento {
        public void removerPorNome(String nome){
            Cao aux=primeiro;
            int count = 0;
            while (aux.proximo!=null){
                if(aux.nome.equals(nome)){
                    remover(count);
                }
                aux=aux.proximo;
                count ++;

        }
}
