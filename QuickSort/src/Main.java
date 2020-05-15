public class Main {
    public static void main(String[] args) {
        ListaLigada<String> lista= new ListaLigada<>();
        lista.insertarAlUltimo("Z");
        lista.insertarAlUltimo("F");
        lista.insertarAlUltimo("D");
        lista.insertarAlUltimo("Y");
        lista.insertarAlUltimo("H");
        lista.insertarAlUltimo("A");
        lista.insertarAlUltimo("J");
        lista.insertarAlUltimo("C");
        lista.insertarAlUltimo("B");
        lista.insertarAlUltimo("N");
        lista.insertarAlUltimo("E");
        lista.insertarAlUltimo("E");
        lista.insertarAlUltimo("I");




        lista.imprimeLista();
        System.out.println("-------------------------------");
        Quicksort<String> ordenamiento= new Quicksort<>();
        ordenamiento.quickSort(lista);
        lista.imprimeLista();
}
}
