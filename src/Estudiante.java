public class Estudiante {
    private String nombre;
    private String correoElectronico;

    public Estudiante(String nombre, String correoElectronico){
        this.nombre= nombre;
        this.correoElectronico = correoElectronico;


    }


    public String getNombre(String nombre) {
        return nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
   }

}
