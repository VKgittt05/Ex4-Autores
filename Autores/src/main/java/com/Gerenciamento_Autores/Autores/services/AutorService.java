package com.Gerenciamento_Autores.Autores.services;

import com.Gerenciamento_Autores.Autores.models.Autor;
import com.Gerenciamento_Autores.Autores.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;

    public Autor salvar(Autor autor) {
        return repository.save(autor);
    }

    public List<Autor> listarTodos() {
        return repository.findAll();
    }

    public Optional<Autor> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

