package logica;

// @author GABI
public class Pago {

    //Cliente cliente = new Cliente();
    Ticket elTicket = new Ticket();
    private int montoTotal;
    private boolean confirmacion;
    //private int cantidadAsientosComprados;
    
    public void resumenPedido(String nombre, String pelicula) {

        System.out.println("***************** Resumen*****************");
        System.out.println(nombre + ", usted va a asistir a la pelicula: " + pelicula);
        System.out.print(" Va a comprar ");
        System.out.println(elTicket.getCantidaDeAsientos() + " asiento/s.");
   }

    public void pedirConfirmacionPedido(boolean confirmacion) {
        if (!confirmacion) {
            System.out.println("Pedido ANULADO.");
        } else {
            pedidoCancelado();
        }
    }

    public void pedidoCancelado() {
        System.out.println("Pedido CONFIRMADO.");
    }

    public Ticket pedidoConfirmado(Cliente cliente,Pelicula pelicula, Sala sala, int cantEntradas, int total) {

        elTicket = new Ticket(cliente, pelicula,sala, cantEntradas);
        return elTicket;
    }

    public boolean isConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(boolean confirmacion) {
        this.confirmacion = confirmacion;
    }

    /*
    public int getCantidadAsientosComprados() {
        return cantidadAsientosComprados;
    }

    public void setCantidadAsientosComprados(int cantidadAsientosComprados) {
        this.cantidadAsientosComprados = cantidadAsientosComprados;
    }
    */
    
    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int valorEntrada, int cantDeEntradas) {
        this.montoTotal = valorEntrada * cantDeEntradas;
    }
    
    

}
