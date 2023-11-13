/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoralertas.repositorios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import servidorNotificaciones.DTO.NotificacionDTO;
import servidoralertas.DTO.IndicadoresDTO;

/**
 *
 * @author brayan
 */
public class PacienteRepositorioImpl implements PacienteRepositorioInt {

    @Override
    public void guardarInformacionArchivo(IndicadoresDTO objIndicadores, NotificacionDTO objNotificacion, int puntuacion) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("historialDeAlertas.txt", true))){
            writer.write(objIndicadores.getObjPaciente().getNoHabitacion()+",");
            writer.write(objIndicadores.getObjPaciente().getNombres()+ ",");
            writer.write(objIndicadores.getObjPaciente().getApellidos()+ ",");
            /*
            writer.write(objNotificacion.objHora1.getHour() + ",");
            writer.write(String.format("%02d,", objNotificacion.objHora1.getMinute()));
            writer.write(String.format("%02d,", objNotificacion.objFecha1.getDayOfMonth()));
            writer.write(String.format("%02d,", objNotificacion.objFecha1.getMonthValue()));
            writer.write(String.format("%02d,", objNotificacion.objFecha1.getYear()));
            writer.write(puntuacion + "\n");
*/
        }catch(IOException e){
            System.out.println("Error al abrir el archivo para escritura.");
            e.printStackTrace();
        }
    }

    @Override
    public NotificacionDTO leerInformacionArchivo(NotificacionDTO objNotificacion, int numhabitacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
