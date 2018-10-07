/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadobligatoriaunidad6;

/**
 *
 * @author Gero Santacruz
 */
public class PropiaClaseExcepcion {
       public static void main(String[] args) {
          try {
              throw new MiExcepcion("mi propia Excepción");
          } catch(MiExcepcion e) {
              System.out.println("excepción: " + e.getMensaje());
           }        
       }
}
