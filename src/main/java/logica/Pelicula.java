package logica;

// @author GABI

public class Pelicula {
    
    private String nombre;
    private int fila, asiento;
    private boolean esPremium;
    private boolean centinela;
    private char asientos [][];

    //CONSTRUCTORES
    public Pelicula() {
    }

    public Pelicula(String nombre, boolean esPremium) {
        this.nombre = nombre;
        this.esPremium = esPremium;
    }
    
    //MÉTODOS
    
    /**
    ** El método crearAsientos() crea asientos teniendo en cuenta una condición:
    ** Si la película elegida es Premium, entonces crea una matríz de 20x20 asientos.
    ** Si la película NO es Premium, entonces crea una matriz de 10x10 asientos.
    ** En ambos casos, sea Premium o no, Asigna la leta 'L' en cada espacio, donde representa
    ** que ese espacio esta LIBRE. 
    **/
    public void crearAsientos(boolean premium){
       if (esPremium) {
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
    ** El método cantidadDeFilas() devuelve un String para indicarle
    ** al usuario si tiene filas disponibles desde el 1-20, si la película es Premium
    ** o del 1-10 si la película NO es premium.
    ** 
    ** 
    **/
    public String cantidadDeFilas (boolean esPremium){
        if (esPremium){
            return "Por favor, indique la fila (0 - 19):";
        } else {
            return "Por favor, indique la fila (0 - 1):";
        }
        
    }
    
    
     /**
    ** El método compararAsientos() recibe como parámetro la fila y el asiento elegido
    **  por el usuario. En caso de que el asiento seleccionado contenga un espacio libre 
    ** 'L' entonces este método sustituye la 'L' por una 'X' indicado que el espacio ya no
    **  está disponible, y le indica al usuario que el asiento pudo ser reservado.
    ** En caso de que el espacio ya haya sido ocupado con anterioridad, el método
    ** le indica al usuario que no se pudo reservar por dicho motivo.
    **/
    public void compararAsientos(int fila, int asiento){
        if (asientos[fila][asiento] == 'L') {           
            asientos[fila][asiento] = 'X' ;
            System.out.println("El asiento fue reservado con éxito.");
        } else {
            System.out.println("Lo lamento, el asiento ya está reservado.");
        }

    }
  
    /**
    * El método mapaAsientos() dibuja en consola tanto los asientos 'L' (libres) como los
    * asientos 'X' (ocupados) para que el usuario pueda visualizarlos y poder elegir
    * con mayor facilidad qué espacio desea reservar.
    **/
    public void mapaAsientos(){
        for (int f = 0; f < asientos.length; f++) {
            System.out.print("fila " + (f + 1) + "  ");
            for (int c = 0; c < asientos.length; c++) {
                System.out.print("[" + asientos[f][c] + "]");
            }
            System.out.println("");
        }
    }
    
    
    //MÉTODOS SETTERS Y GETTERS:
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public boolean isEsPremium() {
        return esPremium;
    }

    public void setEsPremium(boolean esPremium) {
        this.esPremium = esPremium;
    }

    public boolean isCentinela() {
        return centinela;
    }

    public void setCentinela(boolean centinela) {
        this.centinela = centinela;
    }

}
