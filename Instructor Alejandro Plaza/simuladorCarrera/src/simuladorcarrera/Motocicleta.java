/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarrera;

import java.util.Random;

/**
 *
 * @author longo
 */
public class Motocicleta extends Vehiculo {

    // Atributos

    private Random random;

    //constructores

    public Motocicleta(String nombre) {
        super(nombre);
        this.random = new Random();
    }

    // metodos io funciones de clase

    @Override
    public void avanzar () {

        // la moto avanza entre 20 y 80 metros
        int avance = random.nextInt(61) + 20;

        distanciaRecorrida += avance;

        System.out.println("Moto "+this.nombre +" avanzo "+avance +" metros.");

    }

}