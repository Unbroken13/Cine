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

    public void pedirNombreYApe(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido  = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", mail=" + mail + ", telefono=" + telefono + '}';
    }
    
    
    
    


}
