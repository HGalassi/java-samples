package com.heitor.java.samples.service.impl;

import com.heitor.java.samples.entity.Usuario;
import com.heitor.java.samples.repository.UsuarioRepository;
import com.heitor.java.samples.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UsuarioRepository repository;

    public UserServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Usuario> getUsers() {
        return repository.findAll();
    }
}
