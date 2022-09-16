package prueba1.DTO;

import java.util.Date;

public class usuario {
    
    private int Id;
    private String NombreCompleto;
    private int Rut;
    private String Dv;
    private Date FechaNacimiento;
    private int Telefono;
    private String Email;
    private String NombreUsuario;
    private String Contrasena;
    
    public usuario(){
        this.Id = 0;
        this.NombreCompleto = "";
        this.Rut = 0;
        this.Dv = "";
        this.FechaNacimiento = new Date();
        this.Telefono = 0;
        this.Email = "";
        this.NombreUsuario = "";
        this.Contrasena = "";
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int rut, char dv) {
        if (this.validarRut(rut, dv)) {
            this.Rut = rut;
            this.Dv = dv + "";
        }
    }

    public String getDv() {
        return Dv;
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        if(Telefono > 99999999){
            this.Telefono = Telefono;
        }
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        if(Email.contains("@") && (Email.contains(".com") && (Email.contains(".cl"))))
            this.Email = Email;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        if(NombreUsuario.length() >= 4){
            this.NombreUsuario = NombreUsuario;
        }
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public boolean validarRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }
        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
    private Date ValidarFechaNacimiento(String Fecha){
        Date FechaNacimiento = ValidarFechaNacimiento(Fecha);
        if(FechaNacimiento != null){
            Date actual = new Date();
            int anoNacimiento = FechaNacimiento.getYear();
            int anoActual = actual.getYear();
            if(anoActual - anoNacimiento > 17) {
                return FechaNacimiento;
            }
        }
        System.out.println("Fecha de nacimiento no valido: " + Fecha); 
        return null;
    }
    
}

