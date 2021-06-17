/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        boolean bandera = true;

        int edad;
        String nom;
        String apell;

        double mat;
        String rango;
        double suel;

        while (bandera) {
            System.out.println("Ingrese 1 si desea crear un Estudiante\n"
                    + "Ingrese 2 si desea crear un Estudiante\n"
                    + "Ingrese 3 si desea crear un Estudiante");
            opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion == 1 || opcion == 2 || opcion == 3) {
                System.out.println("\tDatos ");
                System.out.println("Ingrese su nombre");
                nom = entrada.nextLine();
                System.out.println("Ingrese su apellido");
                apell = entrada.nextLine();
                System.out.println("Ingrese su edad");
                edad = entrada.nextInt();
                entrada.nextLine();

                if (opcion == 1) {

                    System.out.println("Ingrese su Matricula\n");
                    mat = entrada.nextDouble();

                    entrada.nextLine();
                    Estudiante e = new Estudiante(nom, apell, edad, mat);
                    System.out.println(e);
                } else {
                    if (opcion == 2) {
                        System.out.println("Ingrese su Sueldo");
                        suel = entrada.nextDouble();

                        entrada.nextLine();
                        Docente d = new Docente(nom, apell, edad, suel);
                        System.out.println(d);
                    } else {
                        if (opcion == 3) {

                            System.out.println("Ingrese su Rango");
                            rango = entrada.nextLine();

                            entrada.nextLine();
                            Policia p = new Policia(nom, apell, edad, rango);
                            System.out.println(p);

                        }else {
                            
                            System.out.println("La opcion que ingresaste es incorrecta");
                        }}
                    }

                }

            

            }

            System.out.println("Digite si para ingresar datos\n"
                    + "Digite no para salir del ciclo");
            String v = entrada.nextLine();
            if (v.toLowerCase().equals("si")) {
                bandera = true;
            } else if (v.toLowerCase().equals("no")) {
                bandera = false;
            }

            /*
        Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println(e);
        // Un docente hereda de una Persona y adicionalmente tiene 
        // la característia sueldo
        Docente d = new Docente("Luis", "Alvarez", 40, 1000); // falta implementar
        System.out.println(d);
        
        // Un policia hereda de una Persona y adicionalmente tiene 
        // la característia rango
        Policia p = new Policia("ALEX", "MENDOZA", 35, "Cabo"); // falta implementar
        System.out.println(p);
             */
        }

    }
