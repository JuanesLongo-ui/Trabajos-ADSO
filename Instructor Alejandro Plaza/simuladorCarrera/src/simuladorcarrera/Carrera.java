/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarrera;

/**
 *
 * @author longo
 */
public class Carrera {

    // Atributos

    private Vehiculo vehiculo1;
    private Vehiculo vehiculo2;
    private int distanciaMeta;

    //constructores

    public Carrera(Vehiculo v1, Vehiculo v2) {
        this.vehiculo1 = v1;
        this.vehiculo2 = v2;
        this.distanciaMeta = 1000;
    }

    // metodos io funciones de clase

    public void iniciar () {

        int turno = 1;

        // la carrera sigue mientras ninguno llegue a la meta
        while (vehiculo1.getDistanciaRecorrida() < distanciaMeta && vehiculo2.getDistanciaRecorrida() < distanciaMeta) {

            System.out.println("----- TURNO "+turno +" -----");

            // los dos avanzan en el mismo turno para que sea justo
            vehiculo1.avanzar();
            vehiculo1.mostrarEstado();
            System.out.println();

            vehiculo2.avanzar();
            vehiculo2.mostrarEstado();
            System.out.println();

            turno++;

        }

        determinarGanador();

    }

    private void determinarGanador () {

        int d1 = vehiculo1.getDistanciaRecorrida();
        int d2 = vehiculo2.getDistanciaRecorrida();

        System.out.println("===== FIN DE LA CARRERA =====");

        if (d1 > d2){

            System.out.println("El ganador es "+vehiculo1.getNombre() +" con "+d1 +" metros");

        } else if (d2 > d1){

            System.out.println("El ganador es "+vehiculo2.getNombre() +" con "+d2 +" metros");

        } else {

            System.out.println("Empate, los dos llegaron a "+d1 +" metros");

        }

    }

}
