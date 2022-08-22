/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoDeCorrida;

/**
 *
 * @author nicol
 */
public class Veiculo {
    
   Motor motor;
   
   Veiculo(Motor m){
       motor = m;
   }
            
       public String acelerar(){
        return motor.acelerar();
}
}
