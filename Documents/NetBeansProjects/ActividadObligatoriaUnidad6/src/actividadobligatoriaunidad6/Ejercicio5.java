/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadobligatoriaunidad6;

import java.io.*;

/**
 *
 * @author Gero Santacruz
 */
public class Ejercicio5 {
    public static void main(String[] args) {
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
    

