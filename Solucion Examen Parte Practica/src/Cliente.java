public class Cliente implements Comparable<Cliente>{

    private int numero;
    private String nombre;
    private int prioridad;
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }


    @Override
    public int compareTo(Cliente o) {
        int comparacion=0;
        if(prioridad>o.getPrioridad()){
            return 1;
        }else if(prioridad<o.getPrioridad()){
            return -1;
        }else{
            if(numero>o.getNumero()){
                return 1;
            }else if(numero<o.getNumero()) {
                return -1;
            }
        }
        return 0;
    }
}
