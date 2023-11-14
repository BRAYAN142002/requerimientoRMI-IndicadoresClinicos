/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.Repositorios;

import java.util.LinkedList;
import servidor.DTO.NotificacionDTO;

/**
 *
 * @author brayan
 */
public class NotificacionRepositoryImpl implements NotificacionRepositoryInt {
    private LinkedList<NotificacionDTO> notificaciones;

    public NotificacionRepositoryImpl() {
        this.notificaciones = new LinkedList();
    }
    
    @Override
    public void guardarNotificacion(NotificacionDTO objNotificicacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
