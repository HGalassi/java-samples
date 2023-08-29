package com.heitor.java.samples.entity.service;

import com.heitor.java.samples.entity.Usuario;
import com.heitor.java.samples.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository jpaService;

    public UsuarioService(UsuarioRepository jpaService) {
        this.jpaService = jpaService;
    }
    public List<Usuario> getUsuarios(){
        List<Usuario> all = jpaService.findAll();
        return all;
    }

}
