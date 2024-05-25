package logica;

// @author GABI

public class Pelicula {
    
    private String nombre;
    private String director;
    private String duracion;
    private int valor;
    private boolean esPremium;
    
    
    //CONSTRUCTORES
    public Pelicula() {
    }

    public Pelicula(String nombre,String director, String duracion , boolean esPremium) {
        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
        this.esPremium = esPremium;
    }
    
    //MÉTODOS

    public void valorPeli (boolean peliPremium){
        if (esPremium) {
             this.valor = 5500;
             System.out.println(valor);
        } else {
            this.valor = 2500;
            System.out.println(valor);
        }
    }
    
    //MÉTODOS SETTERS Y GETTERS:
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean isEsPremium() {
        return esPremium;
    }

    public void setEsPremium(boolean esPremium) {
        this.esPremium = esPremium;
    }

    public String getDirector() {
        return director;
    }

    public String getDuración() {
        return duracion;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", director=" + director + ", duracion=" + duracion + ", valor= $" + valor + '}';
    }
    
    
    

}
