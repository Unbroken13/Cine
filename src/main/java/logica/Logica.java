package logica;

// @author GABI
import java.util.Scanner;

public class Logica {

    Pelicula peli1;
    Sala sala1;
    Cliente cliente;
    Pago pago;
    Ticket ticket;
    Scanner sc = new Scanner(System.in);

    String respuesta;
    int opcion;
    boolean centinela = false;

    public void inicial() {

        System.out.println("**********Bienvenido a The Last Cinema**********");
        //Pedir Nombre y apellido del cliente
        cliente = new Cliente();
        System.out.println("Por favor: ingresá tu nombre: ");
        String nombre = sc.next();
        cliente.setNombre(nombre);
        // System.out.println(cliente.getNombre());
        //cliente.getNombre();

        System.out.println("Muchas gracias. Ahora ingrese, por favor, su apellido: ");
        String apellido = sc.next();
        cliente.setApellido(apellido);
        //System.out.println(cliente.getApellido());

        // MOSTRAR CATÁLOGO DE PELÍCULAS.
        System.out.println("¿Qué pelicula desea ver?");

        System.out.println("1. El Planeta de los Simios: Nuevo Reino. Valor: $5.500");
        System.out.println("2. DeadPool y Wolwerine. Valor: $5.500");
        System.out.println("3. Godzilla x Kong: El nuevo Imperio. Valor: $2.500");
        System.out.println("4. KungFu Panda 4. Valor: $2.500");
        System.out.println("9. salir");

        System.out.println("Por favor eliga su pelicula: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                peli1 = new Pelicula("El Planeta de los Simios: Nuevo Reino", "Wes Ball", "145 min", true);
                sala1 = new Sala(peli1, "1");
                break;

            case 2:
                peli1 = new Pelicula("DeadPool y Wolwerine", "Shawn Levy", "127 min", true);
                sala1 = new Sala(peli1, "2");
                break;

            case 3:
                peli1 = new Pelicula("Godzilla x Kong: El nuevo Imperio", "Adam Windgard", "115 min", false);
                sala1 = new Sala(peli1, "3");
                break;

            case 4:
                peli1 = new Pelicula("KungFu Panda 4", "Mike Mitchell", "94 min", false);
                sala1 = new Sala(peli1, "4");
                break;

            case 5:
            //  break;

            default:
                throw new AssertionError();
        }

        sala1.crearAsientos(peli1.isEsPremium());
        System.out.println("Exelente elección.");
        System.out.println("La película elegida es: " + peli1.getNombre());
        System.out.println("Su director es " + peli1.getDirector() + " y su duración es de " + peli1.getDuración());
        System.out.print("El valor por asiento es: $");
        peli1.valorPeli(peli1.isEsPremium());

        //pago = new Pago();
        ticket = new Ticket();

        //PREGUNTAMOS CANTIDAD DE ENTRADAS A COMPRAR
        int AsientosAReservar;

        System.out.println("¿Cuántos asientos quieres reservar?");
        AsientosAReservar = sc.nextInt();
        //pago.setCantidadAsientosComprados(AsientosAReservar);
        ticket.setCantidaDeAsientos(AsientosAReservar);

        //pago.montoTotal(peli1.getValor(), pago.getCantidadAsientosComprados());
        pago = new Pago();
        pago.setMontoTotal(peli1.getValor(), ticket.getCantidaDeAsientos());

        for (int i = 0; i < AsientosAReservar; i++) {
            System.out.println("Asiento n " + (i + 1));
            sala1.mapaAsientos();

            //System.out.println("Por favor, indique la fila (0 - 9): ");
            System.out.println(sala1.cantidadDeFilas(peli1.isEsPremium()));
            sala1.setFila(sc.nextInt());

            System.out.println("Por favor, indique el asiento (0 - 9): ");
            sala1.setAsiento(sc.nextInt());

            sala1.reservarAsientos(sala1.getFila(), sala1.getAsiento());

        }
        System.out.println("Fila: " + sala1.getFila());
        System.out.println("asiento: " + sala1.getAsiento());

        pago.resumenPedido(cliente.getNombre(), peli1.getNombre());

        System.out.println("¿Desea confirmar el pedido? S: confimar, N: negar ");
        char confirmacion = sc.next().charAt(0);

        while (confirmacion != 'n' && confirmacion != 's') {
            System.out.println("Error, opción no valida. Por favor eliga una opción valida.");
            System.out.println("¿Desea confirmar el pedido? S: confimar, N: negar ");
            confirmacion = sc.next().charAt(0);
        }

        if (confirmacion == 'n') {
            pago.setConfirmacion(false);
            pago.pedirConfirmacionPedido(pago.isConfirmacion());
        } else {
            pago.setConfirmacion(true);
            pago.pedirConfirmacionPedido(pago.isConfirmacion());
        }

        if (pago.isConfirmacion()) {
            System.out.println("Por favor ingrese su DNI sin puntos. Ej: 37099765 ");
            respuesta = sc.next();
            cliente.setDni(respuesta);
            System.out.println("Por favor, ingrese su mail. Ej: ejempli@ejemplo.com ");
            respuesta = sc.next();
            cliente.setMail(respuesta);
            System.out.println("Por favor, ingrese un teléfono de contacto sin 0 ni guiones. Ej 1158867634: ");
            respuesta = sc.next();
            cliente.setTelefono(respuesta);

            Ticket ticketGenerado = pago.pedidoConfirmado(cliente, peli1, sala1, ticket.getCantidaDeAsientos(), pago.getMontoTotal());

            System.out.println(ticketGenerado);
            //System.out.println( pago.pedidoConfirmado(cliente ,pago.getCantidadAsientosComprados(), peli1.getValor() , pago.montoTotal(pago.getCantidadAsientosComprados(), peli1.getValor() ) ) ;
        }

    }
}
