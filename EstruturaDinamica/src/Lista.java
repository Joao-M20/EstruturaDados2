public class Lista {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();//LINKEDLIST MAIS PRATICO DE USAR, NAO PRECISA CRIAR CLASSES

        lista.adiciona("Claudio");
        lista.adiciona("Camila");
        lista.adiciona("Miguel");
        lista.adiciona("Elias");

        System.out.println(lista);

//        System.out.println("Inicio da lista = " + lista.getInicio().getElemento());
//        System.out.println("Fim da lista = " + lista.getFim().getElemento());

//        Pegar elemento nº2
//        System.out.println("Elemento na posicao 2 = " + lista.pegar(2).getElemento());

        lista.remover("Elias");

        System.out.println(lista);

    }
}