/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoralertas.repositorios;

import java.util.ArrayList;
import servidor.DTO.AlertaDTO;
import servidor.DTO.IndicadoresDTO;
import servidor.DTO.NotificacionDTO;


/**
 *
 * @author brayan
 */
public interface PacienteRepositorioInt {
   IndicadoresDTO GuardarIndicadores(IndicadoresDTO objIndicadores);
  void guardarInformacionArchivo(IndicadoresDTO objIndicadores,NotificacionDTO objNotificacionint,int puntuacion); 
   ArrayList<AlertaDTO> leerInformacionArchivo(int numhabitacion);
    void guardarNotificacion(NotificacionDTO objNotificacion);
}
