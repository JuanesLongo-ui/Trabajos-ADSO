/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladorcarrera;

import java.util.Scanner;

/**
 *
 * @author longo
 */
public class SimuladorCarrera {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== SIMULADOR DE CARRERAS (1000 metros) =====");

        // se crean los dos competidores
        Vehiculo v1 = crearVehiculo(scanner, 1);
        Vehiculo v2 = crearVehiculo(scanner, 2);

        // se inicia la carrera
        System.out.println();
        Carrera carrera = new Carrera(v1, v2);
        carrera.iniciar();

        scanner.close();

    }

    // pide el tipo y el nombre del competidor y devuelve el vehiculo creado
    public static Vehiculo crearVehiculo (Scanner scanner, int numero) {

        int opcion = 0;

        while (opcion != 1 && opcion != 2){

            System.out.println("\nCompetidor "+numero +":");
            System.out.println("1. Motocicleta");
            System.out.println("2. Automovil");
            System.out.print("Elige una opcion: ");

            if (scanner.hasNextInt()){

                opcion = scanner.nextInt();

            } else {

                scanner.next(); // descarta lo que no sea un numero

            }

            scanner.nextLine(); // limpia el salto de linea

        }

        System.out.print("Nombre del vehiculo: ");
        String nombre = scanner.nextLine();

        if (opcion == 1){

            return new Motocicleta(nombre);

        } else {

            return new Automovil(nombre);

        }

    }

}