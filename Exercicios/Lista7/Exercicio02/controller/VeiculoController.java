package Exercicios.Lista7.Exercicio02.controller;

import Exercicios.Lista7.Exercicio02.model.Carro;
import Exercicios.Lista7.Exercicio02.model.Moto;
import Exercicios.Lista7.Exercicio02.model.Veiculo;

public class VeiculoController {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Honda", "Civic", 2019, 4);
        Veiculo moto = new Moto("Yamaha", "MT-07", 2020, 700);

        carro.exibirDados();
        System.out.println();
        moto.exibirDados();
    }
}