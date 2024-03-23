
package tarea2progra;

import java.util.Scanner;

/**
 *
 * @author Jefferson Lopez 
 */
public class Tarea2Progra {

   
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       
       Ordenamientos orden =  new Ordenamientos();
       
       int arreglo[];
       String salir ;
       
        do {  
            
            try {
                
                int opcion , numeros;
                System.out.println("\n-----------------------------");
                System.out.println("MENU METODOS DE ORDENAMIENTO.");
                System.out.println("-----------------------------\n");
            
                System.out.println("1. Bubble sort(BURBUJA)");
                System.out.println("2. Quick sort(RAPIDA)");
                System.out.println("3. Insertion sort (INSERCION)");
                System.out.println("4. Radix sort (RAIZ)");
                System.out.println("5. Selection sort (SELECCION)");
                System.out.println("6. Merge sort (COMBINACION)");
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        
                        System.out.println("Digite El tamaño del Arreglo:");
                        numeros = entrada.nextInt();
        
                        arreglo = new int [numeros];
                        for(int i = 0; i<numeros; i++){
            
                            System.out.print("Elemento en la posicion"+"["+i+"] :");
                            arreglo[i] = entrada.nextInt();
                        }
        
        
                        System.out.println("\n");
         
                        System.out.println("Arreglo Original");
                        
                         orden.mostrarDatos(arreglo);
                         
                        orden.Burbuja(arreglo);
                        break;
                    
                    case 2:
                        
                        System.out.println("Digite El tamaño del Arreglo:");
                        numeros = entrada.nextInt();
        
                        arreglo= new int [numeros];
                        for(int i = 0; i<numeros; i++){
            
                            System.out.print("Elemento en la posicion"+"["+i+"] :");
                            arreglo[i] = entrada.nextInt();
                        }
        
        
                        System.out.println("\n");
         
                        System.out.println("Arreglo Original");
                        
                         orden.mostrarDatos(arreglo);
                         
                        orden.Quick(arreglo, 0, arreglo.length-1);
                        break;
                        
                    case 3:   
                        
                        System.out.println("Digite El tamaño del Arreglo:");
                        numeros = entrada.nextInt();
        
                        arreglo= new int [numeros];
                     
        
        
                        System.out.println("\n");
         
                       
                         
                        for(int i = 0; i<numeros; i++){
            
                            System.out.print("Elemento en la posicion"+"["+i+"] :");
                            arreglo[i] = entrada.nextInt();
                            
                            
                        }
                        
                         System.out.println("Arreglo Original");
                        
                         orden.mostrarDatos(arreglo);
                         
                          for(int i = 0; i<numeros; i++){
            
                           
                            orden.Insercion(arreglo, i+1);
                            
                            
                        }
                        break;
                    
                    case 4:
                        
                         System.out.println("Digite El tamaño del Arreglo:");
                        numeros = entrada.nextInt();
        
                        arreglo= new int [numeros];
                        for(int i = 0; i<numeros; i++){
            
                            System.out.print("Elemento en la posicion"+"["+i+"] :");
                            arreglo[i] = entrada.nextInt();
                        }
        
        
                        System.out.println("\n");
         
                        System.out.println("Arreglo Original");
                        
                         orden.mostrarDatos(arreglo);
                         
                        orden.radix(arreglo);
                        break;
                        
                    case 5:
                        
                        System.out.println("Digite El tamaño del Arreglo:");
                        numeros = entrada.nextInt();
        
                        arreglo = new int [numeros];
                        for(int i = 0; i<numeros; i++){
            
                            System.out.print("Elemento en la posicion"+"["+i+"] :");
                            arreglo[i] = entrada.nextInt();
                        }
        
        
                        System.out.println("\n");
         
                        System.out.println("Arreglo Original");
                        
                        orden.mostrarDatos(arreglo);
                         
                         orden.seleccion(arreglo);
                         break;
                         
                    case 6:
                        System.out.println("Digite El tamaño del Arreglo:");
                        numeros = entrada.nextInt();
        
                        arreglo= new int [numeros];
                        for(int i = 0; i<numeros; i++){
            
                            System.out.print("Elemento en la posicion"+"["+i+"] :");
                            arreglo[i] = entrada.nextInt();
                        }
        
        
                        System.out.println("\n");
         
                        System.out.println("Arreglo Original");
                        
                        orden.mostrarDatos(arreglo);
                        
                        System.out.println("Metodo Combinacion");
                        
                        
                        arreglo= orden.combinacion(arreglo);
                        orden.mostrarDatos(arreglo);
                        break;
                        
                        
                    default:
                        System.out.println("Opcion no valida");
                        break;
               }
            
            } catch (Exception e) {
                
                System.out.println(e);
            }
            
            System.out.println("Desea continuar (si / SI ) / ( no /  NO)");
            salir = entrada.next();
            
        } while( salir.equalsIgnoreCase("Si"));
        
        System.out.println("Fin del Programa.");
        
    }
}
