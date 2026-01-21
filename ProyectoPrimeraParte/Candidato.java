
/**
 * Write a description of class CandidatoPresidencial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Candidato
{
    private Partido partido;
    private int cedula;
    private String nombre;
    private Partido candidato;
    private int edad;
    private int cantidadVotos;
    private String nacionalidad;
    
    public Candidato(int cedula, String nombre, Partido partido, int edad, int cantidadVotos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.partido = partido;
        this.edad = edad;
        this.cantidadVotos = 0;
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
    
    public Partido getPartido() {
        return partido;
    }
    
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getCantidadVotos() {
        return cantidadVotos;
    }
    
    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }
    
    public String toString() {
        return "Candidato " +
               "cedula =" + cedula +
               ", nombre = " + nombre + '\'' +
               ", partido = " + partido.getNombrePartido() +
               ", edad = " + edad +
               ", cantidadVotos = " + cantidadVotos +
               '}';
    }
}