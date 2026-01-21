
/**
 * Write a description of class PadronElectoral here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PadronElectoral
{
    private int cedula;
    private String nombre;
    private String domicilioElectoral;
    private boolean votoEmitido;
    
    public PadronElectoral(int cedula, String nombre, String domicilioElectoral) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.domicilioElectoral = domicilioElectoral;
        this.votoEmitido = false; // nadie ha votado al inicio
    }
    
    public int getCedula() {
        return cedula;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDomicilioElectoral() {
        return domicilioElectoral;
    }
    
    public void setDomicilioElectoral(String domicilioElectoral) {
        this.domicilioElectoral = domicilioElectoral;
    }
    
    public boolean isVotoEmitido() {
        return votoEmitido;
    }
    
    public void setVotoEmitido(boolean votoEmitido) {
        this.votoEmitido = votoEmitido;
    }
    
    public String toString() {
        return "PadronElectoral " +
               "cedula = " + cedula +
               ", nombre = " + nombre + '\'' +
               ", domicilioElectoral = " + domicilioElectoral + '\'' +
               ", votoEmitido = " + votoEmitido +
               '}';
    }
}