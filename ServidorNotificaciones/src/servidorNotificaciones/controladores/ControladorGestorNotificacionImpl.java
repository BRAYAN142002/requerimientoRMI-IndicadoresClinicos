
package servidorNotificaciones.controladores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import servidor.DTO.NotificacionDTO;
/**
 *
 * @author brayan
 */
public class ControladorGestorNotificacionImpl extends UnicastRemoteObject implements ControladorGestorNotificacionInt  {

    private final NotificacionDTO objNotificacion;

    public ControladorGestorNotificacionImpl(NotificacionDTO objNotificacion) throws RemoteException {
        super();//se asigna un puerto de escucha al OR
        this.objNotificacion = objNotificacion;
    }
    
    @Override
    public boolean enviarNotifacion(NotificacionDTO objNotificacion) throws RemoteException {
      // LocalDateTime fechaHora = LocalDateTime.now();

        // Formateo de fecha y hora
       // DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       // DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        
        
        boolean bandera=false;
        System.out.println("");
        System.out.println("*********************Alerta Generada****************");
        System.out.println("No de habitación: "+objNotificacion.getObjPaciente().getNoHabitacion());
        System.out.println("Nombres y apellidos: "+objNotificacion.getObjPaciente().getNombres()
                           +" "+objNotificacion.getObjPaciente().getApellidos());
        System.out.println("Edad: "+objNotificacion.getObjPaciente().getEdad());
        System.out.println("Hora de la alerta: "+objNotificacion.getObjFechaHora().horaActual);
        System.out.println("Fecha de la alerta: "+objNotificacion.getObjFechaHora().fechaActual);
        System.out.println("-------------------------------------------------------");
        System.out.println("   Indicadores que generaron a alerta   ");
        System.out.println("-------------------------------------------------------");
        System.out.println("Nombre del Indicador        | Valor |");
        System.out.println("-------------------------------------------------------");
        if(objNotificacion.getObjIndicador().getFrecuenciaCardiaca()>=1)
            System.out.println("Frecuencia Cardiaca: "+objNotificacion.getObjIndicador().getFrecuenciaCardiaca());
        
        if(objNotificacion.getObjIndicador().getTensionArterialSistolica()>=1)
            System.out.println("Presion arterial Sistolica: "+objNotificacion.getObjIndicador().getTensionArterialSistolica());
        
        if(objNotificacion.getObjIndicador().getTensionArterialDiastolica()>=1)
            System.out.println("Presion arterial Diastolica: "+objNotificacion.getObjIndicador().getTensionArterialDiastolica());
        
        if(objNotificacion.getObjIndicador().getFrecuenciaRespiratoria()>=1)
            System.out.println("Frecuencia Respiratorio: "+objNotificacion.getObjIndicador().getFrecuenciaRespiratoria());
        
        if(objNotificacion.getObjIndicador().getSaturacionOxigeno()>=1)
            System.out.println("Saturacion de Oxigeno: "+objNotificacion.getObjIndicador().getSaturacionOxigeno());
        
        if(objNotificacion.getObjIndicador().getTemperatura()>=1)
            System.out.println("Temperatura: "+objNotificacion.getObjIndicador().getTemperatura());
        
        
        System.out.println("");
        System.out.println("\t"+objNotificacion.getMensaje());
        System.out.println("");
        System.out.println("ultimas "+objNotificacion.getCantidadAlertas()+" alertas paciente");
        System.out.println("");
        System.out.println("|--------------------------------------------------------------|");
        System.out.println("|Fecha de la alerta | Hora de la alerta | Puntuacion|");
        System.out.println("|--------------------------------------------------------------|");
        for(int indice =0;indice<objNotificacion.getCantidadAlertas();indice++){
            
            System.out.print("|"+objNotificacion.getAlertas().get(indice).getObjFechaHora().fechaActual);
            System.out.print("|"+objNotificacion.getAlertas().get(indice).getObjFechaHora().horaActual);
            System.out.println("|"+objNotificacion.getAlertas().get(indice).getPuntuacion());
        }
        bandera=true;
        return bandera;
        
    }
    
}
