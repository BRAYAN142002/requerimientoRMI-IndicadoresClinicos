
package servidor.servicios;


import servidor.utilidades.UtilidadesRegistroS;
import servidor.utilidades.UtilidadesConsola;
import java.rmi.RemoteException;
import servidor.DTO.NotificacionDTO;
import servidorNotificaciones.controladores.ControladorGestorNotificacionImpl;
/**
 *
 * @author brayan
 */
public class ServidorDeObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws RemoteException {
       int numPuertoRMIRegistry = 0;
       String direccionIpRMIRegistry = "";
       System.out.println("Cual es el la dirección ip donde se encuentra  el rmiRegistry ");
        direccionIpRMIRegistry = UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiRegistry ");
        numPuertoRMIRegistry = UtilidadesConsola.leerEntero(); 
     
       NotificacionDTO objRepository = new NotificacionDTO();
        ControladorGestorNotificacionImpl objRemoto = new ControladorGestorNotificacionImpl(objRepository);//se leasigna el puerto de escucha del objeto remoto
        
        try
        {
           UtilidadesRegistroS.arrancarNS(numPuertoRMIRegistry);
           UtilidadesRegistroS.RegistrarObjetoRemoto(objRemoto, direccionIpRMIRegistry, numPuertoRMIRegistry, "objGestorNotificaciones");            
           
        } catch (Exception e)
        {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" +  e.getMessage());
        } 
    }
    
}
