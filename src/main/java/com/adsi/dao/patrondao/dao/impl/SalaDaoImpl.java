/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.dao.patrondao.dao.impl;

import com.adsi.dao.patrondao.connection.ConexionDb;
import com.adsi.dao.patrondao.dao.SalaDao;
import com.adsi.dao.patrondao.entity.Sala;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrea Ramirez
 */
public class SalaDaoImpl implements SalaDao{
    
    private ConexionDb conexionDb;
    
    public SalaDaoImpl (){
        ConexionDb conexionDb = new ConexionDb();
    }

    @Override
    public List<Sala> seleccionarsalas() {
      
        List<Sala> listado = new ArrayList<>();
        
        try {
            PreparedStatement ps = conexionDb.conectar().prepareStatement("SELETC * FEOM sala");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Sala sala = new Sala();
                
                sala.setId_sala(rs.getInt("id_sala"));
                sala.setId_sucursal(rs.getInt("id_sucursal"));
                sala.setNombre(rs.getString("nombre"));
                sala.setPrecio(rs.getDouble("precio"));
                sala.setDescripcion(rs.getString("descripcion"));
                sala.setFecha_registro(rs.getDate("fecha_registro"));
                sala.setEstado_registro(rs.getString("estado_registro"));
                
                listado.add(sala);
            }
            
        } catch (Exception e) {
           System.out.println(e.getMessage());
        } finally {
            System.out.println("Se ejecuto el metodo listar!");
        }
        
        return listado;
    }

    @Override
    public int guardarSala(Sala sala) {
       int rows = 0;
       try {
           PreparedStatement ps = conexionDb.conectar().prepareStatement("INSERT INTO sala(id_sucursal, nombre, precio, descripcion, fecha_registro, estado_registro)"
                   + "VALUES (?,?,?,?,?,?)");  
           ps.setInt(1, sala.getId_sucursal());
           ps.setString(2, sala.getNombre());
           ps.setDouble(3, sala.getPrecio());
           ps.setString(4, sala.getDescripcion());
           ps.setDate(5, sala.getFecha_registro());
           ps.setString(6, sala.getEstado_registro());
           
           rows = ps.executeUpdate();
           
       } catch (Exception e) {
            System.err.println("Ha ocurrido un error: "+e.getMessage());
        }
       return rows;
    }

    @Override
    public Sala seleccionarSala(double precio) {
        Sala sala = new Sala();
        try {
            
            PreparedStatement ps = conexionDb.conectar().prepareStatement("SELECT * FROM sala "
                    + "WHERE precio = ? AND estado_registro = 'Activo' LIMIT 1");
            ps.setDouble(1, precio);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                sala.setId_sala(rs.getInt("id_sala"));
                sala.setId_sucursal(rs.getInt("id_sucursal"));
                sala.setNombre(rs.getString("nombre"));
                sala.setPrecio(rs.getDouble("precio"));
                sala.setDescripcion(rs.getString("descripcion"));
                sala.setFecha_registro(rs.getDate("fecha_registro"));
                sala.setEstado_registro(rs.getString("estado_registro"));
              
            }
            
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error: "+e.getMessage());
        }
        return sala;
    }
        


    @Override
    public int actualizarSala(Sala sala) {
        int rows = 0;
        try {
            PreparedStatement ps = conexionDb.conectar().prepareStatement("UPDATE sala "
                    + "SET id_sucursal = ?,"
                    + "nombre          = ?,"
                    + "precio          = ?,"
                    + "descripcion     = ?,"
                    + "WHERE id_sala   = ?,");
            ps.setInt(1, sala.getId_sucursal());
            ps.setString(2, sala.getNombre());
            ps.setDouble(3, sala.getPrecio());
            ps.setString(4, sala.getDescripcion());
            ps.setInt(5, sala.getId_sala());
            
            rows = ps.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error: "+e.getMessage()); 
        }
        return rows;
        
         }
         
        
    @Override
    public int eliminarSala(int id_sala) {
        int rows = 0;
        try {
            PreparedStatement ps = conexionDb.conectar().prepareStatement("UPDATE sala "
                    + "SET estado_registro = 'Inactivo' "
                    + "WHERE id_sala = ?");
            ps.setDouble(1, id_sala);
            
            rows = ps.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error: "+e.getMessage());
        }
        return rows;
    }
    
    
}
