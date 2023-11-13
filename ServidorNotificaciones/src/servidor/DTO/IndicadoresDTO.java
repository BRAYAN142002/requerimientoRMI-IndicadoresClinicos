/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.DTO;

/**
 *
 * @author brayan
 */
public class IndicadoresDTO {
    private int frecuenciaCardiaca;
    private int tensionArterialSistolica;
    private int tensionArterialDiastolica;
    private int frecuenciaRespiratoria;
    private int saturacionOxigeno;
    private double temperatura;

    public IndicadoresDTO(int frecuenciaCardiaca, int tensionArterialSistolica, int tensionArterialDiastolica, int frecuenciaRespiratoria, int saturacionOxigeno, double temperatura) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.tensionArterialSistolica = tensionArterialSistolica;
        this.tensionArterialDiastolica = tensionArterialDiastolica;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.saturacionOxigeno = saturacionOxigeno;
        this.temperatura = temperatura;
    }

    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public int getTensionArterialSistolica() {
        return tensionArterialSistolica;
    }

    public void setTensionArterialSistolica(int tensionArterialSistolica) {
        this.tensionArterialSistolica = tensionArterialSistolica;
    }

    public int getTensionArterialDiastolica() {
        return tensionArterialDiastolica;
    }

    public void setTensionArterialDiastolica(int tensionArterialDiastolica) {
        this.tensionArterialDiastolica = tensionArterialDiastolica;
    }

    public int getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(int frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public int getSaturacionOxigeno() {
        return saturacionOxigeno;
    }

    public void setSaturacionOxigeno(int saturacionOxigeno) {
        this.saturacionOxigeno = saturacionOxigeno;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    
}
