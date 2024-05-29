/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ForoHub.api.repositorios;

import com.ForoHub.api.modelos.Topicos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author JuanAstaiza
 */

public interface TopicosRepository extends JpaRepository<Topicos, Integer> {
    
}
