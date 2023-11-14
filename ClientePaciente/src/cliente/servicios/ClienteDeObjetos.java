/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.servicios;

import cliente.utilidades.UtilidadesRegistroC;
import cliente.vista.Menu;
import servidoralertas.controladores.ControladorGestorPacientesInt;

/**
 *
 * @author brayan
 */
public class ClienteDeObjetos {

     private static ControladorGestorPacientesInt objRemoto;
    public static void main(String[] args) {
        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";


        
        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiregistry ");
        direccionIpRMIRegistry = cliente.utilidades.UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiregistry ");
        numPuertoRMIRegistry = cliente.utilidades.UtilidadesConsola.leerEntero(); 
        
        objRemoto =  (ControladorGestorPacientesInt) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry,numPuertoRMIRegistry, "objServicioGestionPaciente");
        Menu objMenu= new Menu(objRemoto);
        objMenu.ejecutarMenuPrincipal();
    }
    
}
