/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.controlador;

import com.istloja.modelo.persona;
import java.sql.Connection;
import java.sql.Statement;
import com.istloja.conexion.conexion;
import java.sql.SQLException;

public class personabd {

    
    // crud registrar
    
    
    public boolean registrarPersona(persona persona) {
        boolean registrar = false;
        Statement stm = null;// acceso a la base de datos
        Connection con = null;// se conecta con la base de datos
        String sql = "INSERT INTO `bdejercicio1`.`persona` (`idpersona`, `cedula`, `nombres`, `apellidos`, `direccion`, `correo`, `telefono`)VALUES ('" + String.valueOf(persona.getIdPersona()) + "', '" + persona.getCedula() + "', '" + persona.getNombres() + "', '" + persona.getApellidos() + "', '" + persona.getDireccion() + "', '" + persona.getCorreo() + "', '" + persona.getTelefono() + "');";
        try {
            //Instancia de la conexion previamente creada
            conexion conexion = new conexion();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());

        }
        return registrar;

    }
    
    
    
    //CRUD EDITAR O ACTUALIZAR

    public boolean actualizarPersona(persona persona) {
        boolean actualizar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "UPDATE `bdejercicio1`.`persona` SET `nombres` = 'Henry', `apellidos` = 'Ordonez', `telefono` = '5325623232' WHERE (`idpersona` = '1');";
        try {
            conexion conexion = new conexion();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            actualizar = true;
            stm.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return actualizar;
    }

    public boolean eliminarPersona(persona persona) {
        boolean eliminar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "DELETE FROM `bdejercicio1`.`persona` WHERE (`idpersona` = '2');";
        try {
            conexion conexion = new conexion();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            eliminar = true;
            stm.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return eliminar;
    }
}
    

