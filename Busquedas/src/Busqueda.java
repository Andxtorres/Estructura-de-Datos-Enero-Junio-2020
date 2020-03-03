public class Busqueda<T extends Comparable<T>> {

    public int busquedaLineal(T elemento,ListaLigada<T> listaLigada){

        for(int i=0;i<listaLigada.contarElementos();i++){
            if(listaLigada.obtenerElElementoEnLaPos(i).compareTo(elemento)==0){
                return i;
            }
        }
        return -1;
    }

    public int busquedaBinaria(T elemento, ListaLigada<T> listaLigada){
        int start=0;
        int end= listaLigada.contarElementos()-1;

        while(start<=end){
            int mid= (start+end)/2;
            System.out.println("Mid: "+mid);
            if(listaLigada.obtenerElElementoEnLaPos(mid).compareTo(elemento)==0)
                return mid;
            if(listaLigada.obtenerElElementoEnLaPos(mid).compareTo(elemento)<0)
                start=mid+1;
            else
                end=mid-1;

        }
        return -1;
    }
}
