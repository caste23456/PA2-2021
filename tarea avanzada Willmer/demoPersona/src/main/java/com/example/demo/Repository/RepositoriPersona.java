/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repository;

import com.example.demo.Model.ModelPersona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author uth
 */
public interface RepositoriPersona extends CrudRepository<ModelPersona, Long> {
    
}
