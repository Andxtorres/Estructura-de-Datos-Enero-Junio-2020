public class Main {

    public static void main(String[] args) {
        Grafo<String> grafo= new Grafo<>();
        grafo.agregarVertice("A");
        grafo.agregarVertice("B");
        grafo.agregarVertice("C");
        grafo.agregarVertice("D");
        grafo.agregarVertice("E");
        grafo.agregarVertice("F");
        grafo.agregarVertice("G");
        grafo.agregarArista("A","B");
        grafo.agregarArista("A","C");
        grafo.agregarArista("A","D");
        grafo.agregarArista("B","E");
        grafo.agregarArista("C","F");
        grafo.agregarArista("E","G");
        grafo.agregarArista("F","G");
        grafo.recorreEnAnchura();
        grafo.recorreEnProfundidad();



    }
}
