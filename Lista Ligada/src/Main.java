
public class Main {
    public static void main(String[] args) {
        ListaLigada<Integer> listaLigada= new ListaLigada<>();
        listaLigada.insertarAlInicio(13);
        listaLigada.insertarAlInicio(20);
        listaLigada.insertarAlInicio(40);
        listaLigada.insertarAlUltimo(60);
        listaLigada.imprimeLista();
        System.out.println("La lista tiene: "+listaLigada.contarElementos()+" elementos");
        listaLigada.quitarElPrimero();
        listaLigada.imprimeLista();
        System.out.println("El inicial es: "+listaLigada.obtenerElPrimero());
        System.out.println("El nodo final: "+listaLigada.obtenerElUltimo());
        listaLigada.insertarAlUltimo(50);
        listaLigada.imprimeLista();
        System.out.println("El elemento en la pos[2] es: "+listaLigada.obtenerElElementoEnLaPos(2));
    }
}
