

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

    public void selectionSort(ListaLigada<T> lista){
        int contador=0;
        for(int i=0;i<lista.contarElementos()-1;i++){
            int smallest=i;
            for(int j=i+1;j<lista.contarElementos()-1;j++){
                if(lista.obtenerElElementoEnLaPos(j).compareTo(lista.obtenerElElementoEnLaPos(smallest))<0){
                    System.out.println("El más pequeño es: "+lista.obtenerElElementoEnLaPos(j));
                    smallest=j;
                }
                contador++;
            }
            System.out.println("Intercambiando "+lista.obtenerElElementoEnLaPos(i)+" con "+lista.obtenerElElementoEnLaPos(smallest));
            lista.intercambia(i,smallest);
            lista.imprimeLista();
            contador++;
        }
        System.out.println("Contador"+contador);

    }

    public void insertionSort(ListaLigada<T> lista){

        int i=1;
        int contador=0;
        while(i<lista.contarElementos()){
            int j=i;
            while(j>0 && (lista.obtenerElElementoEnLaPos(j-1).compareTo(lista.obtenerElElementoEnLaPos(j))>0)){
                System.out.println("Intercambia "+lista.obtenerElElementoEnLaPos(j)+" con "+lista.obtenerElElementoEnLaPos(j-1));
                lista.intercambia(j,j-1);
                lista.imprimeLista();
                j--;
                contador++;
            }
            i++;
            contador++;
        }

        System.out.println("Contador: "+contador);
    }
}
