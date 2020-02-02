/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monedas;

/**
 *
 * @author Juan Carlos Gomez
 */
public class Moneda {
    
private String nombre;
private int usuario[];

public Moneda(){

    usuario = new int[10];
    
}

public Moneda(String nombre){
    
    this();
    this.nombre = nombre;

}


public Boolean Transferencia(int idUsuario, int cantTrans) throws Exception {
    
    if( idUsuario < 0 || cantTrans < 0) throw new Exception("excepcion fuera de rango ");
    
    if (idUsuario >= usuario.length) { // creo vector nuevo
        
        int NewUsuario[] = new int[idUsuario];
        
        for (int i = 0; i < usuario.length; i++) { // copio los elementos del vector anterior
            
            NewUsuario[i] = usuario[i];
            
        }
        
        usuario = NewUsuario;//referencio usuario a la locacion del NewUsuario
        
        //ejecuto transferencia
        usuario[idUsuario] += cantTrans;
        return true;
        
    } else{ //el id esta en el rango del vector usuario
        
        //ejecuto transferencia
        usuario[idUsuario] += cantTrans;
        return true;
    }
    
    
}

public Boolean TransferenciaFrom(int idEmisor, int idReceptor, int cantTrans) throws Exception{

     if( idEmisor < 0 || idReceptor < 0 || cantTrans < 0) throw new Exception("excepcion fuera de rango ");
    
    if (idEmisor >= usuario.length || idReceptor >= usuario.length) { // creo vector nuevo ya que me piden un id mayor q los q tengo
      
        int NewUsuario[];
        
        if (idEmisor >= idReceptor) {
            
             NewUsuario = new int[idEmisor];
            
        } else{
        
             NewUsuario = new int[idReceptor];
        }
        
        
        for (int i = 0; i < usuario.length; i++) { // copio los elementos del vector anterior
            
            NewUsuario[i] = usuario[i];
            
        }
        
        usuario = NewUsuario;//referencio usuario a la locacion del NewUsuario
        
        //ejecuto transferencia
        if (usuario[idEmisor] < 0 || (usuario[idEmisor] - cantTrans) < 0) throw new Exception("El emisor no tiene el dinero para la transaccion");
                //transferir dinero
        usuario[idEmisor] -= cantTrans;
        usuario[idReceptor] += cantTrans;
        return true;
        
    } else{ //los id estan en el rango del vector usuario
        
        //ejecuto transferencia
        if (usuario[idEmisor] < 0 || (usuario[idEmisor] - cantTrans) < 0) throw new Exception("El emisor no tiene el dinero para la transaccion");
                //transferir dinero
        usuario[idEmisor] -= cantTrans;
        usuario[idReceptor] += cantTrans;
        return true;
    }
   

}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int[] getUsuario() {
        return usuario;
    }

    public void setUsuario(int[] usuario) {
        this.usuario = usuario;
    }


    
}
