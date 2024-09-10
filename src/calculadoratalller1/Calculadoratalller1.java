/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoratalller1;
import javax.swing.*;
public class Calculadoratalller1 {

    public static void main(String[] args) {

        String num1 = "";
        String num2 = "";

        JOptionPane.showMessageDialog(null, "BIENVENIDO A MI CALCULADORA");
        String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir" , "Salir"};
        int seleccion = JOptionPane.showOptionDialog(null, "SELECCION UNA OPCION", 
                "Menú de Operaciones", JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        
        if (seleccion == 4) {
            JOptionPane.showMessageDialog(null, "saliste.");
            System.exit(0); 
        }

         if (seleccion >= 0 ) {
            num1 = JOptionPane.showInputDialog("Ingrese el primer número:");
            num2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
         }

        double numero1 = Double.parseDouble(num1);
        double numero2 = Double.parseDouble(num2);
        double resultado = 0;

        switch (seleccion) {
                case 0:
                    resultado = numero1 + numero2;
                    break;
                case 1: 
                    resultado = numero1 - numero2;
                    break;
                case 2:
                    resultado = numero1 * numero2;
                    break;
                case 3: 
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Su resultado es 0");
                        System.exit(0); 
                    }
                    break;
            }
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    
}
