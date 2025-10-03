package com.mycompany.escolamusica;

public class piano extends Instrumento {
    private int numeroTeclas;

    public piano(String nome, String material, int numeroTeclas) {
        super(nome, material);
        this.numeroTeclas = numeroTeclas;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando piano " + nome +
                " feito de " + material +
                " com " + numeroTeclas + " teclas.");
    }
}
