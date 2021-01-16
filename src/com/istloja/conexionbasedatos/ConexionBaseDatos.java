/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.conexionbasedatos;

import com.istloja.controlador.personabd;
import com.istloja.modelo.persona;

import com.istloja.vistas.GestionPersonas;
import java.sql.Connection;

/**
 *
 * @author USUARIO
 */
public class ConexionBaseDatos {
    
    public static void main(String[] args) {
        // TODO code application logic here
        personabd personabd = new personabd();
        //System.out.println("PERSONAS: "+personabd.obtenerPersonas() );
//        for (Persona arg : personabd.obtenerPersonas()) {
//            System.out.println(arg);
//        }
//        Persona persona = new Persona(4,"2101125336","javier alejandro","ordonez","Lago agrio","jvier@gmail.com","0988655");
//        if (personabd.registrarPersona(persona)) {
//            System.out.println("Persona registrada en la base de datos.");
//        }else{
//            System.out.println("Error al guardar los datos.");
//        }
//        Persona persona = new Persona(1);
//        if (personabd.eliminar(persona)) {
//            System.out.println("Persona Eliminada del sistema.");
//        } else {
//            System.out.println("No se pudo eliminar");
//        }
        GestionPersonas GestionPersonas = new GestionPersonas();
//        Formulario Formulario = new Formulario();

    }
    
}


//        persona.setIdPersona(2);
//        persona.setCedula("110425555");
//        persona.setNombre("John");
//        persona.setApellidos("Solano");
//        persona.setDireccion("Loja");
//        persona.setCorreo("jpsolanoc@gmail.com");
//        persona.setTelefono("0979256768");

