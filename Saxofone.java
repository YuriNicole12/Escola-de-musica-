package com.mycompany.escolamusica;

public class Saxofone extends Instrumento {
    private String tipo;

    public Saxofone(String nome, String material, String tipo) {
        super(nome, material);
        this.tipo = tipo;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando saxofone " + tipo +
                " chamado " + nome +
                " feito de " + material + ".");
    }
}
