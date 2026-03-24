package com.Gerenciamento_Autores.Autores.repositories;


import com.Gerenciamento_Autores.Autores.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
}

