

public class Ordenamiento<T extends Comparable<T>> {


    public void bubbleSort(ListaLigada<T> lista){
        for(int i=0; i<lista.contarElementos()-1;i++){
            boolean intercambiados=false;
            for(int j=0;j<lista.contarElementos()-1;j++){
                if(lista.obtenerElElementoEnLaPos(j).compareTo(lista.obtenerElElementoEnLaPos(j+1))>0){
                    System.out.println("La i es: "+i+" La j es: "+j);
                    System.out.println("Esta intercambiando "+lista.obtenerElElementoEnLaPos(j)+" con "+lista.obtenerElElementoEnLaPos(j+1));

                    lista.intercambia(j,j+1);
                    lista.imprimeLista();
                    intercambiados=true;
                }
            }
            if(!intercambiados)
                return;

        }
    }
}
