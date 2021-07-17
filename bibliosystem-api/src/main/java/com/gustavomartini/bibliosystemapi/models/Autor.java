package com.gustavomartini.bibliosystemapi.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cod_autor;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "sobrenome", nullable = false)
    private String sobrenome;

    @Column(name = "situacao", nullable = false)
    private String situacao;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(cod_autor, autor.cod_autor) && Objects.equals(nome, autor.nome) && Objects.equals(sobrenome, autor.sobrenome) && Objects.equals(situacao, autor.situacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod_autor, nome, sobrenome, situacao);
    }
}
