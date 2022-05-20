public class UTPLValidator {

    public static boolean ValidarNota(double calificacion){
            if (calificacion >= 0 && calificacion <=10){
                return true;
            }else{
                return false;
            }

    }
}
