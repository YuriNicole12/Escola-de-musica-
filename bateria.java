package com.mycompany.escolamusica;

public class bateria extends Instrumento {
    private int numeroPecas;

    public bateria(String nome, String material, int numeroPecas) {
        super(nome, material);
        this.numeroPecas = numeroPecas;
    }

    @Override
    public void tocar() {
        System.out.println("Marcando o ritmo da " + nome +
                " com " + numeroPecas + " peças.");
    }

    public void afinar() {
        System.out.println("Ajustando tensão das peles dos tambores.");
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Material: " + material);
        System.out.println("Número de peças: " + numeroPecas);
    }

    public int getNumeroPecas() {
        return numeroPecas;
    }
}
