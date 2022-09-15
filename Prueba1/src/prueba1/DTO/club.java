package prueba1.DTO;

import java.util.Date;

public class club {
    private String Nombre;
    private String NombreFundador;
    private Date AnoFundacion;
    private String PaisOrigen;
    private String Lema;
    private String Color;
    private int ValorSuscripcion;
    
    public club(){
        this.Nombre = "";
        this.NombreFundador = "";
        this.AnoFundacion = new Date();
        this.PaisOrigen = "";
        this.Lema = "";
        this.Color = "";
        this.ValorSuscripcion = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombreFundador() {
        return NombreFundador;
    }

    public void setNombreFundador(String NombreFundador) {
        this.NombreFundador = NombreFundador;
    }

    public Date getAnoFundacion() {
        return AnoFundacion;
    }

    public void setAnoFundacion(Date AnoFundacion) {
        this.AnoFundacion = AnoFundacion;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(int ValorSuscripcion) {
        this.ValorSuscripcion = ValorSuscripcion;
    }
    
}
