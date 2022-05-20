import java.net.URI;
import java.time.LocalDateTime;

public class Actividad {
    private int contador;
    private String nombre;
    private URI url;
    private LocalDateTime fechaCierre;

    public Actividad( String nombre ,URI url, LocalDateTime fechaCierre) {
        contador++;
        this.nombre = nombre;
        this.url = url;
        //this.FechaCierre = new(LocalDateTime.now());
    }


    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public LocalDateTime getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDateTime fechaCierre) {
        this.fechaCierre = fechaCierre;
    }
}


