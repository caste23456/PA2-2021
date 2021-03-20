/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Controllers;


import com.example.demo.Model.ModelPersona;
import com.example.demo.servicios.PersonaServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author guzma
 * 
 */
@RestController
@RequestMapping(value="/ws/persona")
public class DemoPersonaApiController {
    
    @Autowired
    private PersonaServicio servicio;
    
    @GetMapping(value="/")
    public List<ModelPersona> getTodos(){
         return servicio.getTodos();
    }
    
    @GetMapping(value="/{id}")
    public Optional<ModelPersona> getValor(@PathVariable Long id){
        return servicio.getValor(id);
    }
    
    @PostMapping(value="/guardar")
    public ModelPersona guardar(@RequestBody ModelPersona persona ){
        return servicio.guardar(persona);
    }
    
    @GetMapping(value="/eliminar/{id}")
    public Optional<ModelPersona> eliminar(@PathVariable Long id){
        Optional<ModelPersona> personaEliminada = servicio.getValor(id);
        servicio.eliminar(id);
        return personaEliminada;
    }
}
