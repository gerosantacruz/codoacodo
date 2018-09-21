/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciounidad2;
import javax.swing.JOptionPane; 
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Gero Santacruz
 */
public class EjercicioUnidad2 {

    private static Object OptionPane;
    /**
     * @param a
     * @param args the command line arguments
     */
    
    static int maximo(int a, int b, int c){
        int max;

        if(a>b && a>c) // si a es mayor que b y c, entonces a es el máximo
        max=a;
        else
        if(b>a && b>c) // si b es el mayor de todos, entonces b es el máximo
        max=b;
        else
        // si el máximo no es a ni b, será c
        max=c;

       return(max);
    }
    
    static double Raiz(int a){
        //Retorna la raiz del numero, si es negativo da un mensaje de error
        double raiz = 0;
        if( a > 0)
            raiz =  Math.sqrt(a);
            
        else
            JOptionPane.showMessageDialog(null, "No se puede realizar la operacion"
                    + " con 0 o numeros negativos",
                    "Error", JOptionPane.WARNING_MESSAGE);  
       return(raiz);      
    }
    
    static double Pow(int a){
        //Retorna la potencia de un numero por 2, como pasa primero por la funcion
        //raiz, no hace falta error en caso de numero negativo
        double pot = 0;
        if( a > 0)
            pot =  Math.pow(a, 2);
            
       return(pot);      
    }
    
    static int Dia(int a){
        //Chequea que la fecha se igual o mayor que uno, asi como menor a 31
        //en caso contrario lanza un error
        int c=0;
        if(a>= 1 && a<=31)
            c=a;
        else
            JOptionPane.showMessageDialog(null, "El numero ingresado no es valido",
                    "Error", JOptionPane.WARNING_MESSAGE);
        
        return(c);
         }
    
    static String mes(int a){
        //depende del numero ingresado, devuelve el nombre del mes, 
        //sino un mensaje default
        String mes;
        
              switch (a) {
            case 1:  mes = "Enero";
                     break;
            case 2:  mes = "Febrero";
                     break;
            case 3:  mes = "Marzo";
                     break;
            case 4:  mes = "Abril";
                     break;
            case 5:  mes = "Mayo";
                     break;
            case 6:  mes = "Junio";
                     break;
            case 7:  mes = "Julio";
                     break;
            case 8:  mes = "Agosto";
                     break;
            case 9:  mes = "Septiembre";
                     break;
            case 10: mes = "Octubre";
                     break;
            case 11: mes = "Noviembre";
                     break;
            case 12: mes = "Deciembre";
                     break;
            default: mes = "Mes invalido";
                     break;
        }
       return(mes);
    }
    
    
    static int year(int d){
        //Devuelve todo año que se mayor a cero, sino da error
        
        int c= 0;
        
        if(d >= 0)
            c = d;
        else
             JOptionPane.showMessageDialog(null, "El numero ingresado no es valido",
                    "Error", JOptionPane.WARNING_MESSAGE);
       
       return(c);
    
    
    }
    
  
    
    

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1
        
//        int max;
//        int a, b,c;
//        
//        System.out.println("Introduzca el primer numero: ");
//        a=sc.nextInt();
//        
//        System.out.println("Introduzca el segundo numero: ");
//        b= sc.nextInt();
//        
//        System.out.println("Introduzca el tercer numero: ");
//        c =  sc.nextInt();
//        
//        System.out.println("");
//        
//        max = maximo (a, b, c);
//        
//        System.out.println("El número mayor es: " + max);
        //Ejercicio 2
//        double raiz;
//        double potencia;
//        int a;
//
//        	
//        String aresp = JOptionPane.showInputDialog("Ingrese el numero que "
//                + "desea saber la raiz y su potencia.");
//        a = Integer.parseInt(aresp);
//        
//        raiz = Raiz(a);
//        potencia = Pow(a);
//        
//        JOptionPane.showMessageDialog(null, "(“Del numero " + a + " , su\n" +
//        "potencia es " + potencia + " y su raíz " + raiz);
        
//Ejercicio 3
//         int a;
//         int b;
//         int d = 0;
//         
//         int dia;
//         String mes;
//         int año;
//         
//         String aresp = JOptionPane.showInputDialog("Ingrese el dia");
//        a = Integer.parseInt(aresp);
//        
//        String aresp2 = JOptionPane.showInputDialog("Ingrese el mes");
//        b = Integer.parseInt(aresp2);
//        
//        String aresp3 = JOptionPane.showInputDialog("Ingrese el año");
//        d = Integer.parseInt(aresp3);
//        
//        dia = Dia(a);
//        mes = mes(b);
//        año = year(d);
//        
//        JOptionPane.showMessageDialog(null, "(“dia " + dia + " ,\n" +
//        ", " + mes + " del " + año+ ".");
        //Ejercicio 4
        
        
//        int bajo= 0;
//        int reg= 0;
//        int bue= 0;
//        int mbue = 0;
//        int exce =0;
//        
//        
//        int[] Alumnos = new int[10];

//        //Crea notas aelatorais del 1 al 10
//        for(int i = 0; i < Alumnos.length; i++){
//            Alumnos[i] = (int) (10 * Math.random());
//            
//        }
//        
          ////Chequea las notas y suma segun la misma las distintas categorias
//        for (int x = 0; x < Alumnos.length; x++){
//            if(Alumnos[x]< 4)
//                bajo++;
//            else if(Alumnos[x] <= 4 && Alumnos[x]>5)
//                reg++;
//            else if(Alumnos[x] >= 5 && Alumnos[x]< 7)
//                bue++;
//            else if(Alumnos[x] >= 7 && Alumnos[x]< 9)
//                mbue++;
//            else if (Alumnos[x] >= 9)
//                exce++;
//        }    

