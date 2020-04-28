public class AVL<T extends Comparable<T>> {

    private Nodo<T> raiz;

    public Nodo<T> getRaiz() {
        return raiz;
    }

    public void insertar(T elemento){
        raiz=insertarRecursivo(elemento,raiz);
    }

    private Nodo<T> insertarRecursivo(T elemento, Nodo<T> raiz){
        if(raiz!=null) {
            System.out.println("Entra el nodo: " + elemento + " a la raiz " + raiz.getElemento());
        }
        if(raiz==null){
            raiz = new Nodo<>(elemento);

        }else if(elemento.compareTo(raiz.getElemento())<0){
            raiz.setIzquierdo(insertarRecursivo(elemento,raiz.getIzquierdo()));
            if(altura(raiz.getIzquierdo())-altura(raiz.getDerecho())==2){
                if(elemento.compareTo(raiz.getIzquierdo().getElemento())<0){
                    raiz=rotarSimpleALaDerecha(raiz);
                }else{
                    raiz=rotarDobleALaDerecha(raiz);
                }
            }
        }else if(elemento.compareTo(raiz.getElemento())>0){
            raiz.setDerecho(insertarRecursivo(elemento,raiz.getDerecho()));
            if(altura(raiz.getIzquierdo())-altura(raiz.getDerecho())==-2){
                if(elemento.compareTo(raiz.getDerecho().getElemento())>0){
                    raiz=rotarSimpleALaIzquierda(raiz);
                }else{
                    raiz=rotarDobleALaIzquierda(raiz);
                }
            }
        }

        int altura=max(altura(raiz.getIzquierdo()),altura(raiz.getDerecho()));
        raiz.setAltura(altura+1);
        return raiz;

    }

    private Nodo<T> rotarSimpleALaDerecha(Nodo<T> raiz){
        System.out.println("Rotando simple a la derecha");
        Nodo<T> temp=raiz.getIzquierdo();
        raiz.setIzquierdo(temp.getDerecho());
        temp.setDerecho(raiz);
        raiz.setAltura(max(altura(raiz.getIzquierdo()),altura(raiz.getDerecho()))+1);
        temp.setAltura(max(altura(temp.getIzquierdo()),raiz.getAltura())+1);
        return temp;
    }
    private Nodo<T> rotarSimpleALaIzquierda(Nodo<T> raiz){
        System.out.println("Rotando simple a la izquierda");
        Nodo<T> temp=raiz.getDerecho();
        raiz.setDerecho(temp.getIzquierdo());
        temp.setIzquierdo(raiz);
        raiz.setAltura(max(altura(raiz.getIzquierdo()),altura(raiz.getDerecho()))+1);
        temp.setAltura(max(raiz.getAltura(),altura(temp.getDerecho()))+1);
        return temp;
    }

    private Nodo<T> rotarDobleALaDerecha(Nodo<T> raiz){
        System.out.println("Rotando doble a la derecha");
        raiz.setIzquierdo(rotarSimpleALaIzquierda(raiz.getIzquierdo()));
        return rotarSimpleALaDerecha(raiz);
    }
    private Nodo<T> rotarDobleALaIzquierda(Nodo<T> raiz){
        System.out.println("Rotando doble a la izquierda");
        raiz.setDerecho(rotarSimpleALaDerecha(raiz.getDerecho()));
        return rotarSimpleALaIzquierda(raiz);
    }
    private int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    private int altura(Nodo<T> nodo){
        if(nodo==null){
            return -1;
        }else{
            return nodo.getAltura();
        }
    }
}
