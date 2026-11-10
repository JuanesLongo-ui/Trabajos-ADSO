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
public class Automovil extends Vehiculo {

    // Atributos

    private Random random;

    //constructores

    public Automovil(String nombre) {
        super(nombre);
        this.random = new Random();
    }

    // metodos io funciones de clase

    @Override
    public void avanzar () {

        // el automovil avanza entre 10 y 70 metros
        int avance = random.nextInt(61) + 10;

        distanciaRecorrida += avance;

        System.out.println("Automovil "+this.nombre +" avanzo "+avance +" metros.");

    }

}