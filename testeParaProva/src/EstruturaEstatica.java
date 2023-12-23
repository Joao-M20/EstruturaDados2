public class EstruturaEstatica<T> {
    public T[] elementos;
    public int tamanho;

    public EstruturaEstatica() {
        this.elementos = (T[]) new Object[10];
        this.tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

}
