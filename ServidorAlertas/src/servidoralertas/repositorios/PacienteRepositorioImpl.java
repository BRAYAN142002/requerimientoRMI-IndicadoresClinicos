/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoralertas.repositorios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import servidor.DTO.AlertaDTO;
import servidor.DTO.IndicadoresDTO;
import servidor.DTO.NotificacionDTO;
import servidorNotificaciones.controladores.ControladorGestorNotificacionInt;


/**
 *
 * @author brayan
 */
public class PacienteRepositorioImpl implements PacienteRepositorioInt {

    
    int contador=0;
    private NotificacionDTO objNotificacion;
    private ArrayList<IndicadoresDTO> Indicadores;
  private final ControladorGestorNotificacionInt objRemoto;
   
    public PacienteRepositorioImpl(ControladorGestorNotificacionInt objRemoto) {
          this.objRemoto = objRemoto;
           this.Indicadores=new ArrayList<>();
           this.objNotificacion=new NotificacionDTO();
    }
    /*
    public PacienteRepositorioImpl() {
          //this.objRemoto = objRemoto;
           this.Indicadores=new ArrayList<>();
           this.objNotificacion=new NotificacionDTO();
      }*/
   
    
    
 
    
  @Override
    public IndicadoresDTO GuardarIndicadores(IndicadoresDTO objIndicadores) {
        this.Indicadores.add(objIndicadores);
      mostrar(objIndicadores);
     // determinar();
        return objIndicadores;
    }
    
    
    public void mostrar(IndicadoresDTO objIndicadores){
            IndicadoresDTO indicadores=new IndicadoresDTO();
           //indicadores=objIndicadores;
        for(int i=0;i<this.Indicadores.size();i++){
            System.out.println("Habitacion: "+objIndicadores.getObjPaciente().getNoHabitacion());
            System.out.println("nombre: "+objIndicadores.getObjPaciente().getNombres());
            System.out.println("nombre: "+objIndicadores.getObjPaciente().getApellidos());
            System.out.println("edad: "+objIndicadores.getObjPaciente().getEdad());
            System.out.println("frecuenciaCardica: "+objIndicadores.getFrecuenciaCardiaca());
            System.out.println("tension arterial:  "+objIndicadores.getTensionArterialDiastolica());
            System.out.println("tension arterial sistolica: "+objIndicadores.getTensionArterialSistolica());
            System.out.println("frecuencia respiratoria: "+objIndicadores.getFrecuenciaRespiratoria());
            System.out.println("Saturacion de oxigeno: "+objIndicadores.getSaturacionOxigeno());
            System.out.println("temperatura: "+objIndicadores.getTemperatura());
              
        }
            
        
    }
    @Override
    public void guardarInformacionArchivo(IndicadoresDTO objIndicadores, NotificacionDTO objNotificacion,int puntuacion) {
        System.out.println(":"+objIndicadores.getObjPaciente().getNoHabitacion());
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("historialDeAlertas.txt", true))){
            writer.write(objIndicadores.getObjPaciente().getNoHabitacion()+",");
            writer.write(objIndicadores.getObjPaciente().getNombres()+ ",");
            writer.write(objIndicadores.getObjPaciente().getApellidos()+ ",");
            writer.write(objNotificacion.getObjFechaHora().getHoraActual()+ ",");
            writer.write(objNotificacion.getObjFechaHora().getFechaActual()+ ",");
            writer.write(puntuacion + "\n");
        }catch(IOException e){
            System.out.println("Error al abrir el archivo para escritura.");
            e.printStackTrace();
        }
        
    }

    @Override
    public ArrayList<AlertaDTO> leerInformacionArchivo(int numHabitacion) {
       
        int cantidad=0;
        ArrayList<AlertaDTO> listaAlertas = new ArrayList<>();
         ArrayList<AlertaDTO> alertas = new ArrayList<>();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("historialDeAlertas.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int noHabitacion = Integer.parseInt(parts[0]);
                System.out.println("--------");
                System.out.println("habitacion: "+noHabitacion);
                System.out.println("--------");
                if (noHabitacion == numHabitacion) {
                    AlertaDTO alerta = new AlertaDTO();

                   // alerta.getObjPaciente().setNoHabitacion(noHabitacion);
                    alerta.getObjFechaHora().setHoraActual(LocalDateTime.parse(parts[3]));
                    alerta.getObjFechaHora().setFechaActual(LocalDate.parse(parts[4]));
                    alerta.setPuntuacion(Integer.parseInt(parts[5])); // Ajusta el índice si es necesario

                    System.out.println("fecha: "+alerta.getObjFechaHora().fechaActual);
                     System.out.println("hora: "+alerta.getObjFechaHora().horaActual);
                      System.out.println("fecha: "+alerta.getPuntuacion());
                    listaAlertas.add(alerta);

                    
                    System.out.println("--------");
                    System.out.println("Cantidad"+listaAlertas.size());
                    System.out.println("--------");
                    cantidad++;
                   
                }
            }
            if(cantidad>5){
                cantidad=5;
            }
            int pos=0;
            this.contador=cantidad;
            this.objNotificacion.setCantidadAlertas(cantidad);
            
            for (int i = listaAlertas.size() - 1; i >= 0; i--) {
                if(pos<5){
                    alertas.add(listaAlertas.get(i));
                    pos++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return alertas;
    
    }
   @Override
    public void guardarNotificacion(NotificacionDTO objNotificacion){
        
       
      // objNotificacion.setAlertas(leerInformacionArchivo(objNotificacion.getObjPaciente().getNoHabitacion()));
        try {
            this.objRemoto.enviarNotifacion(objNotificacion);
        } catch (RemoteException ex) {
            Logger.getLogger(PacienteRepositorioImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
      @Override
    public int cantida(){
        
        return this.contador;
    }
 
    
}
