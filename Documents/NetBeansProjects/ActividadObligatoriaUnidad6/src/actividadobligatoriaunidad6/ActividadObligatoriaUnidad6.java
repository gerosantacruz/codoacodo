/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadobligatoriaunidad6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gero Santacruz
 */
public class ActividadObligatoriaUnidad6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String newLine = System.getProperty("line.separator");
        Ejercicio1(10,2);
        
        System.out.println(newLine);
        
        Ejercicio2();
        
        System.out.println(newLine);
       
        
        //Ejercicio 3
        try{
            throw new Exception("Nueva excepcion");
        } catch(Exception e){
            System.out.println("Se produjo una excepcion " + e.getMessage());
        } finally{
            System.out.println("Final del bloque de Excepciones.");
        }
        
        System.out.println(newLine);  
        //Ejercicion 4
        try {
              throw new MiExcepcion("mi propia Excepción");
          } catch(MiExcepcion e) {
              System.out.println("excepción: " + e.getMensaje());
           } 
        
        System.out.println(newLine);
        
        Ejercicio5();
               
    }
    
    public static void Ejercicio1(int a, int b){
       try{
       int c = a / b;
       
       System.out.println("La Division es: " + c);}
       
       catch(ArithmeticException e){
           System.out.println("No se puede dividir por cero");
       }
    }
    
    private static void Ejercicio2(){
        try{
            int s = 5;
            int n = Integer.parseInt("M");
            System.out.println("La Multiplicacion es: " + (s+n));
        }
        catch(NumberFormatException e){
            System.out.println("ERROR: un elemento no es un numero");
        }
    }
    
    private static void Ejercicio5(){
        boolean continuar = true; 
           while(continuar) {        
                try {                
                    System.out.print("Introduce un número entero: ");
                   InputStreamReader datosInsertados = new InputStreamReader(System.in);
                   BufferedReader datos = new BufferedReader(datosInsertados);
                   String cadenaDatos = datos.readLine();
                   int numero = Integer.parseInt(cadenaDatos);
                   int cuadrado = numero * numero;
                   System.out.println("El cuadrado de " + numero + " = " + cuadrado);
                   continuar = false;
               } catch(IOException | NumberFormatException e) {
                   System.out.println(e.getMessage());                
               }            
           }
    
    }
    
    
    
    
}
