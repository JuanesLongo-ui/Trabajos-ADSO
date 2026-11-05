/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorluchadores;

/**
 *
 * @author longo
 */
public class luchador {
    
    //atributos
    
    protected int hp;
    protected int ataque;
    protected int fuerza;
    protected int agilidad;
    protected int inteligencia;
    
    //constructores

    public luchador() {
    }

    public luchador(int hp, int ataque, int fuerza, int agilidad, int inteligencia) {
        this.hp = hp;
        this.ataque = ataque;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.inteligencia = inteligencia;
    }
    
    // get y set

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    
    // metodos
     
    //metodo1
    public int atacar(){
    
        return 0;
        
    };
    
    // metodo2
    public int defenderse(){
    
        return 0;
        
    };
    
    //metodo3
    public int recibirDanio(){
    
        return 0;
        
    };
    
    //metodo4
    public int estaVivo(){
    
        return 0;
        
    };
    
}
