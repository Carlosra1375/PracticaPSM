/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

/**
 *
 * @author carlo
 */
public class Juego {
    int partidas = 5;
    Jugador jugador1;
    Jugador jugador2;
    
    int[] ganador = new int[5];
    
    public Juego(){
        this.jugador1 = new Jugador(1);
        this.jugador2 = new Jugador(2);
    }
    
    public void simulaPartida(int par, Jugador j1, Jugador j2){
        j2.setIntentos(5);
        boolean adivina = false;
        String palabra = j1.proponePalabra();
        char[] mostrado = new char[palabra.length()];
        for(int i = 0 ; i<palabra.length() ; i++){
            mostrado[i] = '-';//palabra.charAt(i);
        }
        
        while(j2.intentos>0 && !adivina){
            char c = jugador2.proponeLetra();
            boolean correcto = false;
            for(int i = 0 ; i<palabra.length() ; i++){
                if(palabra.charAt(i)==c){
                    correcto = true;
                    mostrado[i] = palabra.charAt(i);
                }
            }
            if(!correcto){
                j2.setIntentos(j2.getIntentos()-1);
                System.out.println("Te quedan "+j2.getIntentos());
            }
            System.out.println("");
            
            adivina=true;
            for(int j = 0 ; j<mostrado.length ; j++){
                if(mostrado[j]=='-'){
                    adivina = false;
                }
                System.out.print(mostrado[j]);
            }  
   
        }
        
        System.out.println("");
        if(adivina){
            System.out.println("Enhorabuena! acertaste la palabra");
            ganador[par] = 2;
        }else{
            System.out.println("Fallaste, la palabra era "+palabra);
            ganador[par] = 1;
        }
        System.out.println("");
    }
    
   public void juego(){
       int i = 0;
       while(i<partidas){
           if(i%2==0){
               simulaPartida(i,jugador1,jugador2);
           }else{
               simulaPartida(i,jugador2,jugador1);
           }
           i++;
       }
       
       for(int j = 0 ; j<5 ; j++){
           System.out.println("Partida "+(j+1)+": gana jugador"+ganador[j]);
       }
   }
}
