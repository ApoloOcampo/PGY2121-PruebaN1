package prueba1;
import java.util.Date;
import prueba1.DTO.usuario;

public class main {

    public static void main(String[] args) {

        usuario user1 = new usuario();
        user1.setId(1);
        user1.setNombreCompleto("Apolo Ocampo Rios");
        user1.setRut(19019444,'2');
        user1.setFechaNacimiento(new Date());
        user1.setTelefono("982368710");
        user1.setEmail("ap.ocampo@duocuc.cl");
        user1.setNombreUsuario("apocampo");
        user1.setContrasena("123456789");
        
        System.out.println(user1.getFechaNacimiento());
    }
}
