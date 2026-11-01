/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarrera;

/**
 *
 * @author longo
 */
public abstract class Vehiculo {

    // Atributos

    protected String nombre;
    protected int distanciaRecorrida;

    //constructores

    public Vehiculo(String nombre) {
        this.nombre = nombre;
        this.distanciaRecorrida = 0;
    }

    // metodos y funciones get

    public String getNombre() {
        return nombre;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    // metodos io funciones de clase

    // cada vehiculo avanza a su manera, por eso es abstracto
    public abstract void avanzar ();

    public void mostrarEstado () {

        System.out.println("Distancia total: "+this.distanciaRecorrida +" metros.");

    }

}