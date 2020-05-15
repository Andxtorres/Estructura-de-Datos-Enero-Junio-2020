public class Poblacion implements Comparable<Poblacion> {
    private String nombre;
    private int casos;

    public Poblacion(String nombre) {
        this.nombre = nombre;
    }

    public Poblacion(String nombre, int casos) {
        this.nombre = nombre;
        this.casos = casos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCasos() {
        return casos;
    }

    public void setCasos(int casos) {
        this.casos = casos;
    }

    @Override
    public int compareTo(Poblacion o) {
        if(nombre.compareTo(o.getNombre())==0){
            return 0;
        }else if(nombre.compareTo(o.getNombre())<0){
            return -1;
        }else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return nombre.charAt(0)+""+nombre.charAt(1);
    }
}
