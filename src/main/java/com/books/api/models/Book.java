package com.books.api.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TB_BOOKS")
public class Book {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String titulo;
    @NotNull
    private String autor;
    @NotNull
    private int quantPaginas;
    @NotNull
    @Lob
    private String descricao;
    @NotNull
    private String editora;
    @NotNull
    private BigDecimal preço;

    public BigDecimal getPreço() {
        return preço;
    }

    public void setPreço(BigDecimal preço) {
        this.preço = preço;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantPaginas() {
        return quantPaginas;
    }

    public void setQuantPaginas(int quantPaginas) {
        this.quantPaginas = quantPaginas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
