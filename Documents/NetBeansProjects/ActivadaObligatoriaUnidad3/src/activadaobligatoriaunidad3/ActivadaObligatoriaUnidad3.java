/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activadaobligatoriaunidad3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Gero Santacruz
 */

        //Crea la clase padre con sus atributos
class Producto{
    private int FechaCaducidad;
    private int Lote;
    
    public Producto (int FechaCaducidad, int Lote) {
        this.FechaCaducidad = FechaCaducidad;
        this.Lote = Lote;    
    }

    /**
     * @return the FechaCaducidad
     */
    public int getFechaCaducidad() {
        return FechaCaducidad;
    }

    /**
     * @param FechaCaducidad the FechaCaducidad to set
     */
    public void setFechaCaducidad(int FechaCaducidad) {
        this.FechaCaducidad = FechaCaducidad;
    }

    /**
     * @return the Lote
     */
    public int getLote() {
        return Lote;
    }

    /**
     * @param Lote the Lote to set
     */
    public void setLote(int Lote) {
        this.Lote = Lote;
    }
    
    

}

//Primer subclase, con los parametreos heredados y proprios

class Congelado extends Producto{
    private int tempCongReco;

    public Congelado(int FechaCaducidad, int Lote, int cong) {
        super(FechaCaducidad, Lote);
        this.tempCongReco = cong;
    }

    /**
     * @return the tempCongReco
     */
    public int getTempCongReco() {
        return tempCongReco;
    }

    /**
     * @param tempCongReco the tempCongReco to set
     */
    public void setTempCongReco(int tempCongReco) {
        this.tempCongReco = tempCongReco;
    }

}

//Segunda subclase, con herencia de la clase, con sus propios atributos

class Fresco extends Producto{
    private Date Envasado;
    private String paisOrigen;
    

    public Fresco(int FechaCaducidad, int Lote, Date fecha, String pais) {
        super(FechaCaducidad, Lote);
        this.Envasado= fecha;
        this.paisOrigen= pais;
    }

    /**
     * @return the Envasado
     */
    public Date getEnvasado() {
        return Envasado;
    }

    /**
     * @param Envasado the Envasado to set
     */
    public void setEnvasado(Date Envasado) {
        this.Envasado = Envasado;
    }

    /**
     * @return the paisOrigen
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * @param paisOrigen the paisOrigen to set
     */
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

}

//Tercera subclase, con herencia de la clase, con sus propios atributos
class Refrigerado extends Producto{
    private String codigoOrganizmo;

    public Refrigerado(int FechaCaducidad, int Lote, String Organiz) {
        super(FechaCaducidad, Lote);
        this.codigoOrganizmo= Organiz;
    }

    /**
     * @return the codigoOrganizmo
     */
    public String getCodigoOrganizmo() {
        return codigoOrganizmo;
    }

    /**
     * @param codigoOrganizmo the codigoOrganizmo to set
     */
    public void setCodigoOrganizmo(String codigoOrganizmo) {
        this.codigoOrganizmo = codigoOrganizmo;
    }



}


public class ActivadaObligatoriaUnidad3 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
       // productos: fecha y lote
       //congelados: temperatura.
       //frescos: fecha de envasado, pais de origen.
       //refrigerados:  codigo del organizmo.
       
       //crea el formato para la fecha de fresco
        SimpleDateFormat fo = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha1 = fo.parse("17/07/2018");
        
        //primer producto
        Producto proc1 = new Producto(171098,1542);
        
        //segundo producto: congelado
        Congelado proc2 = new Congelado(100816,1528,13);
        
        //Tercer producto: fresco
        Fresco proc3 = new Fresco(170818,1527,fecha1,"Brazil");
        
        //Cuarto producto:refrigerado
        Refrigerado proc4 = new Refrigerado(170818,12,"AMAT");
        
        
        //muestra los productos en la consola
        
        System.out.println("Producto con fecha: " + proc1.getFechaCaducidad()
        + "\n" + "Lote N°" + proc1.getLote());
        System.out.println("-------------------------------------------");
        
        System.out.println("Producto con fecha: " + proc2.getFechaCaducidad()
        + "\n" + "Lote N°" + proc2.getLote() + "\n"
        + "Temperatura recomendada: "+ proc2.getTempCongReco());
        System.out.println("-------------------------------------------");
        
        System.out.println("Producto con fecha: " + proc3.getFechaCaducidad()
        + "\n" + "Lote N°" + proc3.getLote() + "\n" + "Con fecha el: " + proc3.getEnvasado()+ "\n"
        + "Con pais de origen de: " + proc3.getPaisOrigen() );
        System.out.println("-------------------------------------------");
        
        System.out.println("Producto con fecha: " + proc4.getFechaCaducidad()
        + "\n" + "Lote N°" + proc4.getLote() + "\n" + "Organizmo: " 
                + proc4.getCodigoOrganizmo());
        System.out.println("-------------------------------------------");
        
        
        
        
    }
    
}
