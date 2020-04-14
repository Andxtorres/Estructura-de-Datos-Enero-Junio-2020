public class Main {
    public static void main(String[] args) {
        ListaLigada<Integer> lista= new ListaLigada<>();
        lista.insertarAlUltimo(15);
        lista.insertarAlUltimo(14);
        lista.insertarAlUltimo(13);
        lista.insertarAlUltimo(12);
        lista.insertarAlUltimo(11);
        lista.insertarAlUltimo(10);
        lista.insertarAlUltimo(9);
        lista.insertarAlUltimo(8);
        lista.insertarAlUltimo(7);
        lista.insertarAlUltimo(6);
        lista.insertarAlUltimo(5);
        lista.insertarAlUltimo(4);
        lista.insertarAlUltimo(3);
        lista.insertarAlUltimo(2);
        lista.insertarAlUltimo(1);



        lista.imprimeLista();
        System.out.println("-------------------------------");
    Quicksort<Integer> ordenamiento= new Quicksort<>();
        ordenamiento.quickSort(lista);
        lista.imprimeLista();
}
}
