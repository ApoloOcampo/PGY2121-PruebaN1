package prueba1.DTO;

import java.util.Date;

public class suscripcion {
    private int Correlativo;
    private Date FechaInicio;
    private club Club;
    private String Equipo;
    private int TotalPago;
    
    public suscripcion(){
        this.Correlativo = 0;
        this.FechaInicio = new Date();
        this.Club = new club();
        this.Equipo = "";
        this.TotalPago = 0;
    }

    public int getCorrelativo() {
        return Correlativo;
    }

    public void setCorrelativo(int Correlativo) {
        this.Correlativo = Correlativo;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public club getClub() {
        return Club;
    }

    public void setClub(club Club) {
        this.Club = Club;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public int getTotalPago() {
        return TotalPago;
    }

    public void setTotalPago(int TotalPago) {
        this.TotalPago = TotalPago;
    }
    
}
