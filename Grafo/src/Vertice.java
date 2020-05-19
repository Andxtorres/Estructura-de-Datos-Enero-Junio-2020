import java.util.ArrayList;
import java.util.List;

public class Vertice <T extends Comparable<T>> {

    private T elemento;
    private List<Arista> aristas;

    public Vertice(T elemento) {
        this.elemento = elemento;
        aristas= new ArrayList<>();
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public List<Arista> getAristas() {
        return aristas;
    }

    public void setAristas(List<Arista> aristas) {
        this.aristas = aristas;
    }
}
