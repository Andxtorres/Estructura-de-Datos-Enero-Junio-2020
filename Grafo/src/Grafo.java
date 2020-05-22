import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Grafo<T extends Comparable<T>>{

    private List<Vertice<T>> vertices;
    private Stack<T> verticesStack;
    private Queue<T> verticesQueue;

    public Grafo(){
        vertices= new ArrayList<>();
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
