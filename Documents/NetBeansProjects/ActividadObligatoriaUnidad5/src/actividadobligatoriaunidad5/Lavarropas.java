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
public class Lavarropas extends Electrodomestico {
    
    private int carga;
    private final static int CARGA = 5;

  

    /**
     * @return the carga
     */
    public int getCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(int carga) {
        this.carga = carga;
    }

    /**
     * @return the CARGA
     */
    public static int getCARGA() {
        return CARGA;
    }
    
    public Lavarropas(){
        this(PRECBASE, COLORBASE, CONSBASE, PESOBASE, CARGA);
    }
    
    public Lavarropas(int precioBase, double peso){
        this(precioBase,COLORBASE, CONSBASE, peso, CARGA);
    }
    
    public Lavarropas(int precioBase, String color, 
            char consumoEnergetico, double peso, int carga){
            super(precioBase,color,consumoEnergetico, peso );
            this.carga = carga;
    }
    
    
    @Override
    public double PrecioFinal(){
        double p = super.PrecioFinal();
        
       if(carga < 19){
           p += 5000;
       }else if(carga >= 20 && carga <49){
           p += 10000;
       }else if (carga >=50&& carga < 70){
           p += 17000;
       }else{
           p += 25000;
       }
        return p;       
    }
    
    
}
