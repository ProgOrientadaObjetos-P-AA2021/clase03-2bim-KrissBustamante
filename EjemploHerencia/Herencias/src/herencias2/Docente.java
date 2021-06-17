/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

/**
 *
 * @author USUARIO
 */
public class Docente extends Persona {
     private double sueldo;
    public Docente(String n, String a, int e, double b){
        super(n, a, e);
        sueldo = b;
        establecerSueldo(b);
    }
    
    public void establecerSueldo(double n){
       if(sueldo<1000){
       sueldo =1000;
       }else{
       sueldo = n;
       } 
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }

    
    @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(),
                obtenerSueldo());
    }
}
