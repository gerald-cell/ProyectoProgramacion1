
/**
 * Write a description of class Partido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Partido
{
    //Atributos
    private String nombrePartido;
    private int cedula;
    private String colores;
    private String presidenteEjecutivo;
    private String correo;
    
    public Partido(String nombrePartido, int cedula, String colores, String presidenteEjecutivo, String correo) {
        this.nombrePartido = nombrePartido;
        this.cedula = cedula;
        this.colores = colores;
        this.presidenteEjecutivo = presidenteEjecutivo;
        this.correo = correo;
    }
    
    public String getNombrePartido() {
        return nombrePartido;
    }
    
    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }
    
    public int getCedula() {
        return cedula;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public String getColores() {
        return colores;
    }
    
    public void setColores(String colores) {
        this.colores = colores;
    }
    
    public String getPresidenteEjecutivo() {
        return presidenteEjecutivo;
    }
    
    public void setPresidenteEjecutivo(String presidenteEjecutivo) {
        this.presidenteEjecutivo = presidenteEjecutivo;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String toString() {
        return "Partido " +
               "nombrePartido = " + nombrePartido + '\'' +
               ", cedula = " + cedula + '\'' +
               ", colores = " + colores + '\'' +
               ", presidenteEjecutivo = " + presidenteEjecutivo + '\'' +
               ", correo = " + correo + '\'' +
               '}';
    }
}