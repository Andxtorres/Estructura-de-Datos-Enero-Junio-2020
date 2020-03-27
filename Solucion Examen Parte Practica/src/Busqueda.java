public class Busqueda<T extends Comparable<T>> {

    public int binarySearch(ListaLigada<T> lista,T elemento){
        int start=0;
        int end= lista.contarElementos()-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(lista.obtenerElElementoEnLaPos(mid).compareTo(elemento)==0){
                return mid;
            }
            if(elemento.compareTo(lista.obtenerElElementoEnLaPos(mid))>0){
                start=mid+1;
            }
            if(elemento.compareTo(lista.obtenerElElementoEnLaPos(mid))<0){
                end=mid-1;
            }
        }
        return -1;
    }
}
