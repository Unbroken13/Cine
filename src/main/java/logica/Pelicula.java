package logica;

// @author GABI

public class Pelicula {
    
    private String nombre;
    private String director;
    private String duración;
    private int valor;
    private boolean esPremium;
    
    
    //CONSTRUCTORES
    public Pelicula() {
    }

    public Pelicula(String nombre, boolean esPremium) {
        this.nombre = nombre;
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
    

}
