import java.net.URI;
import java.time.LocalDateTime;

public class Actividad {
    public int contador;
    private String nombre;
    private URI url;
    private LocalDateTime fechaCierre;

    public Actividad( String nombre ,URI url, LocalDateTime fechaCierre) {
        this.setNombre(nombre);
        this.setUrl(url);
        this.setFechaCierre(LocalDateTime.now());
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


