public class Asignatura {
    private String nombre;
    private   int ciclo;
   // private Actividad actividad;
    //private Proyecto proyecto;

    public Asignatura (String nombre, int ciclo){
      this.nombre=nombre;
      this.ciclo = ciclo;

    }

    public String getNombre() {
        return nombre;
    }

    public int getCiclo() {
        return ciclo;
    }
}
