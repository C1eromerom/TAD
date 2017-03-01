package operacionesmatematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author piedad
 */
public class Ecuacion2g {
        private static double a;               // Coeficiente de grado 2
        private static double b;               // Coeficiente de grado 1
        private static double c;               // Coeficiente de grado 0
        
        public Ecuacion2g(){
               a=0.0;
               b=0.0;
               c=0.0;
        }
    public  void funcion () throws IOException {
       
        double discriminante;   // Discriminante
        double x1;              // Primera raiz real
        double x2;              // Segunda raiz real
        double preal;           // Parte real de la raiz compleja
        double pimag;           // Parte imaginaria de la raiz compleja
         BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));   
        System.out.println("Introduce el coeficiente a de la ecuación:");
        a = Double.parseDouble(lector.readLine());
        System.out.println("Introduce el coeficiente b de la ecuación:");
        b = Double.parseDouble(lector.readLine());
         System.out.println("Introduce el coeficiente c de la ecuación:");
        c = Double.parseDouble(lector.readLine());
        discriminante = b*b -  4*a*c;
        if (discriminante>0) {
      // Dos raices reales
             x1 = (-b + Math.sqrt(discriminante))/(2*a);
            x2 = (-b- Math.sqrt(discriminante))/(2*a);
            System.out.print("Soluciones de la ecuacion de segundo grado: ");
            System.out.println(a + "x2 + " + b + "x + " + c);
            System.out.println("Tiene dos raices reales");
            System.out.println("La primera raiz es x1 = " + x1);
            System.out.println("La segunda raiz es x2 = " + x2);
        }
        else if (discriminante<0) {
// Dos raices imaginarias
        preal = (-b)/(2*a);
        pimag = Math.sqrt(-discriminante)/(2*a);
        System.out.print("Soluciones de la ecuacion de segundo grado: ");
        System.out.println(a + "x2 + " + b + "x + " + c);
        System.out.println("Tiene dos raices complejas");
        System.out.println("La primera raiz es x1 = " + preal + "+i" + pimag);
        System.out.println("La segunda raiz es x2 = " + preal + "-i" + pimag);
        }
    else {
     // Dos raices iguales
        x1 = (-b)/(2*a);
        System.out.print("Soluciones de la ecuacion de segundo grado: ");
        System.out.println(a + "x2 + " + b + "x + " + c);
        System.out.println("Dos raices identicas, x1 = x2 = " + x1);
        }
   
    }
   
}

