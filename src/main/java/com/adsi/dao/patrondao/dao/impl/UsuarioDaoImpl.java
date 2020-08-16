package com.adsi.dao.patrondao.dao.impl;

import com.adsi.dao.patrondao.connection.ConexionDb;
import com.adsi.dao.patrondao.dao.UsuarioDao;
import com.adsi.dao.patrondao.entity.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImpl implements UsuarioDao {
    
    private ConexionDb conexionDb;
    
    public UsuarioDaoImpl(){
        conexionDb = new ConexionDb();
    }
    
    @Override
    public List<Usuario> seleccionarTodosUsuarios() {
        
        List<Usuario> listado = new ArrayList<>();
        
        try{
            
            PreparedStatement ps = conexionDb.conectar().prepareStatement("SELECT * FROM usuario");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) { // Se recorre lo que saco de la tabla usuario registro por registro
                Usuario usuario = new Usuario();
                //respuesta += i+") "+rs.getString("nombre")+", Salario: $"+rs.getFloat("salario")+" \n";
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setId_perfil(rs.getInt("id_perfil"));
                usuario.setId_tipo_doc(rs.getInt("id_tipo_doc"));
                usuario.setNum_doc(rs.getInt("num_doc"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setClave(rs.getString("clave"));
                usuario.setFoto(rs.getString("foto"));
                usuario.setCodigo_validacion(rs.getString("codigo_validacion"));
                usuario.setValidacion_cuenta(rs.getBoolean("validacion_cuenta"));
                usuario.setFecha_registro(rs.getDate("fecha_registro"));
                usuario.setEstado_registro(rs.getString("estado_registro"));
                
                listado.add(usuario);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Se ejecuto el metodo listar!");
        }
        
        return listado;
    }

    @Override
    public int guardarUsuario(Usuario usuario) {
        int rows = 0;
        try {
            PreparedStatement ps = conexionDb.conectar().prepareStatement("INSERT INTO usuario(id_perfil, id_tipo_doc, num_doc, nombre, apellido, telefono, correo, clave, foto, codigo_validacion, validacion_cuenta, fecha_registro, estado_registro) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, usuario.getId_perfil());//ok
            ps.setInt(2, usuario.getId_tipo_doc());//ok
            ps.setInt(3, usuario.getNum_doc());//ok
            ps.setString(4, usuario.getNombre());//ok
            ps.setString(5, usuario.getApellido());//ok
            ps.setString(6, usuario.getTelefono());
            ps.setString(7, usuario.getCorreo());//ok
            ps.setString(8, usuario.getClave());
            ps.setString(9, usuario.getFoto());
            ps.setString(10, usuario.getCodigo_validacion());
            ps.setBoolean(11, usuario.isValidacion_cuenta());
            ps.setDate(12, usuario.getFecha_registro());
            ps.setString(13, usuario.getEstado_registro());
            
            rows = ps.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error: "+e.getMessage());
        }
        
        return rows;
    }

    @Override
    public Usuario seleccionarUsuario(double numero_documento) {
        Usuario usuario = new Usuario();
        try {
            PreparedStatement ps = conexionDb.conectar().prepareStatement("SELECT * FROM usuario "
                    + "WHERE num_doc = ? AND estado_registro = 'Activo' LIMIT 1");
            ps.setDouble(1, numero_documento);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setId_perfil(rs.getInt("id_perfil"));
                usuario.setId_tipo_doc(rs.getInt("id_tipo_doc"));
                usuario.setNum_doc(rs.getInt("num_doc"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setEstado_registro(rs.getString("estado_registro"));
            }
            
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error: "+e.getMessage());
        }
        
        return usuario;
    }

    @Override
    public int actualizarUsuario(Usuario usuario) {
        int rows = 0;
        try {
            PreparedStatement ps = conexionDb.conectar().prepareStatement("UPDATE usuario "
                    + "SET id_perfil = ?,"
                    + "id_tipo_doc   = ?,"
                    + "nombre        = ?,"
                    + "apellido      = ?,"
                    + "correo        = ? "
                    + " WHERE id_usuario = ?");
            ps.setInt(1, usuario.getId_perfil());//ok
            ps.setInt(2, usuario.getId_tipo_doc());//ok
            ps.setString(3, usuario.getNombre());//ok
            ps.setString(4, usuario.getApellido());//ok
            ps.setString(5, usuario.getCorreo());//ok
            ps.setInt(6, usuario.getId_usuario());
            
            rows = ps.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error: "+e.getMessage());
        }
        
        return rows;
    }

    @Override
    public int eliminarUsuario(int id_usuario) {
        int rows = 0;
        try {
            PreparedStatement ps = conexionDb.conectar().prepareStatement("UPDATE usuario "
                    + "SET estado_registro = 'Inactivo' "
                    + "WHERE id_usuario = ?");
            ps.setDouble(1, id_usuario);
            
            rows = ps.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error: "+e.getMessage());
        }
        
        return rows;
    }
    
}
