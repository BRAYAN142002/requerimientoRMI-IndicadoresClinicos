

package servidorNotificaciones.controladores;


import java.rmi.Remote;
import java.rmi.RemoteException;
import servidor.DTO.NotificacionDTO;

/**
 *
 * @author brayan
 */
public interface ControladorGestorNotificacionInt extends Remote {
     public boolean enviarNotifacion(NotificacionDTO objNotificacion)throws RemoteException;
}
