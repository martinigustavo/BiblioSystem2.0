package com.gustavomartini.bibliosystemapi.controllers;

import com.gustavomartini.bibliosystemapi.models.EditoraModel;
import com.gustavomartini.bibliosystemapi.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/editoras")
public class EditoraController {

    @Autowired
    private EditoraRepository editoraRepository;

    @GetMapping
    public ResponseEntity<List<EditoraModel>> listAll() {
        List<EditoraModel> editorasList = editoraRepository.findAll();

        if (editorasList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<EditoraModel>>(editorasList, HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<EditoraModel> getEditoraById(@PathVariable(value = "id") Integer id) {
        Optional<EditoraModel> editora0 = editoraRepository.findById(id);

        if (!editora0.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<EditoraModel>(editora0.get(), HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<EditoraModel> saveEditora(@RequestBody EditoraModel editora) {
        return new ResponseEntity<EditoraModel>(editoraRepository.save(editora), HttpStatus.CREATED);
    }
}


