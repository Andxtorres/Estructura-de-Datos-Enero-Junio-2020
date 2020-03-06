public class PilaSinLista<T> {

    private Nodo<T> inicial;

    public void push(T elemento){
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

    public T pop(){
        if(estaVacia()){
            return null;
        }else{
            Nodo<T> temp= inicial;
            if(inicial.getSiguiente()==null){
                inicial=null;
                return temp.getElemento();
            }else{

                while(temp.getSiguiente().getSiguiente()!=null){
                    temp=temp.getSiguiente();
                }
                Nodo<T> resultado= temp.getSiguiente();
                temp.setSiguiente(null);
                return resultado.getElemento();

            }
        }

    }

    public boolean estaVacia(){
        return inicial==null;
    }

}
