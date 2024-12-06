package com.exemplo.camisastime;

public class Camisa {
    private Long id;
    private String nome;
    private String time;
    private Double preco;

    // Construtores, getters e setters
    public Camisa(Long id, String nome, String time, Double preco) {
        this.id = id;
        this.nome = nome;
        this.time = time;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
