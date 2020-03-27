public class Main {

    public static void main(String[] args) {
        Pelota pelota1 = new Pelota("Roja");
        Pelota pelota2 = new Pelota("Azul");
        System.out.println("Pelota 1: " + pelota1.color + " Pelota 2: " + pelota2.color);
        System.out.println(" ");
        intercambia(pelota1, pelota2);
        System.out.println("Pelota 1: " + pelota1.color + " Pelota 2:" + pelota2.color);


    }

    public static void intercambia(Pelota pelota1, Pelota pelota2)
    {
        pelota2.color = "Verde";
        pelota1.color = "Morada";
        Pelota temp = pelota2;
        pelota1 = pelota2;
        pelota2 = temp;
    }

}
