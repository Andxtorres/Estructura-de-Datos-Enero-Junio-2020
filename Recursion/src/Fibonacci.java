public class Fibonacci {

    public static int fibonacci(int numero){
        if(numero==0||numero==1){
            return numero;
        }
        return fibonacci(numero-1)+ fibonacci(numero-2);

    }
}
