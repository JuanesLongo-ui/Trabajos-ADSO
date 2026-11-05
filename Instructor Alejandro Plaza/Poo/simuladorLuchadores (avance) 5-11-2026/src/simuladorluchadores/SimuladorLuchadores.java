/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladorluchadores;

/**
 *
 * @author longo
 */
public class SimuladorLuchadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        guerrero guerrero1 = new guerrero();
        System.out.println("\nAtributos guerrero1");
        System.out.println("\nPuntos de vida: "+guerrero1.getHp());
        System.out.println("Fuerza: "+guerrero1.getFuerza());
        System.out.println("Agilidad: "+guerrero1.getAgilidad());
        System.out.println("Inteligencia: "+guerrero1.getInteligencia()+"\n");
        
        
        mago mago1 = new mago();
        
        System.out.println("\nAtributos mago1");
        System.out.println("\nPuntos de vida: "+mago1.getHp());
        System.out.println("Fuerza: "+mago1.getFuerza());
        System.out.println("Agilidad: "+mago1.getAgilidad());
        System.out.println("Inteligencia: "+mago1.getInteligencia()+"\n");
        
        
         arquero arquero1 = new arquero();
        
        System.out.println("\nAtributos arquero1");
        System.out.println("\nPuntos de vida: "+arquero1.getHp());
        System.out.println("Fuerza: "+arquero1.getFuerza());
        System.out.println("Agilidad: "+arquero1.getAgilidad());
        System.out.println("Inteligencia: "+arquero1.getInteligencia()+"\n");
        
    }
    
}
