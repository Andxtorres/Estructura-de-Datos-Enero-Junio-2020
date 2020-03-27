public class ColaAtencion<T> {
    private Nodo<T> inicial;

    public boolean estaVacia(){
        return inicial==null;
    }

    public void enqueue(T elemento){
        if(estaVacia())
            inicial= new Nodo<>(elemento);
        else{
            Nodo<T> temp= inicial;
            while(temp.getSiguiente()!=null){
                temp=temp.getSiguiente();
            }
            temp.setSiguiente(new Nodo<>(elemento));
        }
    }

    public T deque(){
        if(estaVacia())
            return null;
        else{
            Nodo<T> temp= inicial;
            inicial= inicial.getSiguiente();
            return temp.getElemento();
        }
    }

}
