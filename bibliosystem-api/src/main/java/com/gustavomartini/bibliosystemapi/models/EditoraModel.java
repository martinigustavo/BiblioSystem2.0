package com.gustavomartini.bibliosystemapi.models;

import javax.persistence.*;

@Entity
@Table(name = "editora")
public class EditoraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cod_editora;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "situacao", nullable = false)
    private String situacao;

    public EditoraModel() {
    }

    public EditoraModel(Integer cod_editora, String nome, String situacao) {
        this.cod_editora = cod_editora;
        this.nome = nome;
        this.situacao = situacao;
    }

    public Integer getCod_editora() {
        return cod_editora;
    }

    public void setCod_editora(Integer cod_editora) {
        this.cod_editora = cod_editora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
