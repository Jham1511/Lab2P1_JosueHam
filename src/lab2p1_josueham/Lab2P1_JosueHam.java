package lab2p1_josueham;

import java.util.Scanner;

public class Lab2P1_JosueHam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int opcion;
        do {
            System.out.println("----- Bienvenido al menu -----");
            System.out.println("1 -> MCD");
            System.out.println("2 -> Sumatoria");
            System.out.println("3 -> Supermercado");
            System.out.println("4 -> Para salir del programa");
            System.out.println("Ingrese la opcion que desea: ");
            opcion = leer.nextInt();
            
            if (opcion == 1){
                
                    System.out.println("Ingrese el valor de A: ");
                       int A = leer.nextInt();
                    System.out.println("Ingrese el valor de B: ");
                        int B = leer.nextInt();
                    
                      if (A < 0 || B < 0){
                      System.out.println("Solamente se permiten valores positivos");
                      System.out.println("Ingrese el valor de A: ");
                       A = leer.nextInt();
                      System.out.println("Ingrese el valor de B: ");
                        B = leer.nextInt();
                  }//If validacion 
                      
                     int num_1 = A, num_2 = B;
                     
                  do {      
                      if (A<B){
                       B = B - A;
                        
                    }//Fin if Opcion No.1
                  else if (A > B){
                      A = A - B;
                  }//Fin else if
                  }while (A!=B);
                  
                  System.out.println("El MCD de " + num_1 + " y " + num_2 + " es de: "+ A);
                    
                
            }// Fin opcion No.1
            
            else if (opcion == 2){
                System.out.println("Ingrese el valor de K: ");
                double k = leer.nextDouble();
                double n=1.0;
                double calculo; 
                double calculo_2 =0;
                double exp = 1;

                
                while(n <= k){
                    calculo =(n/n+1);
                    exp+= (double) Math.pow (calculo, n);
                    calculo_2+= calculo*exp;
                    n++;
                }//Fin while
                System.out.println("El resultado de la sumatoria es: "+ calculo_2);
                
            }//Fin opcion No. 2
            else if (opcion == 3){
                
                System.out.println("Ingrese el tipo de cliente[0/1/2/4 Para Salir]: ");
                    int cliente = leer.nextInt();
                System.out.println("Ingrese la cantidad de productos que lleva: ");
                    int cantidad = leer.nextInt();
                System.out.println("Ingrese el precio de la unidad del producto: ");
                    double valor = leer.nextDouble();
                    
                    double desc ;
                    double resp_1;
                    double resp;
                    double productos =0;
               do {     
                if (cliente == 0){
                    if (cantidad >= 10 || cantidad <= 19){
                        productos = cantidad - 2;
         
                    }//Fin if validacion cliente 1
                    else if (cantidad >= 20){
                        productos = cantidad -5;
                    
                         
                    }//Fin else if cliente tipo 0
                    resp = productos*valor;
                    System.out.println("El total a pagar es de: "+ resp);
                    
                }//Fin cliente tipo 0
                
                else if (cliente == 1){
                    if (cantidad >= 20 || cantidad <= 29 ){
                        productos = cantidad - 2;
                    }//Fin if validacion cliente tipo 1
                    
                    else if (cantidad >= 30){
                        productos = cantidad -5;
                    }//Fin else if cliente tipo 1
                    resp = (productos*valor);
                    desc = resp*0.10;
                    resp_1 = resp - desc;
                    System.out.println("El total a pagar es de: "+ resp_1);
                }//Fin cliente tipo 2
                
                else if (cliente == 2){
                    if (cantidad >= 30 || cantidad <= 39){
                        productos = cantidad - 2;
                    }//Fin if validacion cliente tipo 1
                    else if (cantidad >= 40){
                        productos = cantidad -5;
                    }//Fin else if cliente tipo 1
                    
                    resp = (productos*valor);
                    desc = resp*0.30;
                    resp_1 = resp - desc;
                    System.out.println("El total a pagar es de: "+ resp_1);
                }//Fin cliente tipo 2
               }while (cliente!=3);
            }//Fin opcion No.3
        }while (opcion!=4);
    }//Fin del static void main 
    
}//Fin de la clase
