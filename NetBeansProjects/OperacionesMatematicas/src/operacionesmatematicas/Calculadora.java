package operacionesmatematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author piedad
 */
public class Calculadora {
     private static int c;
     private static int d;
    public Calculadora() {
            c=0;
            d=0;
    }

    public static int getC() {
        return c;
    }

    public static void setC(int c) {
        Calculadora.c = c;
    }

    public static int getD() {
        return d;
    }

    public static void setD(int d) {
        Calculadora.d = d;
    }
    public void funcion () throws IOException {
     String c; 
     
     BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Introducir primer operando");
     Calculadora.c = Integer.parseInt(lector.readLine()); 
     System.out.println("Introducir segundo operando");
     d = Integer.parseInt(lector.readLine());
     int s=0;
     do{
      System.out.println("¿QUé operacion desea realizar?");
      System.out.println("S -Suma");
      System.out.println("R -Resta");
      System.out.println("P -Producto");
      System.out.println("D -División");
      c=lector.readLine();
    switch (c) {
       case "S": 
       case "s": System.out.println("Resultado de la suma: " + (Calculadora.c+d)); break;
       case "R": 
       case "r": System.out.println("Resultado de la resta: " + (Calculadora.c-d)); break;
       case "M": 
       case "m":  
       case "P": 
       case "p": System.out.println("Resultado del producto: " +  Calculadora.c*d); break;
       case "D": 
       case "d": System.out.println("Resultado de la division: " + Calculadora.c/d); break; 
       default: System.out.println("Por favor, indica la operacion correcta"); break; 
        }
    System.out.println("Deseas realizar otra operación con los mismos operandos(s/n)");
     c=lector.readLine();
     if((c.compareTo("n")==0)|| c.compareTo("N")==0)
             s=1;
     }while(s==0);
}

}

