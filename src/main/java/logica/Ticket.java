package logica;

// @author GABI

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private Cliente cliente;
    private Pelicula pelicula;
    private Sala sala;
    private int cantidaDeAsientos;
    //private double montoTotal;
    //private double montoPorAsiento;
    public Ticket() {
    }

    public Ticket(Cliente cliente,Pelicula pelicula, Sala sala,int cantidaDeAsientos) {
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.sala = sala;
        this.cantidaDeAsientos = cantidaDeAsientos;
        // this.montoPorAsiento = montoPorAsiento;
        //this.montoTotal = montoTotal;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }


    public int getCantidaDeAsientos() {
        return cantidaDeAsientos;
    }

    public void setCantidaDeAsientos(int cantidaDeAsientos) {
        this.cantidaDeAsientos = cantidaDeAsientos;
    }

    /*
    public double getMontoPorAsiento() {
        return montoPorAsiento;
    }

    public void setMontoPorAsiento(double montoPorAsiento) {
        this.montoPorAsiento = montoPorAsiento;
    }

    
    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double cantidaDeAsientos, double valorEntrada) {
        this.montoTotal = cantidaDeAsientos + valorEntrada;
    }
*/

    @Override
    public String toString() {
        return "Ticket{" + "cliente=" + cliente + ", pelicula=" + pelicula + ", sala=" + sala + ", cantidaDeAsientos=" + cantidaDeAsientos + '}';
    }
    
    
    

    

}
