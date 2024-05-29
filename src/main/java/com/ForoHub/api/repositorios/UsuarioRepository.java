/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ForoHub.api.repositorios;

import com.ForoHub.api.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author JuanAstaiza
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    UserDetails findByUsername(String username);
    
}
