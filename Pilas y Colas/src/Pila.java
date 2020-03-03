public class Pila<T> {

    private ListaLigada<T> lista;

    public Pila(){
        lista= new ListaLigada<>();
    }


    public boolean estaVacia(){
        return lista.estaVacia();
    }

    public void push(T elemento){
        lista.insertarAlUltimo(elemento);
    }

    public T peek(){
        return lista.obtenerElUltimo();
    }

    public T pop(){
        T resultado=lista.obtenerElUltimo();
        lista.quitarElUltimo();
        return resultado;
    }

}
