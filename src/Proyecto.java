import java.time.LocalDate;
import java.time.LocalDateTime;

public class Proyecto {
    public int contador;
    private String nombre;
    private String descripcion;
    private boolean individual;
    private LocalDate fechaAsignacion;
    private LocalDateTime fechaEntrega;
    private boolean entregado;

    public Proyecto (int contador, boolean individual, LocalDateTime fechaEntrega, LocalDate fechaAsignacion, boolean entregado){
        this.individual = individual;
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
