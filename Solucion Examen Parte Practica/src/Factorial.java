public class Factorial {
    public int realizarFactorial(int numero) {
        if(numero == 0 || numero == 1) {
            return 1;
        } else {
            return realizarFactorial(numero - 1) * numero;
        }
    }
}
