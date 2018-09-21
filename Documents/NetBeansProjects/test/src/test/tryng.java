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
public class tryng {
    
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();

        }
        
        System.out.println("list elements");
        for(int i: arr){ //for printing array
            
            
            System.out.println(i);

        }

    }
    
}
