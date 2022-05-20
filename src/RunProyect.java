import java.net.URI;
import java.time.LocalDateTime;

public class RunProyect {
    public static void main(String[] args) throws Exception {
        Estudiante alumno = new Estudiante("Emilio Piedra", "123@utpl.edu.ec");
        alumno.addAsignatura("Fisica",2);
        alumno.getAsignaturas().get(0).addActividad("Parcial 1", new URI("http://abc.com"), LocalDateTime.now());
        alumno.getAsignaturas().get(0).addActividad("taller 1", new URI("http://abc.com"),LocalDateTime.now());
        Proyecto p1 = new Proyecto(10,"Concsular","Consular", true);
        System.out.printf("Hola zzzzzzzzzzzzzzz");
    }
}
