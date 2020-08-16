package com.adsi.dao.patrondao.entity;

import java.time.LocalDateTime;
import java.sql.Date;

public class Usuario {

    private int id_usuario;
    private int id_perfil;
    private int id_tipo_doc;
    private int num_doc;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String clave;
    private String foto;
    private String codigo_validacion;
    private boolean validacion_cuenta;
    private Date fecha_registro;
    private String estado_registro;
    
    public Usuario(){}
    
    public Usuario(int id_perfil, int id_tipo_doc, int num_doc, String nombre, String apellido, String correo, String clave) {
        this.id_perfil = id_perfil;
        this.id_tipo_doc = id_tipo_doc;
        this.num_doc = num_doc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.clave = clave;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public int getId_tipo_doc() {
        return id_tipo_doc;
    }

    public void setId_tipo_doc(int id_tipo_doc) {
        this.id_tipo_doc = id_tipo_doc;
    }

    public int getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(int num_doc) {
        this.num_doc = num_doc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCodigo_validacion() {
        return codigo_validacion;
    }

    public void setCodigo_validacion(String codigo_validacion) {
        this.codigo_validacion = codigo_validacion;
    }

    public boolean isValidacion_cuenta() {
        return validacion_cuenta;
    }

    public void setValidacion_cuenta(boolean validacion_cuenta) {
        this.validacion_cuenta = validacion_cuenta;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getEstado_registro() {
        return estado_registro;
    }

    public void setEstado_registro(String estado_registro) {
        this.estado_registro = estado_registro;
    }

}
