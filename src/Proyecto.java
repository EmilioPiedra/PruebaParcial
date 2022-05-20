import java.time.LocalDate;
import java.time.LocalDateTime;

public class Proyecto {
    public static int contador;
    private String nombre;
    private String descripcion;
    private boolean individual;
    double calificacion;
    private LocalDate fechaAsignacion;
    private LocalDateTime fechaEntrega;
    private boolean entregado;

    public Proyecto (double calificacion ,String descripcion ,String nombre, boolean individual){
        contador++;
        this.nombre = nombre;
        this.descripcion =descripcion;
        this.individual = individual;
        this.calificacion = calificacion;
        UTPLValidator.ValidarNota (calificacion);
        this.fechaAsignacion= LocalDate.now();
        this.fechaEntrega = LocalDateTime.now();
        this.entregado = entregado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public boolean getIndividual() {
        return individual;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }

    public boolean getEntregado() {
        return entregado;
    }

}
