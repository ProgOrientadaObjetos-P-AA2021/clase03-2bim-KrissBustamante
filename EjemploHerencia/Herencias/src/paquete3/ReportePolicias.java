/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Policia;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ReportePolicias extends Reporte {
    
    private double promedioEdad;
    private ArrayList<Policia> lista;

    public ReportePolicias(String n, ArrayList<Policia> lis) {
        super(n);
        establecerLista(lis);
    }

    public void establecerLista(ArrayList<Policia> s) {
        lista = s;
    }
 // Tambiense puede poner calcular :s
    public void establecerPromedioEdad() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getEdad();
        }
        promedioEdad = suma / lista.size();
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    public double obtenerPromedioEdad() {
        return promedioEdad;
    }

    @Override
    public String toString() {
        String cadena = String.format("Policia\nCodigo: %s",
                super.toString());
        for (int i = 0; i < obtenerLista().size(); i++) {
            cadena = String.format("%s\nNombre: %s - Apellido: %s - Edad: %s",
                    cadena,
                    obtenerLista().get(i).getNombre(),
                    obtenerLista().get(i).getApellido(),
                    obtenerLista().get(i).getEdad());
        }
        cadena = String.format("%s\nPromedio de edades: %.2f", cadena,
                obtenerPromedioEdad());

        return cadena;
    }
}
