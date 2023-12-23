public class ListaEncadeada<Tipo> {

    private No inicio;
    private No fim;
    private int tamanho;

    @Override
    public String toString() {
        return "ListaEncadeada{" + "inicio=" + inicio + '}';
    }

    public ListaEncadeada(){
        this.tamanho = 0;
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }


    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


    public void adiciona(Tipo elemento){
        No<Tipo> celula = new No<Tipo>(elemento);
        if (this.inicio == null && this.fim == null){
            this.inicio = celula;
            this.fim = celula;
        } else {
            this.fim.setProximo(celula);
            this.fim = celula;
        }
        this.tamanho++;
    }


    public No pegar(int posicao) {
        No atual = this.inicio;
        for (int i = 0; i < posicao; i++){
            if(atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public void remover (Tipo elemento){ // Camila
        No anterior = null;
        No atual = this.inicio; // CLAUDIO ---- CAMILA
        for (int i = 0; i < getTamanho(); i++){  //Tamanho 4
            if(atual.getElemento().equals(elemento)){      //Claudio é igual a Camila? NÃO.........Camila é igual a Camila? SIM
                if(this.tamanho == 1){      // 4 == 1? NÃO
                    this.inicio = null;
                    this.fim = null;
                } else if (atual == inicio){    //Camila é igual a Claudio? NÃO
                    this.inicio = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == fim) {      //Camila é igual a Elias? Não
                    this.fim = anterior;
                    anterior.setProximo(null);
                } else
                    anterior.setProximo(atual.getProximo());    //Cladio.setProximo(Camila.getProximo(que no caso é Miguel));
                    this.tamanho--;
                    break;                  //Este Break QUEBRA O LAÇO FOR ACIMA, ou seja, ele nao chega a fazer os comando
                                            //abaixo apos encontra o Elemento Camila.
            }
            anterior = atual; // Anterior = Claudio
            atual = atual.getProximo(); // atual = Claudio.getProximo(seria Camila),,,,,,,,,,,, logo atual = Camila
        }
    }




}
