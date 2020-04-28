public class Main {
    public static void main(String[] args) {
        AVL<Integer> avl= new AVL<>();
        ArbolPrinter<Integer> printer= new ArbolPrinter<>();
        avl.insertar(7);
        printer.printNodo(avl.getRaiz());
        System.out.println("-------------");
        avl.insertar(10);
        printer.printNodo(avl.getRaiz());
        System.out.println("-------------");
        avl.insertar(11);
        printer.printNodo(avl.getRaiz());
        System.out.println("-------------");
        avl.insertar(4);
        printer.printNodo(avl.getRaiz());
        System.out.println("-------------");
        avl.insertar(6);
        printer.printNodo(avl.getRaiz());
        System.out.println("-------------");
        avl.insertar(8);
        printer.printNodo(avl.getRaiz());
        System.out.println("-------------");

    }
}
