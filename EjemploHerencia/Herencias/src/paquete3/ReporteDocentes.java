/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Docente;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ReporteDocentes extends Reporte {
     private ArrayList<Docente> lista;
    private double promedioSueldo;

    public ReporteDocentes(String n, ArrayList<Docente> lis) {
        super(n);
        establecerLista(lis);
    }

    public void establecerLista(ArrayList<Docente> s) {
        lista = s;
    }

    public void establecerPromedioSueldo() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).obtenerSueldo();
        }
        promedioSueldo = suma / lista.size();
    }

    public ArrayList<Docente> obtenerLista() {
        return lista;
    }

    public double obtenerPromedioSueldo() {
        return promedioSueldo;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t\t\tDOCENTE\nCodigo: %s",
                super.toString());
        for (int i = 0; i < obtenerLista().size() ; i++) {
            cadena = String.format("%s\nNombre: %s - Apellido: %s - "
                    + "Edad: %s - Sueldo: %.2f",
                cadena,
                obtenerLista().get(i).getNombre(),
                obtenerLista().get(i).getApellido(),
                obtenerLista().get(i).getEdad(),
                obtenerLista().get(i).obtenerSueldo());
            
                
        }
        cadena = String.format("%s\nPromedio de sueldos: %.2f", cadena,
                obtenerPromedioSueldo());
        

        return cadena;
    }
}
