import java.util.List;

public class Quicksort<T extends Comparable<T>> {

    public void quickSort(ListaLigada<T> lista){
        quickSortRec(lista, 0,lista.contarElementos()-1);
    }


    private void quickSortRec(ListaLigada<T> lista,int izquierda, int derecha){

        int pivote= (izquierda+derecha)/2;
        int i=izquierda;
        int j=derecha;
        while(i<=j){
            while(lista.obtenerElElementoEnLaPos(i).compareTo(lista.obtenerElElementoEnLaPos(pivote))<0){
                i++;
            }
            while(lista.obtenerElElementoEnLaPos(j).compareTo(lista.obtenerElElementoEnLaPos(pivote))>0){
                j--;
            }
            if(i<=j){
                if(i!=j){
                    lista.intercambia(i,j);
                }
                i++;
                j--;
            }
        }
        if(izquierda<j){
            quickSortRec(lista,izquierda,j);
        }
        if(i<derecha){
            quickSortRec(lista,i,derecha);
        }

    }
}
