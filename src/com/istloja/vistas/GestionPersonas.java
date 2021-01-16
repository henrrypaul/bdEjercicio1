/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vistas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class GestionPersonas extends JFrame{
//    private JPanel panel = new JPanel();
    private JPanel panelTitulo = new JPanel();
//    panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

    public GestionPersonas() {
        //Mostrar Pantalla
        this.show();
        //Titulo de la venta
        this.setTitle("Formulario");
        //Tamanio Inicial de la pantalla
       
        JPanel panel = new JPanel();
//        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panelTitulo.setLayout(new FlowLayout());
        panel.setBackground(Color.YELLOW);
        
       
        //Se agregar un layout distribuir los componentes.
        panel.setLayout(new FlowLayout());
        panel.setLayout(new GridLayout(8, 2));
        panel.add(new JLabel("cedula:"));
        panel.add(new JTextField(10));
        panel.add(new JLabel("nombre:"));
        panel.add(new JTextField(10));
        panel.add(new JLabel("apellido:"));
        panel.add(new JTextField(10));
        panel.add(new JLabel("direccion:"));
        panel.add(new JTextField(10));
        panel.add(new JLabel("telefono:"));
        panel.add(new JTextField(10));
        panel.add(new JLabel("correo:"));
        panel.add(new JTextField(10));
        
        this.add(panel);
        
        JButton buttonAgregar = new JButton("agregar"); // se agrega los botones
        JButton buttonEditar = new JButton("editar");
        JButton buttonEliminar = new JButton("eliminar");
        JButton buttonURegistro = new JButton("ultimo registro");
        GridBagConstraints g_boton = new GridBagConstraints();
        
        panel.add(buttonAgregar);
        panel.add(buttonEditar);
        panel.add(buttonEliminar);
        panel.add(buttonURegistro);
          
         
        
        // posicion de los botones  
        g_boton.gridy = 0;
        g_boton.gridy = 9;
        panel.add(buttonURegistro, g_boton);
        
        g_boton.gridy = 1;
        g_boton.gridy = 9;
        panel.add(buttonAgregar, g_boton);

        g_boton.gridy = 2;
        g_boton.gridy = 9;
        panel.add(buttonEliminar, g_boton);

        g_boton.gridy = 3;
        g_boton.gridy = 9;
        panel.add(buttonEditar, g_boton);
        
        this.setSize(600,500); // tamanio del panel
//        JLabel label = new JLabel("VENTA DE REGISTRO DE PERSONAS.");  
        
//        JButton button = new JButton();  
//        button.setText("REGISTRAR PERSONAS");  
//        panel.add(label);
//        panel.add(button);
        //Agrege el panel al Jframe
        
        //Centrar la pantalla
        this.setLocationRelativeTo(null);  
        //Fin al programa.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
       
    }

   
    
}

