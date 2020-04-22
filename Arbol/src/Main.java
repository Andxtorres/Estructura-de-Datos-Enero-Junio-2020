public class Main {
    public static void main(String[] args) {
        Arbol<Integer> arbol= new Arbol<>();
        arbol.insertar(7);
        arbol.insertar(5);
        arbol.insertar(4);
        arbol.insertar(6);
        arbol.insertar(9);
        arbol.insertar(8);
        arbol.insertar(10);
        arbol.recorreEnOrden();
        ArbolPrinter<Integer> arbolPrinter= new ArbolPrinter<>();
        System.out.println("");
        arbolPrinter.printNodo(arbol.getRaiz());
    }
}
