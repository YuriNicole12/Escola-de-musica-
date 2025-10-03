package com.mycompany.escolamusica;

public abstract class Instrumento {
    protected String nome;
    protected String material;

    public Instrumento(String nome, String material) {
        this.nome = nome;
        this.material = material;
    }

    public abstract void tocar();
}
