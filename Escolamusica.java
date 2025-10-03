package com.mycompany.escolamusica;

public class Escolamusica {
    public static void main(String[] args) {
        Instrumento violao = new Violao("Violão Clássico", "Madeira", 6);
        Instrumento saxofone = new Saxofone("Yamaha", "Latão", "Alto");
        Instrumento piano = new piano("Piano de Cauda", "Madeira", 88);
        Instrumento bateria = new bateria("Bateria Rock", "Madeira e Metal", 5);

        violao.tocar();
        saxofone.tocar();
        piano.tocar();
        bateria.tocar();
    }
}
