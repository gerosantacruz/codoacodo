/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadobligatoriaunidad5;

/**
 *
 * @author Gero Santacruz
 */
public class ActividadObligatoriaUnidad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c1 = new Cuenta("ignacio");
        
        c1.Ingresar(100);
        
        c1.Retirar(50);
        
        Persona p1 = new Persona("pedro", 23, 'H');
        
        String newLine = System.getProperty("line.separator");
        
        System.out.println(newLine);
        
       p1.toString();
        
        
       
    }
    
}
