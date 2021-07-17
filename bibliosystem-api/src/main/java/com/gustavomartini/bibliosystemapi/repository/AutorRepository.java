package com.gustavomartini.bibliosystemapi.repository;

import com.gustavomartini.bibliosystemapi.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
}
