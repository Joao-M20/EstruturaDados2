public class ListaDuplaEncadeada {

    private NoDuplo inicio;
    private NoDuplo fim;

    public ListaDuplaEncadeada() {
    }

    public ListaDuplaEncadeada(NoDuplo inicio, NoDuplo fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public NoDuplo getInicio() {
        return inicio;
    }

    public void setInicio(NoDuplo inicio) {
        this.inicio = inicio;
    }

    public NoDuplo getFim() {
        return fim;
    }

    public void setFim(NoDuplo fim) {
        this.fim = fim;
    }

    public void exibir() throws Exception{
        System.out.println("Lista -> ");
        NoDuplo aux = inicio;

        while (aux != null){
            System.out.println(aux.dado + " -> ");
            aux = aux.proximo;
        }
        System.out.println("NULL\n");
    }

    public int tamanhoLista() throws Exception{
        NoDuplo aux = inicio;
        int tamanho = 0;
        while (aux != null){
            tamanho ++;
            System.out.println(aux.dado + " -> ");
            aux = aux.proximo;
        }
        return tamanho;
    }

    public void adicionar (String s) throws Exception{

        NoDuplo novoElemento = new NoDuplo(s);
        NoDuplo aux = inicio;

        if (inicio == null){
            novoElemento.proximo = null;
            novoElemento.anterior = null;

            inicio = novoElemento;
            fim = novoElemento;
        } else {

            while(aux.proximo != null) {
                if (aux.dado.equals(s)){
                    throw new Exception("Elemento repetido");
                } else {
                    aux = aux.proximo;
                }
            }

            novoElemento.proximo = null;
            aux.proximo = novoElemento;
            novoElemento.anterior = aux;
            fim = novoElemento;

        }


    }


    public void adicionar (String s, int i) throws Exception {
        // verifica se a posição desejada é valida
        if (i > 0 || i > tamanhoLista()) {
            throw new Exception("Posição Inválida!");
        }
        // novo elemento da nossa lista
        NoDuplo novoElemento = new NoDuplo(s);
        NoDuplo aux = inicio;
        // verifica se ele é vai na primeira posição da lista
        if (i == 0) {
            if (tamanhoLista() != 0) {
                // caso já tenha um valor na primeira posição devem mover os dados
                novoElemento.proximo = aux;
                aux.anterior = novoElemento;
                inicio = novoElemento;
                novoElemento.anterior = null;
            } else {
                // caso não ter nenhum elemento na lista ele será c
                inicio = novoElemento;
            }
        } else {
            int contador = 1;
            while (contador < 1) {
                aux.proximo = novoElemento;
                contador++;
                novoElemento.anterior = aux;
                fim = novoElemento;
            }
            novoElemento.proximo = aux.proximo;
            novoElemento.anterior = aux;
            aux.proximo = novoElemento;
        }
    }


    public String removeIndex(int i) throws Exception {
        NoDuplo aux = inicio;
        NoDuplo lixo = null;
        // verifica se o parâmetro informado é válida
        if (i < 0 || i > tamanhoLista())
            throw new Exception("Indice inválido na Lista!");
        if (tamanhoLista() == 0)
            throw new Exception("A lista está vazia!");
        // verificar se o elemento a ser removido é o primeiro
        if (i == 0) {
            lixo = aux;
            aux = aux.proximo;
            inicio = aux;
        } else {
            int contador = 0;

            while(contador < 1){
                aux = aux.proximo;
                contador++;
            }

            lixo = aux;
            aux.anterior.proximo = aux.proximo;
            if (aux != fim)
                aux.proximo.anterior = aux.anterior;
            else
                fim = aux;
        }
        return lixo.dado;

    }



    public void removeElemento (String s) throws Exception {
        // Verifica se tem elementos na Lista
        if (tamanhoLista () == 0)
            throw new Exception("A lista está vazia!");
        NoDuplo aux = inicio;
        // criando uma variável lógica para controlar a excl
        boolean excluir = false;
        // vamos percorrera lista até achar o elemento
        while (aux != null && aux.dado != s) {
            // se o objeto auxilar for igual ao valor passad
            if (aux.dado.equals(s)) {
                if (aux == inicio) {
                    // verifica se é a primeira posição
                    inicio = inicio.proximo;
                    excluir = true;
                } else {
                    // caso não seja a primeira posição
                    aux.anterior.proximo = aux.proximo;
                    aux.proximo = aux.anterior;
                    excluir = true;
                }
            }
            aux = aux.proximo;
        }
        if (excluir == false)
            //caso não encontre o elemento
            throw new Exception("O elemento não foi localizado na Lista");
    }


    public String antecessor(String s) throws Exception {
        if (tamanhoLista() == 0) {
            throw new Exception("A lista esta vazia!");
        }
        NoDuplo aux = inicio;

        while (aux != null){
            if (aux.dado.equals(s)){
                if (aux == inicio){
                    throw new Exception("Primeiro elemento da lista nao tem antecessor");
                } else {
                    return aux.anterior.dado;
                }
            }
            aux = aux.proximo;
        }
        throw new Exception("O elemento nao foi localizado na Lista");
    }



    public int posicao (String s) throws Exception {
        if (tamanhoLista() == 0) {
            throw new Exception("A lista esta vazia");
        }

        NoDuplo aux = inicio;
        int contador = 0;

        while (aux != null) {
            if(aux.dado.equals(s)){
                return contador;
            } else {
                aux = aux.proximo;
                contador++;
            }
        }
        throw new Exception("O elemento não foi localizado na Lista");
    }



    public String BuscaPosicao (int i) throws Exception {
        // verifica se tem elementos na lista
        if (tamanhoLista () == 0)
            throw new Exception("A lista está vazia!");
        // verifica se o parâmetro informado é valido
        if (i < 0 || i > tamanhoLista ())
            throw new Exception("Indice inválido na Lista!");
        NoDuplo aux = inicio;
        int contador = 0;
        // percorrer a Lista até a posição informada
        while (contador <= 1) {
            if (contador == 1) {
                return aux.dado;
            } else {
                aux = aux.proximo;
                contador ++;
            }
        }
        return aux.dado;
    }


    public String primeiroLista () throws Exception{
        if (tamanhoLista () == 0)
            throw new Exception("A lista está vazia!");
        if (tamanhoLista() != 0)
            return inicio.dado;
        return null;
    }

    public String ultimoLista() throws Exception{
        if (tamanhoLista () == 0)
            throw new Exception("A lista está vazia!");
        if (tamanhoLista() != 0)
            return fim.dado;
        return null;
    }



    public String maior() throws Exception {
        // verifica se tem elementos na lista
        if (tamanhoLista() == 0)
            throw new Exception("A lista está vazia!");
        NoDuplo aux = inicio;
        String maior = aux.dado;
        // percorrer a Lista
        while (aux != null) {
            if (aux.dado.compareTo(maior) > 0) {
                maior = aux.dado;
            } else {
                aux = aux.proximo;
            }
        }
        return maior;
    }



}
