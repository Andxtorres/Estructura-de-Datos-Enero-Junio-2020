import java.util.*;

public class Grafo<T extends Comparable<T>>{

    private List<Vertice<T>> vertices;
    private Stack<Vertice<T>> verticesStack;
    private Queue<Vertice<T>> verticesQueue;

    public Grafo(){
        vertices= new ArrayList<>();
        verticesStack= new Stack<>();
        verticesQueue=new LinkedList<>();
    }

    public List<Vertice<T>> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertice<T>> vertices) {
        this.vertices = vertices;
    }

    public void agregarVertice(T elemento){
        boolean encontrado=false;
        Vertice<T> vertice= new Vertice<>(elemento);
        for (Vertice v:
             vertices) {
            if(v.getElemento().compareTo(vertice.getElemento())==0){
                encontrado=true;
            }
        }
        if(!encontrado){
            vertices.add(vertice);
        }
    }

    public void recorreEnProfundidad(){

        if(vertices.get(0)==null){
            System.out.println(" ");
        }else{
            verticesStack.add(vertices.get(0));
            while (!verticesStack.isEmpty()){
                Vertice<T> aExplorar=verticesStack.pop();
                if(!aExplorar.isVisitado()){
                    System.out.print(aExplorar.getElemento().toString()+",");
                    aExplorar.setVisitado(true);
                }
                List<Arista> aristas=aExplorar.getAristas();
                for(Arista a: aristas){
                    if(!a.getVertice1().isVisitado()){
                        verticesStack.add(a.getVertice1());
                    }
                    if(!a.getVertice2().isVisitado()){
                        verticesStack.add(a.getVertice2());

                    }
                }
            }
            System.out.println("");
            reiniciarVisitas();
        }
    }

    public void recorreEnAnchura(){
        if(vertices.get(0)==null){
            System.out.println(" ");
        }else{
            verticesQueue.add(vertices.get(0));
            while(!verticesQueue.isEmpty()){
                Vertice<T> aExplorar= verticesQueue.poll();
                if(!aExplorar.isVisitado()){
                    System.out.print(aExplorar.getElemento().toString()+",");
                    aExplorar.setVisitado(true);
                }
                List<Arista> aristas= aExplorar.getAristas();
                for(Arista a: aristas){
                    if(!a.getVertice1().isVisitado()){
                        verticesQueue.add(a.getVertice1());
                    }
                    if(!a.getVertice2().isVisitado()){

                        verticesQueue.add(a.getVertice2());
                    }
                }
            }
            System.out.println("");
            reiniciarVisitas();
        }

    }

    public void reiniciarVisitas(){
        for(Vertice v: vertices){
            v.setVisitado(false);
        }
    }


    public void agregarArista(T elemento1, T elemento2){
        boolean encontrada=false;
        Vertice<T> v1= null;
        Vertice<T> v2=null;
        for(Vertice v:vertices){
            if(v.getElemento().compareTo(elemento1)==0){
                v1=v;
            }
            if(v.getElemento().compareTo(elemento2)==0){
                v2=v;
            }
        }

        if(v1!=null&&v2!=null){
            Arista<T> arista= new Arista<>(v1,v2);
            v1.getAristas().add(arista);
            v2.getAristas().add(arista);
        }else{
            System.out.println("No se puede agregaar la arista");
        }

    }
}
