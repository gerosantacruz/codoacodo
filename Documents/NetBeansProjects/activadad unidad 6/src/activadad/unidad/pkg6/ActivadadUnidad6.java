/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activadad.unidad.pkg6;

/**
 *
 * @author Gero Santacruz
 */
import java.util.Scanner;
public class ActivadadUnidad6 {

    /**
     * @param args the command line arguments
     */
    public static void ParOImpar(String[] args) {
        // TODO code application logic here
        int numero;
        System.out.println("Entre un numero para saber si es par o no");
        Scanner sc= new Scanner(System.in);
        
        numero = sc.nextInt();
        
        if (numero % 2 ==0)
            System.out.println("Ingresaste un numero par");
        else
            System.out.println("Ingresaste un numero impar");
        
    }
    
    public static void mas10 (String[] args){
        int num;
        int contador = 0;
        System.out.println("Entre un numero para ver los siguiente 10");
        Scanner sc= new Scanner(System.in);
        
        num = sc.nextInt();
        
//        for(int i = num; i < (num + 10); i++){
//            System.out.println(i);
//        }
        while (contador < 10){
            
            contador ++;
            System.out.println(num + contador);
        }
    }
    
    public static void mayorNum (String[] args){
        int num1;
        int num2;
        int num3;
        System.out.println("Ingrese 4 numeros, y le mostrara el mayor");
        Scanner n1= new Scanner(System.in);
        num1= n1.nextInt();
        Scanner n2= new Scanner(System.in);
        num2= n2.nextInt();
        Scanner n3= new Scanner(System.in);
        num3= n3.nextInt();
        
        if (num1 > num2){
            System.out.println("el numero " + num1 + " es mayor");
        }
        
        else if( num2> num3){
            System.out.println("el numero " + num2 + " es mayor");
        }
        
        else{
            System.out.println("el numero " + num3 + " es mayor");
        }
    }
    
    public static void CuantoMeses (String[] args){
        int meses;
        int años;
        
        System.out.println("Ingrese  primero cuanto años y  luego cuanto "
                + "meses tenes");
        Scanner n1= new Scanner(System.in);
        años= n1.nextInt();
        Scanner n2= new Scanner(System.in);
        meses= n2.nextInt();
        System.out.println("Usted tiene " + ((años * 12)+ meses));
    }
    
    public static void numeroROMANO (String[] args){
        String letra;
        
        System.out.println("Ingrese el numero romano que quiera saber "
                + "(Debe ser en mayuscula)");
        Scanner let = new Scanner(System.in);
        letra = let.next();
        
        switch(letra){
            case "I":System.out.println("es igual a 1");
                break;
            case "V":System.out.println("es igual a 5");
                break;
            case "X":System.out.println("es igual a 10");
                break;
            case "L":System.out.println("es igual a 50");
                break;
            case "C":System.out.println("es igual a 100");
                break;
            case "D":System.out.println("es igual a 500");
                break;
            case "M":System.out.println("es igual a 1000");
                break;
        }
    }
    
    public static void main (String[] args){
        int num1;
        int num2;
        int choose;
  
        System.out.println("Ingrese los numero que desea sumar o restar");
        
        System.out.println("Ingrese el primer numero");
        Scanner n1= new Scanner(System.in);
        num1= n1.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        Scanner n2= new Scanner(System.in);
        num2= n2.nextInt();
        
        System.out.println("Ingrese 1 para sumar o 2 para restar");
        Scanner ele= new Scanner(System.in);
        choose= ele.nextInt();
        
        switch(choose){
            case 1:
            System.out.println(suma( num1,num2));
            break;
        case 2:
            System.out.println(resta( num1,num2));
            break; 
        }
    }
    
    public static int suma(int x, int y){
        int result= x +y;
        return result;
    }
    
    public static int resta(int x, int y){
        int result= x - y;
        return result;
    }
    
    
}
