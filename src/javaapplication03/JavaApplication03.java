/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication03;

import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class JavaApplication03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando nuevo onjeto Scanner
        Scanner input = new Scanner(System.in);
                
        // Mostrar mensaje al usuario 
        System.out.println("Ingresar un numero entre 0 y 1000");
        int number = input.nextInt();
        
        // Calcular la suma de los digitos del numero entero
        int menorque10 = number % 10;
        number = number / 10;
        
        int decenas = number % 10;
        number /= 10 ;
        
        int centenas = number % 10;
        number /= 10;
        
        int suma = centenas + decenas + menorque10;
        
        // Mostrar resultado
        System.out.println("La suma de los digitos es: "+ suma);
    }
    
}
