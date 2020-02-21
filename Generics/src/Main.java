import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Usando Object
        Contenedor c= new Contenedor();

        Usuario u= new Usuario();
        u.setCorreo("andxtorres22@gmail.com");
        u.setNombre("Andrés Torres");
        c.setT(u);
        try {
            System.out.println(((Usuario) c.getT()).getCorreo());
        }catch (ClassCastException e){
            System.out.println("No se pudo hacer el casting");
        }


        //Usando Genericos

        ContenedorGenerico<Usuario,String> c1= new ContenedorGenerico<>();
        c1.setT(u);
        c1.setS("Hola Mundo");
        System.out.println(c1.getT().getCorreo()+" "+c1.getS());


        ContenedorGenerico<Integer,Double> c2= new ContenedorGenerico<>();
        c2.setS(20.0);
        c2.setT(10);

    }

}
