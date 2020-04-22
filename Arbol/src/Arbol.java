public class Arbol<T extends Comparable<T>> {

    private Nodo<T> raiz;

    public Nodo<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo<T> raiz) {
        this.raiz = raiz;
    }

    public void insertar(T elemento){
        Nodo<T> nodo= new Nodo(elemento);
        if(estaVacio()){
            raiz=nodo;
        }else{
            insertaRecursivo(raiz,elemento);
        }
    }

    private Nodo<T> insertaRecursivo(Nodo<T> raiz, T elemento){
        if(raiz==null){
            raiz= new Nodo<T>(elemento);
        }else{
            if(elemento.compareTo(raiz.getElemento())>0){
                raiz.setDerecho(insertaRecursivo(raiz.getDerecho(),elemento));
            }
            if(elemento.compareTo(raiz.getElemento())<0){
                raiz.setIzquierdo(insertaRecursivo(raiz.getIzquierdo(),elemento));
            }
        }
        return raiz;

    }

    public void recorreEnOrden(){
        recorreEnOrden(raiz);
    }

    private void recorreEnOrden(Nodo<T> nodo){
        if(nodo!=null){
            recorreEnOrden(nodo.getIzquierdo());
            System.out.print(nodo.getElemento()+",");
            recorreEnOrden(nodo.getDerecho());
        }
    }

    public void recorreEnPreOrden(){
        recorreEnPreOrden(raiz);
    }

    private void recorreEnPreOrden(Nodo<T> nodo){
        if(nodo!=null){
            System.out.print(nodo.getElemento()+",");
            recorreEnPreOrden(nodo.getIzquierdo());
            recorreEnPreOrden(nodo.getDerecho());
        }

    }

    public void recorreEnPosOrden(){
        recorreEnPosOrden(raiz);
    }

    private void recorreEnPosOrden(Nodo<T> nodo){
        if(nodo!=null){
            recorreEnPosOrden(nodo.getIzquierdo());
            recorreEnPosOrden(nodo.getDerecho());
            System.out.print(nodo.getElemento()+",");
        }
    }


    private boolean estaVacio(){
        return raiz==null;
    }


}
