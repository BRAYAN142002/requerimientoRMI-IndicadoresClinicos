
package servidor.DTO;

/**
 *
 * @author brayan
 */
public class AlertaDTO {
    private FechaHoraDTO objFechaHora;
    private int puntuacion;

    public AlertaDTO(FechaHoraDTO objFechaHora, int puntuacion) {
        this.objFechaHora = objFechaHora;
        this.puntuacion = puntuacion;
    }

    public FechaHoraDTO getObjFechaHora() {
        return objFechaHora;
    }

    public void setObjFechaHora(FechaHoraDTO objFechaHora) {
        this.objFechaHora = objFechaHora;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
  
  
}
