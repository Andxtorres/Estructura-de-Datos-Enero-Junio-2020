public class SumaDeNumeros {

    public static int sumaNumeros(int numero){
        if(numero==0||numero==1){
            return numero;
        }

        return numero + sumaNumeros(numero-1);
    }


}
