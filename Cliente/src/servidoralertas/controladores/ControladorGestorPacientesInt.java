

package servidoralertas.controladores;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import servidor.DTO.PacienteDTO;
import servidor.DTO.IndicadoresDTO;



//Hereda de la clase Remote, lo cual la convierte en interfaz remota
public interface ControladorGestorPacientesInt extends Remote
{
    //Definicion del primer método remoto
    public IndicadoresDTO enviarIndicadores(IndicadoresDTO objIndicadores) throws RemoteException;
    //cada definición del método debe especificar que puede lanzar la excepción java.rmi.RemoteException  
}


