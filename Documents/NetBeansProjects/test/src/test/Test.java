/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import  java.util.Scanner;
/**
 *
 * @author Gero Santacruz
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del array");
        int num= input.nextInt();
    
        int arr[]= new int[num];
        
        
        
        for (int i = 1; i< num; i++){
            System.out.println("Ingesa el numero " + i);
            arr[i] = input.nextInt();
        }
        
        System.out.println("lista de elementos");
        for (int i = 1; i < num; i++)
        {
            System.out.println(arr[i]);
        }
        
            
        
}
    }
    

