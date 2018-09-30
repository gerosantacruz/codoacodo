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
public class Cuenta {
    
    private String nombre="";
    private double Cant;
    
    
    public Cuenta(String nombre){
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the Cant
     */
    public double getCant() {
        return Cant;
    }

    /**
     * @param Cant the Cant to set
     */
    public void setCant(double Cant) {
        this.Cant = Cant;
    }
    
    
    public void Ingresar(double suma){
    if(suma >0){
        Cant+= suma;
        System.out.println("El total es: " + Cant);
    }else{
        System.out.println("La suma ingresada no es valida");
    } 
    }
    
    public void Retirar(double retiro){
    if(Cant > 0 && retiro > 0){
        Cant -= retiro;
        System.out.println("La cantidad retirada es: " + retiro);
        System.out.println("El restante en la cuenta es: " + Cant); 
    } 
    if( Cant <0){
        Cant = 0;
    }
    }
    
    
    
}
