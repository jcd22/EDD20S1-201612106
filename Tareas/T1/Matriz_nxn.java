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
public class Matriz_nxn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     Matriz mat = new Matriz(6); // inicializa con el tamano deseado
      mat.LlenarMatriz();
      mat.imprimirMatriz();
    }
    
    
    
}
