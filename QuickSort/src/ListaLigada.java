public class ListaLigada<T> {
    private Nodo<T> inicio;

    public ListaLigada(){
        inicio=null;
    }

    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }

    public boolean estaVacia(){
        if(inicio==null)
            return true;
        return false;
    }

    public void insertarAlInicio(T elemento){
        Nodo<T> nodo= new Nodo<>(elemento);
        if(estaVacia())
            inicio= nodo;
        else{
            Nodo<T> temp= inicio;
            nodo.setSiguiente(temp);
            inicio=nodo;
        }

    }

    public void insertarAlUltimo(T elemento){
        Nodo<T> nodo= new Nodo<>(elemento);
        if(estaVacia())
            inicio=nodo;
        else{
            Nodo<T> temp= inicio;
            while(temp.getSiguiente()!=null){
                temp=temp.getSiguiente();
            }
            temp.setSiguiente(nodo);
        }
    }


    public void imprimeLista(){
        if(estaVacia()) {
            System.out.println("Esta lista esta vacía");
        }else{
            Nodo<T> temp= inicio;
            System.out.print("[");
            while(temp!=null){
                System.out.print(temp.getElemento()+", ");
                temp=temp.getSiguiente();
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public int contarElementos(){
        if(estaVacia())
            return 0;
        else{
            int contador=0;
            Nodo<T> temp= inicio;
            while(temp!=null){
                contador++;
                temp=temp.getSiguiente();
            }
            return contador;
        }
    }

    public void quitarElPrimero(){
        if(estaVacia())
            System.out.println("Nada que eliminar");
        else{
            inicio=inicio.getSiguiente();
        }
    }


    public Nodo<T> obtenerElNodoEnLaPos(int pos) throws Exception {
        if(estaVacia())
            return null;
        else{
            if(pos>contarElementos()-1)
                throw new Exception("Index List out of bounds");
            Nodo<T> temp= inicio;
            int contador=0;
            while(contador<pos){
                temp=temp.getSiguiente();
                contador++;
            }
            return temp;
        }
    }
    public T obtenerElElementoEnLaPos(int pos)  {
        if(estaVacia())
            return null;
        else{
            if(pos>contarElementos()-1)
                System.out.println("Index List out of bounds");
            Nodo<T> temp= inicio;
            int contador=0;
            while(contador<pos){
                temp=temp.getSiguiente();
                contador++;
            }
            return temp.getElemento();
        }
    }

    public T obtenerElPrimero(){
        return inicio.getElemento();
    }

    public T obtenerElUltimo(){
        if(estaVacia())
            return null;
        else{
            Nodo<T> temp= inicio;
            while (temp.getSiguiente()!=null){
                temp=temp.getSiguiente();
            }
            return temp.getElemento();
        }
    }

    public void quitarElUltimo(){
        if(estaVacia())
            System.out.println("Nada que eliminar");
        else{
            int tamanio=contarElementos();
            if(tamanio==1){
                inicio=null;
            }else {
                try {
                    Nodo<T> temp = obtenerElNodoEnLaPos(tamanio - 2);
                    temp.setSiguiente(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }


    public void sustituirEnPos(int index, T elemento){
        if(estaVacia())
            System.out.println("Nada que sustituir");
        else{
            try {
                Nodo<T> nodo=obtenerElNodoEnLaPos(index);
                nodo.setElemento(elemento);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public void imprimeLista(int index1, int index2){
        try {
            if(obtenerElNodoEnLaPos(index1)==null) {
                System.out.println("Esta lista esta vacía");
            }else{
                Nodo<T> temp= obtenerElNodoEnLaPos(index1);
                System.out.print("[");
                int iteraciones=index2-index1;
                while(iteraciones>=0){
                    System.out.print(temp.getElemento()+", ");
                    temp=temp.getSiguiente();
                    iteraciones--;
                }
                System.out.print("]");
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void intercambia(int indiceUno,int indiceDos){
        try {
            Nodo<T> nodo1= obtenerElNodoEnLaPos(indiceUno);
            T temp= nodo1.getElemento();
            Nodo<T> nodo2= obtenerElNodoEnLaPos(indiceDos);
            T temp2= nodo2.getElemento();
            nodo1.setElemento(temp2);
            nodo2.setElemento(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
