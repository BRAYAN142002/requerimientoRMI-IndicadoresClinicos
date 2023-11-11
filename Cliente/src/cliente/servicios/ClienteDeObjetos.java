package cliente.servicios;

import cliente.utilidades.UtilidadesRegistroC;
import cliente.vista.Menu;
import java.text.ParseException;
import servidor.controladores.ControladorGestorPacientesInt;

public class ClienteDeObjetos
{

    private static ControladorGestorPacientesInt objRemoto;

    public static void main(String[] args)
    {
        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";        

        

        objRemoto =  (ControladorGestorPacientesInt) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry,numPuertoRMIRegistry, "objServicioGestionPacientes"  );
        Menu objMenu= new Menu(objRemoto);
        objMenu.ejecutarMenuPrincipal();

    }
	
}

