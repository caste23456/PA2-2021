/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.servicios;

import com.example.demo.Model.ModelPersona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.RepositoriPersona;

/**
 *
 * @author uth
 */
@Service
public class PersonaServicio {
    @Autowired
    private RepositoriPersona repositorio;
    
    public ModelPersona guardar(ModelPersona entidad){
        return repositorio.save(entidad);
    }
    
    public void eliminar(Long id){
        repositorio.deleteById(id);
    }
    
    public Optional<ModelPersona> getValor(Long id){
        return repositorio.findById(id);
    }
    
    public List<ModelPersona> getTodos(){
        return (List<ModelPersona>)repositorio.findAll();
    }
}
