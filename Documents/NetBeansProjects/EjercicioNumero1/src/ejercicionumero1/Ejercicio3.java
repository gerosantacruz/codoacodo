/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionumero1;

/**
 *
 * @author Gero Santacruz
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double j;
	int total;
	total = 0;
	for (j=1;j<=10;j++) {
		total = (int) (total+j);
		}
	System.out.println("La suma de los 10 primero numeros naturales es: "+total);
    }
    
}
