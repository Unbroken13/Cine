package logica;

// @author GABI
public class Cliente {
    
    private String nombre, apellido, dni, mail, telefono;

    public Cliente() {
    }
    
    public Cliente(String Nombre, String apellido, String dni, String mail, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.telefono = telefono;
    }
    
    public String nombreCompleto (){
        return nombre + " " + apellido;
    }



}
