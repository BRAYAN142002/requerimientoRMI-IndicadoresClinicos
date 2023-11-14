/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoralertas.servicios;
import java.rmi.Remote;
import java.rmi.RemoteException;
import servidorNotificaciones.controladores.ControladorGestorNotificacionInt;
import servidoralertas.controladores.ControladorGestorPacientesImpl;
import servidoralertas.repositorios.PacienteRepositorioImpl;
import servidoralertas.utilidades.UtilidadesConsola;
import servidoralertas.utilidades.UtilidadesRegistroS;
/**
 *
 * @author brayan
 */
public class ServidorDeObjetos {

   private static ControladorGestorNotificacionInt objRemoto;
    public static void main(String[] args) throws RemoteException {
       // seccion del servidor de notificaciones
        
        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";
        
        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiRegistry del servidor Notificaciones ");
        direccionIpRMIRegistry = UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiRegistry del servidor Notificaciones");
        numPuertoRMIRegistry= UtilidadesConsola.leerEntero(); 
        
        objRemoto=(ControladorGestorNotificacionInt)UtilidadesRegistroS.obtenerObjRemoto(direccionIpRMIRegistry, numPuertoRMIRegistry, "objGestorNotificaciones");
        
        //seccion del servidor de alertas
        int numPuertoRMIRegistry2 = 0;
        String direccionIpRMIRegistry2 = "";
        
        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiRegistry el rmiRegistry del servidor Alertas");
        direccionIpRMIRegistry2 = UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiRegistry del servidor Alertas");
        numPuertoRMIRegistry2 = UtilidadesConsola.leerEntero(); 
        
        //crear un repositorio
        PacienteRepositorioImpl objPacienteRepostorio=new  PacienteRepositorioImpl(objRemoto);
        ControladorGestorPacientesImpl objRemotoPaciente =new   ControladorGestorPacientesImpl(objPacienteRepostorio);
        try{
           UtilidadesRegistroS.arrancarNS(numPuertoRMIRegistry2);
           UtilidadesRegistroS.RegistrarObjetoRemoto((Remote)objRemotoPaciente, direccionIpRMIRegistry2, numPuertoRMIRegistry2, "objServicioGestionPacientes");   
        }catch(Exception e){
              System.err.println("No fue posible Arrancar el NS"
                + " o Registrar el objeto remoto" +  e.getMessage());
        }
    }
    
}
