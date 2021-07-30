package com.gustavomartini.bibliosystemapi.controllers;

import com.gustavomartini.bibliosystemapi.models.AutorModel;
import com.gustavomartini.bibliosystemapi.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @GetMapping
    public ResponseEntity<List<AutorModel>> getAllAutores() {
        List<AutorModel> autoresList = autorRepository.findAll();

        if (autoresList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<AutorModel>>(autoresList, HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutorModel> getAutorById(@PathVariable(value = "id") Integer id) {
        Optional<AutorModel> autor0 = autorRepository.findById(id);
        if (!autor0.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<AutorModel>(autor0.get(), HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<AutorModel> saveAutor(@RequestBody AutorModel autor) {
        return new ResponseEntity<AutorModel>(autorRepository.save(autor), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAutor(@PathVariable(value = "id") Integer id) {
        Optional<AutorModel> autor0 = autorRepository.findById(id);

        if (!autor0.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            autorRepository.delete(autor0.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<AutorModel> updateAutor(@PathVariable(value = "id") Integer id,
                                                  @RequestBody AutorModel autor) {
        Optional<AutorModel> autor0 = autorRepository.findById(id);

        if (!autor0.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            autor.setCod_autor(autor0.get().getCod_autor());
            return new ResponseEntity<AutorModel>(autorRepository.save(autor), HttpStatus.OK);
        }
    }
}


