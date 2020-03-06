public class Cola<T> {

    private ListaLigada<T> lista;

    public Cola() {
        lista= new ListaLigada<>();
    }

    public void enque(T elemento){

        lista.insertarAlUltimo(elemento);

    }

    public T dequeue(){
        T resultado= lista.obtenerElPrimero();
        lista.quitarElPrimero();
        return resultado;
    }

    public T peek(){
        return lista.obtenerElPrimero();
    }

    public boolean estaVacia(){
        return lista.estaVacia();
    }
}
