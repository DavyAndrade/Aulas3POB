package Exercicios.Lista8.Exercicio03.model;

public class Smartphone implements DispositivoEletronico {
    @Override
    public void ligar() {
        System.out.println("Smartphone ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Smartphone desligado.");
    }
}
