/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos

        // Trabajo clases 13 junio 2022
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";

        while (bandera) {
            System.out.println("Ingrese nombre");
            String n = entrada.nextLine();
            System.out.println("Ingrese apellido");
            String ap = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String ced = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de créditos");
            int creditos = entrada.nextInt();
            System.out.println("Ingrese costo de créditos");
            double costo = entrada.nextDouble();
            entrada.nextLine();
            EstudiantePresencial presencial
                    = new EstudiantePresencial(n, ap, ced,
                            edad, costo, creditos);
            presencial.calcularMatriculaPresencial();
            cadena = String.format("%s%s\n", cadena, presencial);
            System.out.println("Desea salir, pulse S");
            String opcion = entrada.nextLine();
            if (opcion.equals("S")) {
                bandera = false;
            }
        }

        System.out.printf("%s\n", cadena);

    }
}
