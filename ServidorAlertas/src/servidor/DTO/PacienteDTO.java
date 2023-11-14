/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor.DTO;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ledya
 */
public class PacienteDTO implements Serializable {
    private int noHabitacion;
    private String nombres;
    private String apellidos;
    private float edad;

    public PacienteDTO(int noHabitacion, String nombres, String apellidos, float edad) {
        this.noHabitacion = noHabitacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad=edad;
        
    }

    public PacienteDTO() {
    }

    public int getNoHabitacion() {
        return noHabitacion;
    }

    public void setNoHabitacion(int noHabitacion) {
        this.noHabitacion = noHabitacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public float getEdad() {
        return edad;
    }

    public void setEdad(float edad) {
        this.edad = edad;
    }

    
    

   
    
}
