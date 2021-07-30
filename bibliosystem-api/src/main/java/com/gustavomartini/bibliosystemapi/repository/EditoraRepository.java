package com.gustavomartini.bibliosystemapi.repository;

import com.gustavomartini.bibliosystemapi.models.EditoraModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditoraRepository extends JpaRepository<EditoraModel, Integer> {
}
