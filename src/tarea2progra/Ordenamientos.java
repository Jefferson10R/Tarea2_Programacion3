
package tarea2progra;

/**
 *
 * @author Jefferson Lopez 
 */
public class Ordenamientos {
    
    
    
    // Metodo Burbuja 
    
    public void Burbuja(int  arreglo[]){
        
        int temporal;
        
        for (int i = 0; i <arreglo.length; i++) {
            
            for (int j = i+1 ; j < arreglo.length; j++) {
                
                if(arreglo[i]> arreglo[j]){
                    temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                    
                }
                
            }
            
        }
        System.out.println("Metodo Burbuja\n");
        mostrarDatos(arreglo);
        
    }
    
    
     // Metodo Quick 
    
    public void Quick(int arreglo [] , int inicio  ,int fin){
        
        int i , j , pivote , auxiliar;
        i= inicio;
        j = fin;
        
        pivote = arreglo[(inicio+fin)/2];
        do{
            
            while(arreglo[i]<pivote){
                i++;
            }
            while(arreglo[j]>pivote){
                j--;
            }
            
            if(i<=j){
                auxiliar = arreglo[i];
                arreglo[i]= arreglo[j];
                arreglo[j]= auxiliar;
                i++;
                j--;
            }
            
            
        }while(i<=j);
        
        if(inicio<j){
            
            Quick(arreglo, inicio, j);  
            
        }
        
        if(i<fin){
            Quick(arreglo, i, fin);
        }
        
         System.out.println("\nMetodo Quick\n");
        mostrarDatos(arreglo);
    }
    
    
    // Metodo Insercion
    
    public void Insercion(int  arreglo [] ,int  n){
        
        int i , j , auxiliar;
        
        for(i= 1; i<n;i++){
            auxiliar= arreglo[i];
            j=i-1;
            while(j>=0 && arreglo[j]>auxiliar){
                
                arreglo[j+1]= arreglo[j];
                j--;
            }
            arreglo[j+1]=auxiliar;
            
        }
        
        System.out.println("\nMetodo Insercion");
        
        mostrarDatos(arreglo);
    }
    
    
    
    
     // Metodo radix
    
    public void radix(int  arreglo []){
        
       for(int x = Integer.SIZE-1; x >=0;x--){
        int auxiliar [] = new int[arreglo.length];
        int j = 0;
        for(int i = 0; i <arreglo.length; i++){
            boolean mover = arreglo[i] << x >=0;
            if(x==0 ? !mover:mover){
                auxiliar[j]= arreglo[i];
                j++;
                
            }else{
                arreglo[i-j]= arreglo[i];
            }
            
        }
        for(int i = j; i< auxiliar.length;i++){
            auxiliar[i]=arreglo[i-j];
        }
        arreglo= auxiliar;
       } 
       
        System.out.println("\nMetodo Radix");
       
        mostrarDatos(arreglo);
        
        
    }
    
    // Metodo Seleccion 
    
    
    public void seleccion(int arreglo[]){
        
        for(int i = 0 ; i< arreglo.length-1 ; i++){
            int minimo = i;
            for(int j = i+1; j < arreglo.length; j++){
                if(arreglo[j] < arreglo[minimo]){
                    minimo = j;
                }
            }
            
            int auxiliar = arreglo[i];
            arreglo[i] = arreglo[minimo];
            arreglo[minimo]  = auxiliar;
        }
        System.out.println("\nMetodo Seleccion");
        mostrarDatos(arreglo);
        
    }
    
    
    
    //Metodo Combinacion
    
    public int [] combinacion (int arreglo[]){
        
        int i , j , k;
        if(arreglo.length > 1){
            int elementosizquierda = arreglo.length / 2;
            int elementosderecha = arreglo.length - elementosizquierda;
            int arregloizquierda[] = new int [elementosizquierda];
            int arregloderecha[] = new int [elementosderecha];
            
            for(i = 0; i < elementosizquierda; i++){
                arregloizquierda[i] = arreglo[i];
            }
            
            for(i = elementosizquierda; i < elementosizquierda +elementosderecha; i++){
                arregloderecha[i-elementosizquierda] = arreglo[i];
            }
            
            arregloizquierda = combinacion(arregloizquierda);
            arregloderecha = combinacion(arregloderecha);
            i = 0;
            j = 0;
            k = 0;
            
            while(arregloizquierda.length != j && arregloderecha.length != k){
                if(arregloizquierda[j]< arregloderecha[k]){
                    arreglo[i]= arregloizquierda[j];
                    i++;
                    j++;
                }else{
                    arreglo[i] = arregloderecha[k];
                    i++;
                    k++;
                }
            }
            
            while(arregloizquierda.length != j ){
                arreglo[i] = arregloizquierda[j];
                i++;
                j++;
            }
            
            while(arregloderecha.length != k ){
                arreglo[i] = arregloderecha[k];
                i++;
                k++;
            }
            
        }
        
        return arreglo;
    }
    
    
   
     
    // Metodo para mostrar los datos
    
    public void mostrarDatos(int [] arreglo){
        
        
        for (int k = 0; k < arreglo.length; k++) {
            System.out.print("["+arreglo[k]+"]");
        }        
        System.out.println();
        
    }
    
}
