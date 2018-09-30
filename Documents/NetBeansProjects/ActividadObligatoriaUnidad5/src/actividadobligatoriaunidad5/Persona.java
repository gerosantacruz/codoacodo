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
public class Persona {
    
    private String nombre="";
    private int edad;
    private String dni;
    private final static char SEXODEF = 'H';
    private char sexo;

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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public Persona(){ }
    
   
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        generarDni();
        this.sexo = sexo;
        ComprobarSexo();
    }
    
    public boolean EsMayorEdad(){
        return edad > 18;
    }
    
    public void ComprobarSexo(){
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXODEF;
        }
    }
    
   private void generarDni() {
        final int divisor = 23;
 
        //Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
 
        //Pasamos el DNI a String
        dni = Integer.toString(numDNI);
    }
 

    
    
    
    @Override
    public String toString(){
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + dni + "\n";
    
    }   
}
