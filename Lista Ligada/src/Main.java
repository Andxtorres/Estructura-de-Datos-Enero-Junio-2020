
public class Main {
    public static void main(String[] args) {
        ListaLigada<Integer> listaLigada= new ListaLigada<>();
        listaLigada.insertarAlInicio(13);
        listaLigada.insertarAlInicio(20);
        listaLigada.insertarAlInicio(40);
        listaLigada.insertarAlUltimo(60);
        listaLigada.imprimeLista();
        System.out.println("La lista tiene: "+listaLigada.contarElementos()+" elementos");
        listaLigada.quitarElPrimero();
        listaLigada.imprimeLista();
        System.out.println("El inicial es: "+listaLigada.obtenerElPrimero());
        System.out.println("El nodo final: "+listaLigada.obtenerElUltimo());
        listaLigada.insertarAlUltimo(50);
        listaLigada.imprimeLista();
        System.out.println("El elemento en la pos[2] es: "+listaLigada.obtenerElElementoEnLaPos(2));

        ListaLigada<Alumno> listaAlumnos= new ListaLigada<>();
        Alumno a= new Alumno("A01211914","Andrés Torres",100);
        Alumno a1= new Alumno("A01657103","Daniel Bakas",68);
        Alumno a2= new Alumno("A01657023","Diana",95);
        listaAlumnos.insertarAlInicio(a);
        listaAlumnos.insertarAlUltimo(a1);
        listaAlumnos.insertarAlUltimo(a2);
        listaAlumnos.imprimeLista();
    }
}
