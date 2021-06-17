/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ReporteEstudiantes extends Reporte{
     private ArrayList<Estudiante> lista;
    private double promedioMatriculas;

    public ReporteEstudiantes(String n, ArrayList<Estudiante> lis) {
        super(n);
        establecerLista(lis);
    }

    public void establecerLista(ArrayList<Estudiante> s) {
        lista = s;
    }

    public void establecerPromedioMatriculas() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getMatricula();
        }
        promedioMatriculas = suma / lista.size();
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    public double obtenerPromedioMatricula() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String cadena = String.format("Estudiante"
                + "\nCodigo: %s",
                super.toString());
        for (int i = 0; i < obtenerLista().size(); i++) {
            cadena = String.format("%s\nNombre: %s - Apellido: %s - Edad: %s "
                    + "- Precio Matricula: %.2f",
                    cadena,
                    obtenerLista().get(i).getNombre(),
                    obtenerLista().get(i).getApellido(),
                    obtenerLista().get(i).getEdad(),
                    obtenerLista().get(i).getMatricula());

        }
        cadena = String.format("%s\nPromedio de matriculas: %.2f", cadena,
                obtenerPromedioMatricula());

        return cadena;
    }
}
