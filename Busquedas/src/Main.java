public class Main {
    public static void main(String[] args) {
        ListaLigada<Alumno> listaAlumnos= new ListaLigada<>();
        Alumno a= new Alumno("A01211914","Andrés Torres",100);
        Alumno a1= new Alumno("A01657103","Daniel Bakas",68);
        Alumno a2= new Alumno("A01657023","Diana",95);
        listaAlumnos.insertarAlInicio(a);
        listaAlumnos.insertarAlUltimo(a2);
        listaAlumnos.insertarAlUltimo(a1);
        listaAlumnos.imprimeLista();
        Busqueda b= new Busqueda();
        Alumno a3= new Alumno("A01657103","Diana",95);

        System.out.println("Alumno encontrado en la pos: "+b.busquedaBinaria(a3,listaAlumnos));

    }
}
