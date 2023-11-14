/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoralertas.controladores;

import java.rmi.Remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import servidor.DTO.IndicadoresDTO;
import servidor.DTO.PacienteDTO;
/**
 *
 * @author brayan
 */
public interface ControladorGestorPacientesInt extends Remote{
    public IndicadoresDTO enviarIndicadores(IndicadoresDTO objIndicadores) throws RemoteException;
}
