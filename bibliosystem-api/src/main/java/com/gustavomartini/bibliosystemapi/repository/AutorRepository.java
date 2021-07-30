package com.gustavomartini.bibliosystemapi.repository;

import com.gustavomartini.bibliosystemapi.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<AutorModel, Integer> {
}
