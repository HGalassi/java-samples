package com.heitor.java.samples.entity;

import com.heitor.java.samples.dto.UsuarioDto;
import com.heitor.java.samples.entity.service.UsuarioService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/users")
    private List<UsuarioDto> get(){
        return usuarioService.getUsuarios();
    }
}
