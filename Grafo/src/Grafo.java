import java.util.ArrayList;
import java.util.List;

public class Grafo<T extends Comparable<T>>{

    private List<Vertice<T>> vertices;
    private List<Arista<T>> aristas;

    public Grafo(){
        vertices= new ArrayList<>();
        aristas=new ArrayList<>();
    }

    public List<Vertice<T>> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertice<T>> vertices) {
        this.vertices = vertices;
    }

    public List<Arista<T>> getAristas() {
        return aristas;
    }

    public void setAristas(List<Arista<T>> aristas) {
        this.aristas = aristas;
    }

    public void agregarVertice(Vertice vertice){
        boolean encontrado=false;
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

    public void agregarArista(Arista arista){
        boolean encontrada=false;
        Vertice<T> v1= null;
        Vertice<T> v2=null;
        for (Arista a:
             aristas) {
            if(a.getVertice1().getElemento().compareTo(arista.getVertice1().getElemento())==0){
                v1=a.getVertice1();
            }
            if(a.getVertice2().getElemento().compareTo(arista.getVertice2().getElemento())==0) {
                v2=a.getVertice2();
            }
        }
        if(v1!=null&&v2!=null){
            encontrada=true;
        }
        if(!encontrada){
            aristas.add(arista);
            arista.getVertice1().getAristas().add(arista);
            arista.getVertice2().getAristas().add(arista);
        }
    }
}
