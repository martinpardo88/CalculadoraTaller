/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploJLabel;
import javax.swing.*;
/**
 *
 * @author PC
 */
public class ejemploJLabel {
    
    public static void main(String[] args){
       
           JFrame ventana = new JFrame("MI PRIMERA VENTANA");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar la ventana
    ventana.setSize(800, 600);
    ventana.setLayout(null);
        
    JLabel etiqueta = new JLabel("Mi CALCULADORA ");
    etiqueta.setBounds(350, 10, 150, 50); //posicion centrado. 
    ventana.add(etiqueta);
   
    String informacionJLabel =   etiqueta.getText();
    System.out.println(informacionJLabel);    
  
    
    
    
    JLabel etiqueta2 =new JLabel("INGRESE SU NOMBRE:");
    etiqueta2.setBounds(200,100,150,30);
    ventana.add(etiqueta2);
    
    JTextField campo1 = new JTextField();
    campo1.setBounds(350,100, 150, 30);
    campo1.setText("MARTIN PARDO");
    ventana.add(campo1);
    
    
    JButton boton1= new JButton("DAR CLICK ACA");
    boton1.setBounds(300,150,150,30);
    ventana.add(boton1);
    
    
    String[] opcion = new String[5];
    opcion[0]= "Seleccion opcion";
    opcion[1]= "sumar";
    opcion[2]= "restar";        
    opcion[3]= "dividir";       
    opcion[4]= "multiplicar";     
    JComboBox combo1 = new JComboBox(opcion);
    combo1.setBounds(300,200,150,30);
    combo1.setSelectedIndex(2);
    ventana.add(combo1);
    
    
    
    
    
    
 
    
    
    
    
    ventana.setVisible(true);
    
    
    
    
    
        
    }
    
    
    
    
}
