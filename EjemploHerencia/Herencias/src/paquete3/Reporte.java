/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author USUARIO
 */
public class Reporte {
     protected String codigo;
    
    public Reporte(String n){
        codigo = n;
    }
    
    public void establecerCodigo(String n){
        codigo = n;
    }
    
    public String obtenerCodigo(){
        return codigo;
    }
    
    @Override
    public String toString(){
        return String.format("%s",codigo);
    } 
}
