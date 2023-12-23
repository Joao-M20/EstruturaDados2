public class Pilha {

    int head[];
    int pointer;
    public Pilha (int tamanho) {
        head =  new int[tamanho];
        pointer = -1;
    }
    public boolean isEmpty() {
        return pointer == -1;
    }
    public void push (int i) {
        if (pointer + 1 < head.length){
            //head[i] = pointer++;
            head[++pointer] = i;
        }
    }
    public int pop () {
        if (isEmpty())
            return 0;
        return head[pointer--];
    }

    public void remove (int posicao){
        if(!(posicao >=0 && posicao < tamanho)){

        }
    }

}
