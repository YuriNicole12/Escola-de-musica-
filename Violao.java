package com.mycompany.escolamusica;

public class Violao extends Instrumento {
    private int numeroCordas;

    public Violao(String nome, String material, int numeroCordas) {
        super(nome, material);
        this.numeroCordas = numeroCordas;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando notas suaves com " + nome +
                " com " + numeroCordas + " cordas.");
    }
    
}
