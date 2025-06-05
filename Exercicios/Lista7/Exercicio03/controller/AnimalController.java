package Exercicios.Lista7.Exercicio03.controller;

import Exercicios.Lista7.Exercicio03.model.Cachorro;
import Exercicios.Lista7.Exercicio03.model.Gato;

public class AnimalController {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5);
        Gato gato = new Gato("Mia", 3);

        cachorro.emitirSom();
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Idade: " + cachorro.getIdade() + " anos");

        System.out.println();

        gato.emitirSom();
        System.out.println("Nome: " + gato.getNome());
        System.out.println("Idade: " + gato.getIdade() + " anos");
    }
}