package Heranca.Exercicio02.controller;

import Heranca.Exercicio02.model.Carro;
import Heranca.Exercicio02.model.Moto;
import Heranca.Exercicio02.model.Veiculo;

public class VeiculoController {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota", 2020, 4);
        Veiculo moto = new Moto("Honda", 2019, true);

        System.out.println("Dados do Carro:");
        carro.exibirDados();

        System.out.println("\nDados da Moto:");
        moto.exibirDados();
    }
}
