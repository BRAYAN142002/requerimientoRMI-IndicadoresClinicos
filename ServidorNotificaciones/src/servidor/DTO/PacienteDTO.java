/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.DTO;

/**
 *
 * @author brayan
 */
public class PacienteDTO {
    private int noHabitacion;
    private String nombres;
    private String apellidos;
    private float edad;

    public PacienteDTO(int noHabitacion, String nombres, float edad) {
        this.noHabitacion = noHabitacion;
        this.nombres = nombres;
        this.edad = edad;
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
