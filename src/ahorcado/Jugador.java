/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Jugador {
    int intentos;
    int id;
    
    public Jugador(){
        
    }
    
    public Jugador(String palabra){
        intentos = -1;
    }
    
    public Jugador(int id){
        this.id = id;
    }
    
   public String proponePalabra(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Jugador "+this.id+" propone palabra: ");
       String c = sc.next();
       return c;
   } 
   
   public char proponeLetra(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Jugador "+this.id+" propone letra: ");
       String c = sc.next();
       
       return c.charAt(0);
   }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
   
}
