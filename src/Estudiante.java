import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String correoElectronico;
    List<Asignatura> asignaturas;
    public Estudiante(String nombre, String correoElectronico){
        this.nombre= nombre;
        this.correoElectronico = correoElectronico;
        asignaturas = new ArrayList<>();

    }


    public String getNombre(String nombre) {
        return nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
   }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void  addAsignatura (String nombre, int ciclo){
        Asignatura tmp = new Asignatura(nombre,ciclo);
        asignaturas.add(tmp);
    }
}
