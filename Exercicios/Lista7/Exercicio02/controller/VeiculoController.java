package Exercicios.Lista7.Exercicio02.controller;

import Exercicios.Lista7.Exercicio02.model.Carro;
import Exercicios.Lista7.Exercicio02.model.Moto;

public class VeiculoController {
    public static void main(String[] args) {
        Carro carro = new Carro("Honda", "Civic", 2019, 4);
        Moto moto = new Moto("Yamaha", "MT-07", 2020, 689.0);

        carro.exibirDados();
        System.out.println();
        moto.exibirDados();
    }
}