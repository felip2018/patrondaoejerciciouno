package com.adsi.dao.patrondao.dao;

import com.adsi.dao.patrondao.entity.Usuario;
import java.util.List;

public interface UsuarioDao {
    public List<Usuario> seleccionarTodosUsuarios();    
    public int guardarUsuario(Usuario usuario);     // Create
    public Usuario seleccionarUsuario(double numero_documento);  // Read
    public int actualizarUsuario(Usuario usuario);  // Update
    public int eliminarUsuario(int id_usuario);     // Delete
}
