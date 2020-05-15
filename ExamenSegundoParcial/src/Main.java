public class Main {

    /*
    * Examen práctico segundo parcial:
    *
    * Se requiere implementar un árbol AVL con las poblaciones de la República Mexicana y sus casos positivos de COVID con la finalidad de tener un acceso rápido en búsqueda a dicha información
    *
    * 1) Programe la clase Población de tal forma que el código de nuestro método main funcione 20 puntos
    * 2) Se requiere saber a que nivel y profundidad del árbol está cada población. 15 puntos
    * 3) Los casos se irán actualizando, programe un método que dada una población que ya existe, borre dicha población del arbol y la inserte de nuevo. 35 puntos
    *
    * */

    public static void main(String[] args) {
        AVL<Poblacion> avl= new AVL<>();
        ArbolPrinter<Poblacion> printer= new ArbolPrinter<>();
        avl.insertar(new Poblacion("CDMX",20000));
        avl.insertar(new Poblacion("Guadalajara",1000));
        avl.insertar(new Poblacion("Monterrey",1100));
        avl.insertar(new Poblacion("Ciudad Victoria",400));
        avl.insertar(new Poblacion("Uruapan",700));
        avl.insertar(new Poblacion("Morelia",1200));
        avl.insertar(new Poblacion("Patzcuaro",200));
        avl.insertar(new Poblacion("Toluca",1000));
        avl.insertar(new Poblacion("Tuxtla Gutierrez",100));
        avl.insertar(new Poblacion("Matamoros",200));
        avl.insertar(new Poblacion("Reynosa",500));
        avl.insertar(new Poblacion("La Paz",1000));
        avl.insertar(new Poblacion("Chetumal",1000));
        avl.insertar(new Poblacion("Veracruz",1300));
        avl.insertar(new Poblacion("Acapulco",2000));

        avl.actualizarValor(new Poblacion("Chetumal",2000));
        printer.printNodo(avl.getRaiz());
        System.out.println(avl.calcularProfundidad(new Poblacion("Acapulco")));

    }
}
