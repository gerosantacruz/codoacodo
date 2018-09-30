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
public class Television extends Electrodomestico{
    
    private int resolucion;
    private boolean tdt;
    
    private final static int RESBASE = 20;
    private final static boolean TDTBASE= false;

    /**
     * @return the resolucion
     */
    public int getResolucion() {
        return resolucion;
    }

    /**
     * @param resolucion the resolucion to set
     */
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    /**
     * @return the tdt
     */
    public boolean isTdt() {
        return tdt;
    }

    /**
     * @param tdt the tdt to set
     */
    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    /**
     * @return the RESBASE
     */
    public static int getRESBASE() {
        return RESBASE;
    }

    /**
     * @return the TDTBASE
     */
    public static boolean isTDTBASE() {
        return TDTBASE;
    }
    
    public Television(){
        this(PRECBASE, COLORBASE, CONSBASE, PESOBASE, RESBASE, false);
    }
    
    public Television(int precioBase, double peso){
        this(precioBase,COLORBASE, CONSBASE, peso, RESBASE, false);
    }
    
    public Television(int precioBase, String color, 
            char consumoEnergetico, double peso, int resolucion, boolean tdt){
            super(PRECBASE, COLORBASE, CONSBASE, PESOBASE);
            this.resolucion = resolucion;
            this.tdt= tdt;
    }
    
    @Override
    public double PrecioFinal(){
        double mas = super.PrecioFinal();
        
        if(resolucion > 40){
            mas += precioBase*0.3;
        }
        
        if( tdt){
            mas += 7000;
        }
        
        return mas;
    }
    
    
}
