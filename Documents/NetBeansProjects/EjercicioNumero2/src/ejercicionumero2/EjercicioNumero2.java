/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionumero2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gero Santacruz
 */
public class EjercicioNumero2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		int c;
		int temp;
		System.out.println("ingrese el primer numero");
		a = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el segundo numero");
		b = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el tercer numero");
		c = Integer.parseInt(bufEntrada.readLine());
		System.out.println("El orden de los numero ingresados son a:"+a+" b:"+b+" c:"+c);
		temp = a;
		a = c;
		c = temp;
		System.out.println("Ahora orden de los numero ingresados son a:"+a+" b:"+b+" c:"+c);
        
        
    }
    
}
