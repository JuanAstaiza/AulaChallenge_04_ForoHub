/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ForoHub.api.servicios;

import com.ForoHub.api.modelos.Topicos;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ForoHub.api.repositorios.TopicosRepository;

/**
 *
 * @author JuanAstaiza
 */
@Service
public class TopicosServicio implements Topicos_crud {
    
    @Autowired
    private TopicosRepository repositorio;
    
    private Integer id;
    
    @Override
    public List<Topicos> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Topicos findByID(Integer id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Topicos save(Topicos topicos) {
        return repositorio.save(topicos);
    }

    @Override
    public Topicos update(Integer id, Topicos topicos) {
        topicos.setId(id);
        return repositorio.save(topicos);
    }

    @Override
    public void deleteById(Integer id) {
        repositorio.deleteById(id);
    }
    
}
