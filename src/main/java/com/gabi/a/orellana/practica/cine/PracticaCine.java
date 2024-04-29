/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gabi.a.orellana.practica.cine;

import java.util.Scanner;
import logica.Pelicula;

/**
 *
 * @author GABI
 */
public class PracticaCine {

    public static void main(String[] args) {
        
        Pelicula peli1;
        Scanner sc = new Scanner(System.in);
        
        String respuesta;
        int opcion;
        boolean centinela = false;

        
        System.out.println("**********Bienvenido a The Last Cinema");
        System.out.println("¿Qué pelicula desea ver?");

        System.out.println("1. El Planeta de los Simios: Nuevo Reino");
        System.out.println("2. DeadPool y Wolwerine");
        System.out.println("3. Godzilla x Kong: El nuevo Imperio");
        System.out.println("4. KungFu Panda 4");
        System.out.println("9. salir");

        System.out.println("Por favor eliga su pelicula: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                peli1 = new Pelicula("El Planeta de los Simios: Nuevo Reino", true);
                
                break;

            case 2:
                peli1 = new Pelicula("DeadPool y Wolwerine", true);
                break;

            case 3:
                peli1 = new Pelicula("Godzilla x Kong: El nuevo Imperio", false);
                break;

            case 4:
                peli1 = new Pelicula("KungFu Panda 4", false);
                break;

            case 5:
            //  break;

            default:
                throw new AssertionError();
        }


        
        peli1.crearAsientos(peli1.isEsPremium());
        System.out.println("Exelente elección.");
        System.out.println("La película elegida es: " + peli1.getNombre());
        System.out.println(peli1.isEsPremium());
        while (centinela != true) {

            peli1.mapaAsientos();
            //System.out.println("Por favor, indique la fila (0 - 9): ");
            System.out.println(peli1.cantidadDeFilas(peli1.isEsPremium()));
            peli1.setFila( sc.nextInt() );
            
            System.out.println("Por favor, indique el asiento (0 - 9): ");
            peli1.setAsiento( sc.nextInt() );
           
           
           
            peli1.compararAsientos(peli1.getFila(), peli1.getFila());
            
            System.out.println("¿Desea terminar las reservas?");
            System.out.println("S: sí; cualquier otra tecla: NO ");
            respuesta = sc.next();

            if (respuesta.equalsIgnoreCase("S")) {
                centinela = true;
            }
        }
        
    }
}
