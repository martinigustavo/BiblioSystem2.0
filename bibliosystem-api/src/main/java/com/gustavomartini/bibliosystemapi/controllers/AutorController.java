package com.gustavomartini.bibliosystemapi.controllers;

import com.gustavomartini.bibliosystemapi.models.Autor;
import com.gustavomartini.bibliosystemapi.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    @Autowired
    private AutorRepository authorRepository;

    @GetMapping
    public List<Autor> listAll() {
        return authorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Autor getAutorById(@PathVariable Integer id) {
        return authorRepository.findById(id).get();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Autor save(@RequestBody Autor autor) {
        return authorRepository.save(autor);
    }

    @PatchMapping("/{id}")
    public Autor update(@RequestBody @PathVariable Integer id) {
        Autor autor = this.getAutorById(id);
        return authorRepository.save(autor);
    }

    @DeleteMapping("/{id}")
    public void deleteAutor(@PathVariable Integer id) {
        authorRepository.deleteById(id);
    }
}