            ////Imprime la notas delos alumnos
//        for( int r = 0; r< Alumnos.length; r++){
//        
//            System.out.println("Nota de almunos: "+ Alumnos[r]);
//        }
//        
          ////Muestra el resultado de las notas
//        System.out.println("Cantidad de Alumnos Bajos "+ bajo);
//        System.out.println("Cantidad de Alumnos Regulares "+ reg);
//        System.out.println("Cantidad de Alumnos Buenos "+ bue);
//        System.out.println("Cantidad de Alumnos Muy Buenos "+ mbue);
//        System.out.println("Cantidad de Alumnos Excelentes "+ exce);

          //Ejercicio 5
          
//          Random random = new Random(); 
//          int max =100;
//          int suma = 0;
//          int resta = 0;
//          
//                  
//          int[] vectorA = new int[2];
//          int[] vectorB = new int[2];
//          int[] suma2 = new int[2];
//          int[] resta2 = new int[2];
//                  
//           //Crea vectores aleatorias entre el -100 y 100     
//          vectorA[0] = random.nextInt(max) * (random .nextBoolean() ? -1 : 1);
//          vectorA[1] = random.nextInt(max) * (random .nextBoolean() ? -1 : 1);
//          vectorB[0] = random.nextInt(max) * (random .nextBoolean() ? -1 : 1);
//          vectorB[1] = random.nextInt(max) * (random .nextBoolean() ? -1 : 1);
//          
            ////Imprimi los vectores en la consola
//          System.out.println("El vector A es: "+ "("+ vectorA[0]+"),(" +
//                  vectorA[1] + ")");
//          System.out.println("El vector B es: "+ "("+ vectorB[0]+"),(" +
//                  vectorB[1] + ")");
//          

            ////realiza la suma y resta, correspondientemente
//          for(int i = 0; i< vectorA.length; i++){
//              suma2[i] = vectorA[i] + vectorB[i];
//          }
//          
//          for(int i = 0; i< vectorA.length; i++){
//              resta2[i] = vectorA[i] - vectorB[i];
//          }
//          
//          //Imprimi los resultados de las operaciones
//          
//          
//          
//          System.out.println("La suma de los vectores es: "+ "("+ suma2[0]+"),(" +
//                  suma2[1] + ")");
//          System.out.println("La suma de los vectores es: "+ "("+ resta2[0]+"),(" +
//                  resta2[1] + ")");


       
        
             
    }
    
}
