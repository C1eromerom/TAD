package operacionesmatematicas;

/**
 *
 * @author piedad
 */
   
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class a22 { 
        public  int opc=6; 
        public double pi=3.1416,r,v1,h; 
        public String o;
        public a22(){            
        }
        public  void funcion()throws IOException 
        {
            int a,b,c,v; 
            int s=0;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            do{              
          
            while (opc<1||opc>5) 
            {
                    System.out.println("1. Volumen de un Paralelepipedo Rectangular");
                    System.out.println("2. Volumen de una Esfera"); 
                    System.out.println("3. Volumen de un Cilindro Recto"); 
                    System.out.println("4. Volumen de un Cono Circular Recto"); 
                    System.out.println("5. Salir");
                    System.out.println("Seleccionar su opcion: "); 
                    opc = Integer.parseInt(in.readLine( )); 
            } 
            switch (opc) 
            {
                case 1: System.out.println("Ingresar la base, altura y ancho: ");
                    a = Integer.parseInt(in.readLine( )); 
                    b = Integer.parseInt(in.readLine( )); 
                    c = Integer.parseInt(in.readLine( )); 
                    v=a*b*c;
                    System.out.println("El volumen es: "+v);
                    break; 
                case 2: System.out.println("Ingresar el radio: "); 
                    r= Integer.parseInt(in.readLine( ));
                        v1=(r*r*r)*pi*(4/3); 
                        System.out.println("El volumen es: "+v1);
                        break; 
                case 3: System.out.println("Ingresar el radio y la altura: "); 
                      r= Integer.parseInt(in.readLine( )); 
                      h= Integer.parseInt(in.readLine( ));
                      v1=pi*(r*r)*h; 
                      System.out.println("El volumen es: "+v1);
                      break; 
                case 4: System.out.println("Ingresar el radio y la altura: "); 
                        r= Integer.parseInt(in.readLine( )); 
                        h= Integer.parseInt(in.readLine( ));
                        v1=(pi*(r*r)*h)/3; 
                        System.out.println("El volumen es: "+v1);break; 
            } 
        System.out.println("Deseas calcular otro volumen(s/n)?");
             o=in.readLine();
             if((o.compareTo("n")==0)|| o.compareTo("N")==0)
             s=1;
             opc=0;
        }while(s==0);
     }
           
}
