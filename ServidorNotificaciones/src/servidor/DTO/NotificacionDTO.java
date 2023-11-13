
package servidor.DTO;

/**
 *
 * @author brayan
 */
public class NotificacionDTO {
   private FechaHoraDTO objFechaHora;
   private PacienteDTO objPaciente ;
   private IndicadoresDTO objIndicador;
   private AlertaDTO[] objAlerta=new AlertaDTO[5];
   private String mensaje;
   private int cantidadAlertas;

    public NotificacionDTO(FechaHoraDTO objFechaHora, PacienteDTO objPaciente, IndicadoresDTO objIndicador, String mensaje, int cantidadAlertas) {
        this.objFechaHora = objFechaHora;
        this.objPaciente = objPaciente;
        this.objIndicador = objIndicador;
        this.mensaje = mensaje;
        this.cantidadAlertas = cantidadAlertas;
    }
    public NotificacionDTO(){
        
    }

  
   
    public FechaHoraDTO getObjFechaHora() {
        return objFechaHora;
    }

    public void setObjFechaHora(FechaHoraDTO objFechaHora) {
        this.objFechaHora = objFechaHora;
    }

    public PacienteDTO getObjPaciente() {
        return objPaciente;
    }

    public void setObjPaciente(PacienteDTO objPaciente) {
        this.objPaciente = objPaciente;
    }

    public IndicadoresDTO getObjIndicador() {
        return objIndicador;
    }

    public void setObjIndicador(IndicadoresDTO objIndicador) {
        this.objIndicador = objIndicador;
    }

    public AlertaDTO[] getObjAlerta() {
        return objAlerta;
    }

    public void setObjAlerta(AlertaDTO[] objAlerta) {
        this.objAlerta = objAlerta;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getCantidadAlertas() {
        return cantidadAlertas;
    }

    public void setCantidadAlertas(int cantidadAlertas) {
        this.cantidadAlertas = cantidadAlertas;
    }
    
     
    
         
}
