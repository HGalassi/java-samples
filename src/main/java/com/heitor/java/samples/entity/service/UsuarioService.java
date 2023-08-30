package com.heitor.java.samples.entity.service;

import com.heitor.java.samples.dto.UsuarioDto;
import com.heitor.java.samples.dto.mapper.CycleAvoidingMappingContext;
import com.heitor.java.samples.dto.mapper.UsuarioMapper;
import com.heitor.java.samples.dto.mapper.UsuarioMapperImpl;
import com.heitor.java.samples.entity.Usuario;
import com.heitor.java.samples.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository jpaService;

    private UsuarioMapper mapper;

    public UsuarioService(UsuarioRepository jpaService) {
        this.jpaService = jpaService;
        this.mapper = new UsuarioMapperImpl();
    }
    public List<UsuarioDto> getUsuarios(){
        List<UsuarioDto> dto = new ArrayList<>();
        List<Usuario> all = jpaService.findAll();

        all.forEach(f-> dto.add(mapper.usuarioToUsuarioDto(f, new CycleAvoidingMappingContext())));
        return dto;
    }

}
