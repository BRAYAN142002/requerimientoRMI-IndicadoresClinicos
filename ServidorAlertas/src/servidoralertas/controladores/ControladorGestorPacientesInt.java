/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoralertas.controladores;

import java.rmi.Remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import servidoralertas.DTO.IndicadoresDTO;
import servidorNotificaciones.DTO.PacienteDTO;
/**
 *
 * @author brayan
 */
public interface ControladorGestorPacientesInt extends Remote{
      public void enviarIndicadores(IndicadoresDTO objIndicadores) throws RemoteException;
}
