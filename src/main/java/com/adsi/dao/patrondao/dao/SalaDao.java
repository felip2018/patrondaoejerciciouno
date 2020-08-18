/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.dao.patrondao.dao;

import com.adsi.dao.patrondao.entity.Sala;
import java.util.List;

/**
 *
 * @author Andrea Ramirez
 */
public interface SalaDao {
    public List<Sala> seleccionarsalas();
    public int guardarSala(Sala sala);
    public Sala seleccionarSala(double precio);
    public int actualizarSala(Sala sala);
    public int eliminarSala(int id_sala);
    
}
    
    

