package logica;

// @author GABI

import java.util.Scanner;

public class Logica {
    
    Pelicula peli1;
        Sala sala1;
        Scanner sc = new Scanner(System.in);
        
        String respuesta;
        int opcion;
        boolean centinela = false;

        public void inicial (){
            System.out.println("**********Bienvenido a The Last Cinema**********");
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
                peli1 = new Pelicula("El Planeta de los Simios: Nuevo Reino", true);
                sala1 = new Sala(peli1);
                break;

            case 2:
                peli1 = new Pelicula("DeadPool y Wolwerine", true);
                sala1 = new Sala(peli1);
                break;

            case 3:
                peli1 = new Pelicula("Godzilla x Kong: El nuevo Imperio", false);
                sala1 = new Sala(peli1);
                break;

            case 4:
                peli1 = new Pelicula("KungFu Panda 4", false);
                sala1 = new Sala(peli1);
                break;

            case 5:
            //  break;

            default:
                throw new AssertionError();
        }


        
        sala1.crearAsientos(peli1.isEsPremium());
        System.out.println("Exelente elección.");
        System.out.println("La película elegida es: " + peli1.getNombre());
        System.out.print("El valor por asiento es: $" );
        peli1.valorPeli( peli1.isEsPremium() ) ;

        
        int AsientosAReservar;
        System.out.println("¿Cuántos asientos quieres reservar?");
        AsientosAReservar = sc.nextInt();

        
        for (int i = 0; i < AsientosAReservar ; i++) {
            System.out.println("Asiento n " + (i + 1) );
            sala1.mapaAsientos();
            
            //System.out.println("Por favor, indique la fila (0 - 9): ");
            System.out.println(sala1.cantidadDeFilas(peli1.isEsPremium()));
            sala1.setFila( sc.nextInt() );
            
            System.out.println("Por favor, indique el asiento (0 - 9): ");
            sala1.setAsiento( sc.nextInt() );
           
           
           
            sala1.reservarAsientos(sala1.getFila(), sala1.getAsiento());
            /*
            System.out.println("¿Desea terminar las reservas?");
            System.out.println("S: sí; cualquier otra tecla: NO ");
            respuesta = sc.next();

            if (respuesta.equalsIgnoreCase("S")) {
                centinela = true;
            }
            */
            
        }
        }
        

}
