package logica;

// @author GABI
public class Ticket {

    private String nombreApellido;
    private double montoPorAsiento;
    private int cantidaDeAsientos;
    private double montoTotal;

    public Ticket() {
    }
    
    

    public Ticket(String nombreApellido, double montoPorAsiento, int cantidaDeAsientos, double montoTotal) {
        this.nombreApellido = nombreApellido;
        this.montoPorAsiento = montoPorAsiento;
        this.cantidaDeAsientos = cantidaDeAsientos;
        this.montoTotal = montoTotal;
    }

}
