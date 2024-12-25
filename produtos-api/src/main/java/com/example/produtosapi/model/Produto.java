package com.example.produtosapi.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Produto {
    @Id
    @Column
    private String id;

    @Column
    private String nome;

    @Column
    private String descricao;


    @Column
    private Double preco;



    public void setId(String id) {
        this.id = id;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
