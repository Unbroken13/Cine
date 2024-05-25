package logica;

// @author GABI

import java.util.List;

public class Sala {
    
    private String numeroDeSala;
    private int fila, asiento;
    private char asientos [][];
    private Pelicula pelicula;

    public Sala() {
    }
    
    
    
    
    public Sala(Pelicula pelicula, String numeroDeSala) {
        this.pelicula = pelicula;
        this.numeroDeSala = numeroDeSala;
    }
   
    public void crearAsientos(boolean premium){
       if (pelicula.isEsPremium()) {
           asientos = new char [20][20];
           
             for (int f = 0; f < asientos.length; f++) {
                    for (int c = 0; c < asientos.length; c++) {
                        asientos[f][c] = 'L';
                    }
                } 
        }
       else  {
           asientos = new char [10][10];
             for (int f = 0; f < asientos.length; f++) {
                for (int c = 0; c < asientos.length; c++) {
                    asientos[f][c] = 'L';
                }
            }
        }
    }
    
     /**
    * El método mapaAsientos() dibuja en consola tanto los asientos 'L' (libres) como los
    * asientos 'X' (ocupados) para que el usuario pueda visualizarlos y poder elegir
    * con mayor facilidad qué espacio desea reservar.
    **/
    public void mapaAsientos(){
        for (int f = 0; f < asientos.length; f++) {
            System.out.print("fila " + f + "  ");
            for (int c = 0; c < asientos.length; c++) {
                System.out.print("[" + asientos[f][c] + "]");
            }
            System.out.println("");
        }
    }
    
    
    /**
    ** El método compararAsientos() recibe como parámetro la fila y el asiento elegido
    *  por el usuario. En caso de que el asiento seleccionado contenga un espacio libre 
    * 'L' entonces este método sustituye la 'L' por una 'X' indicado que el espacio ya no
    *  está disponible, y le indica al usuario que el asiento pudo ser reservado.
    * En caso de que el espacio ya haya sido ocupado con anterioridad, el método
    * le indica al usuario que no se pudo reservar por dicho motivo.
    **/
    public void reservarAsientos(int fila, int asiento){
        if (asientos[fila][asiento] == 'L') {           
            asientos[fila][asiento] = 'X' ;
            System.out.println("El asiento fue reservado con éxito.");
        } else {
            System.out.println("Lo lamento, el asiento ya está reservado.");
        }
    }

    /**
    * El método cantidadDeFilas() devuelve un String para indicarle
    * al usuario si tiene filas disponibles desde el 1-20, si la película es Premium
    * o del 1-10 si la película NO es premium.
    **/
    public String cantidadDeFilas (boolean esPremium){
        if (esPremium){
            return "Por favor, indique la fila (0 - 19):";
        } else {
            return "Por favor, indique la fila (0 - 1):";
        }     
    }
    
    public char[][] getAsientos() {
        return asientos;
    }
    

    public void setAsientos(char[][] asientos) {
        this.asientos = asientos;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Sala{" + "numeroDeSala=" + numeroDeSala + ", fila=" + fila + ", asiento=" + asiento + '}';
    }

}
