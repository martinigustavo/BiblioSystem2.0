package com.gustavomartini.bibliosystemapi.controllers;

import com.gustavomartini.bibliosystemapi.models.Autor;
import com.gustavomartini.bibliosystemapi.models.Editora;
import com.gustavomartini.bibliosystemapi.repository.AutorRepository;
import com.gustavomartini.bibliosystemapi.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/editoras")
public class EditoraController {

    @Autowired
    private EditoraRepository editoraRepository;

    @GetMapping
    public List<Editora> listAll() {
        return editoraRepository.findAll();
    }
}


