public class Main {

    public static void main(String[] args) {

        ListaLigada<Integer> lista= new ListaLigada<>();
        lista.insertarAlUltimo(10);
        lista.insertarAlUltimo(3);
        lista.insertarAlUltimo(2);
        lista.insertarAlUltimo(7);
        lista.insertarAlUltimo(8);
        lista.insertarAlUltimo(1);
        lista.insertarAlUltimo(9);
        lista.insertarAlUltimo(5);
        lista.insertarAlUltimo(4);
        lista.insertarAlUltimo(6);
        lista.insertarAlUltimo(16);
        lista.insertarAlUltimo(24);

        lista.imprimeLista();
        System.out.println("-------------------------------");
        Ordenamiento<Integer> ordenamiento= new Ordenamiento();
        ordenamiento.bubbleSort(lista);
        lista.imprimeLista();



    }
}
