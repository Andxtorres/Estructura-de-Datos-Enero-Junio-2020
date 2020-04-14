public class MergeSort<T extends Comparable<T>> {


    public void mergeSort(ListaLigada<T> lista){

        lista.setInicio(mergeSortRec(lista.getInicio()));
    }

    private Nodo<T> mergeSortRec(Nodo<T> inicial){

        Nodo<T> inicioAnterior =inicial;
        int mid= contarElementosDesdeNodo(inicioAnterior)/2;
        if(inicial.getSiguiente()==null){
            return inicial;
        }
        while(mid-1>0){
            inicioAnterior=inicioAnterior.getSiguiente();
            mid--;
        }
        Nodo<T> nuevoInicio=inicioAnterior.getSiguiente();
        inicioAnterior.setSiguiente(null);
        inicioAnterior=inicial;
        Nodo<T> temp1=mergeSortRec(inicioAnterior);
        Nodo<T> temp2= mergeSortRec(nuevoInicio);
        return merge(temp1,temp2);
    }


    private int contarElementosDesdeNodo(Nodo<T> nodo){
        int resultado=1;
        Nodo<T> temp=nodo;
        while(temp.getSiguiente()!=null){
            temp=temp.getSiguiente();
            resultado++;
        }
        return resultado;
    }

    private Nodo<T> merge(Nodo<T> a, Nodo<T> b){

        Nodo<T> resultado=null;
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }
        if(a.getElemento().compareTo(b.getElemento())>0){
            resultado=b;
            resultado.setSiguiente(merge(a,b.getSiguiente()));
        }else{
            resultado=a;
            resultado.setSiguiente(merge(a.getSiguiente(),b));
        }
        return resultado;

    }
}
