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
public class Electrodomestico {
    
    //variables
    int precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;
    
    //Por default
    
    static final int PRECBASE = 10000;
    static final String COLORBASE = "blanco";
    static final char CONSBASE = 'F';
    static final double PESOBASE = 5;
    
    /**
     * @return the precioBase
     */
    public int getPrecioBase() {
        return precioBase;
    }

    /**
     * @param precioBase the precioBase to set
     */
    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the consumoEnergetico
     */
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    /**
     * @param consumoEnergetico the consumoEnergetico to set
     */
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the PRECBASE
     */
    public static int getPRECBASE() {
        return PRECBASE;
    }

    /**
     * @return the COLORBASE
     */
    public static String getCOLORBASE() {
        return COLORBASE;
    }

    /**
     * @return the CONSBASE
     */
    public static char getCONSBASE() {
        return CONSBASE;
    }

    /**
     * @return the PESOBASE
     */
    public static double getPESOBASE() {
        return PESOBASE;
    }
    
    
    //Metodos
    
    public void ComprobarConsumoEner(char consumoEnergetico){
        if(consumoEnergetico >= 65 && consumoEnergetico <= 70){
            this.consumoEnergetico = consumoEnergetico;
        }else{
            this.consumoEnergetico = CONSBASE;
        }
    
    }
    
    private void ComprobarColor(String color){
        String[] colores ={"blanco", "negro", "rojo", "azul", "gris"};
        
        boolean hay = false;
        
        for ( int i = 0; i < colores.length && !hay ; i++){
            if(colores[i].equals(color)){
                hay= true;
            }   
        }
        
        if(hay){
            this.setColor(color);
        }else{
            this.setColor(getCOLORBASE());
        }
    }
    
    public double PrecioFinal(){
        double mas = 0;
        switch(consumoEnergetico){
            case 'A':
                mas= 10000;
                break;
            case 'B':
                mas=8000;
                break;
            case 'C':
                mas = 7000;
                break;
            case 'D':
                mas = 5000;
                break;
        }
        
        return precioBase + mas;
        
    }
    
    //Constructores 
    
    public Electrodomestico(){
        this(PRECBASE, COLORBASE, CONSBASE, PESOBASE);
    }
    
    public Electrodomestico(int precioBase, double peso){
        this(precioBase,COLORBASE, CONSBASE, peso);
    }
    
    public Electrodomestico(int precio, String color,char consumo,double peso){
        ComprobarColor(color);
        ComprobarConsumoEner(consumo);
        this.peso = peso;
        this.precioBase = precio;
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
