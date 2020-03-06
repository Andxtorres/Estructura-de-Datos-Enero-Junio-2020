public class ColaSinLista<T> {

    private Nodo<T> inicial;

    public void enque(T elemento){
        Nodo<T> nodo= new Nodo<>(elemento);
        if(estaVacia()) {
            inicial = nodo;
        }else{
            Nodo<T> temp=inicial;
            while(temp.getSiguiente()!=null){
                temp=temp.getSiguiente();
            }
            temp.setSiguiente(nodo);
        }

    }

    public T peek(){
        Nodo<T> temp=inicial;
        while (temp.getSiguiente()!=null){
            temp=temp.getSiguiente();
        }
        return temp.getElemento();
    }

    public T dequeue(){
        if(estaVacia()){
            return null;
        }else{
            Nodo<T> temporal=inicial;
            inicial=inicial.getSiguiente();
            return temporal.getElemento();
        }

    }

    public boolean estaVacia(){
        return inicial==null;
    }

}
