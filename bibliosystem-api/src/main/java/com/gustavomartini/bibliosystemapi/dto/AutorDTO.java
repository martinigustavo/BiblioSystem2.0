package com.gustavomartini.bibliosystemapi.dto;

import com.gustavomartini.bibliosystemapi.models.AutorModel;

import javax.persistence.Column;

public class AutorDTO {

    private Integer cod_autor;
    private String nome;
    private String sobrenome;
    private String situacao;

    public AutorDTO() {
    }

    public AutorDTO(Integer cod_autor, String nome, String sobrenome, String situacao) {
        this.cod_autor = cod_autor;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.situacao = situacao;
    }

    public AutorDTO(AutorModel autor) {
        this.cod_autor = autor.getCod_autor();
        this.nome = autor.getNome();
        this.sobrenome = autor.getSobrenome();
        this.situacao = autor.getSituacao();
    }

    public Integer getCod_autor() {
        return cod_autor;
    }

    public void setCod_autor(Integer cod_autor) {
        this.cod_autor = cod_autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
