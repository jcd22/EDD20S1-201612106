/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_nxn;

/**
 *
 * @author chana
 */
public class Matriz {
    
    private int vect[][]; 
    private int tam = 0; //inicializa tamano matriz
    
    public Matriz(int tamano){
        
        tam = tamano;
        
        vect = new int[tamano][tamano];
        
        //for para llenar la matriz de 0
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
              
                vect[i][j] = 0;
            }
          
        }
        
    } // fin constructor
    
    public void LlenarMatriz(){ //llena la matriz con las especificaciones de la tarea
    
        llena0_n(tam);
        llenan_n(tam);
        llenan_0(tam);
        llena0_0(tam);
    
    }//----//
    
    public void llena0_n(int tamano){ // llena de columna 0 a columna n en fila 0
    
        for (int i = 0; i < tamano; i++) {
            
            vect[0][i] = 1;
        }
        
    }
    
    public void llenan_n(int tamano){//llena de fila 0 a fila n en columna n
    
        for (int i = 0; i < tamano; i++) {
            
            vect[i][tamano-1] = 1;
        }
    
    }
    
    public void llenan_0(int tamano){ // llena de columna n a columna 0 en fila n 
    
        for (int i = tamano-1; i >= 0; i--) {
            
            vect[tamano-1][i] = 1;
            
        }
        
    }
    
    public void llena0_0(int tamano){ // llena de fila n a 0 en columna 0
    
        for (int i = tamano-1; i >= 0 ; i--) {
            
            vect[i][0] = 1;
            
        }
    
    }
    
    public void imprimirMatriz(){ 
    
        for (int i = 0; i < tam; i++) {
            
            for (int j = 0; j < tam; j++) {
                
                System.out.print(" "+vect[i][j]+" ");
                
            }
            
            System.out.println("");
            System.out.println("");
            
        }
        
    }
    
}
