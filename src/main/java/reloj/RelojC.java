/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reloj;

    import java.time.LocalDate;


public class RelojC {
    private LocalDate dia;
    private LocalDate hora;
    private String modelo;
    private long nroSerie;

    public RelojC(LocalDate dia, LocalDate hora, String modelo, long nroSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.nroSerie = nroSerie;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(long nroSerie) {
        this.nroSerie = nroSerie;
    }

    @Override
    public String toString() {
        return "Reloj{" + "dia=" + dia + ", hora=" + hora + ", modelo=" + modelo + ", nroSerie=" + nroSerie + '}';
    }
    
    public void incrementarDia(){
        
    }
}

