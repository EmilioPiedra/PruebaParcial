public class UTPLValidator {
    private  double calificacion;

    public UTPLValidator (double calificacion){
        this.calificacion = calificacion;
    }
    public boolean ValidarNota (double calificacion){
            if (calificacion >= 7){
                return true;
            }else{
                return false;
            }

    }
}
