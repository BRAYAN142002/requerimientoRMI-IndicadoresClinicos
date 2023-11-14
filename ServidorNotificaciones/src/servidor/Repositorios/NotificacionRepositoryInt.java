/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.Repositorios;

import servidor.DTO.NotificacionDTO;

/**
 *
 * @author brayan
 */
public interface NotificacionRepositoryInt {
    public void guardarNotificacion(NotificacionDTO objNotificicacion);
}
