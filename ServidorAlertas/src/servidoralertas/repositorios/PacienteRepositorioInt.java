/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoralertas.repositorios;

import servidorNotificaciones.DTO.NotificacionDTO;
import servidoralertas.DTO.IndicadoresDTO;

/**
 *
 * @author brayan
 */
public interface PacienteRepositorioInt {
  void guardarInformacionArchivo(IndicadoresDTO objIndicadores,NotificacionDTO objNotificacion,int puntuacion); 
  NotificacionDTO leerInformacionArchivo(NotificacionDTO objNotificacion,int numhabitacion);
}
