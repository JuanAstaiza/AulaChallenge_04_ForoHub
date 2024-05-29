/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ForoHub.api.controladores;

import com.ForoHub.api.modelos.Topicos;
import com.ForoHub.api.servicios.TopicosServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JuanAstaiza
 */
@RestController
@RequestMapping("/topicos")
public class TopicosController {
    
    @Autowired
    private TopicosServicio service;

    @GetMapping
    public ResponseEntity<List<Topicos>>findAll(){
        List <Topicos> respuestaHttp = service.findAll();
        return new ResponseEntity<>(respuestaHttp, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Topicos> findById(@PathVariable Integer id){
        Topicos respuestaHttp = service.findByID(id);
        return new ResponseEntity<>(respuestaHttp, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Topicos> save(@RequestBody Topicos topicos){
        Topicos respuestaHttp = service.save(topicos);
        return new ResponseEntity<>(respuestaHttp, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topicos> update(@PathVariable Integer id, @RequestBody Topicos topicos){
    topicos.setId(id);
    Topicos respuestaHttp = service.save(topicos);
    return new ResponseEntity<>(respuestaHttp, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id){
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
