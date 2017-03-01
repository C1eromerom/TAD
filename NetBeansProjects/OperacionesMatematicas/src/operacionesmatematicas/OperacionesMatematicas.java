/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author piedad
 */
public class OperacionesMatematicas {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
             BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
             String c;
             int Salir=0;
             while(Salir==0){
             System.out.println("Elije la opción;");
             System.out.println("================");
             System.out.println("1.-Resolver ecuación de 2º grado");
             System.out.println("2.-Utilizar calculadora");
             System.out.println("3.-Calcular volúmenes de figuras geométricas");
             System.out.println("s.-Salir");
             c= lector.readLine();       
              switch (c) {
                  case "1":Ecuacion2g ecuacion=new Ecuacion2g();
                            ecuacion.funcion();
                            break;
                  case "2":Calculadora calc=new Calculadora();
                            calc.funcion();
                            break;
                  case "3":a22 vol=new a22();
                            vol.funcion();
                            break;
                  case "S": 
                  case "s": System.out.println("Hasta la próxima "); 
                            Salir=1;break;
                  default: System.out.println("No entiendo que quieres. Vuelve a introducir la opción");
                            break;
           
              }
             }
              
             
              
              


    }
   public int probando(){
       return 1;
   }
  
    
}
