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
public class Excepciones {
    
    public static void main(String[] args){
        try{
            throw new Exception("Nueva excepcion");
        } catch(Exception e){
            System.out.println("Se produjo una excepcion " + e.getMessage());
        } finally{
            System.out.println("Final del bloque de Excepciones.");
        }
    
    
    }
    
}
