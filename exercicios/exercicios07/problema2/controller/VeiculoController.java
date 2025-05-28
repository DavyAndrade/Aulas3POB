package exercicios07.problema2.controller;

import exercicios07.problema2.model.Carro;
import exercicios07.problema2.model.Moto;

public class VeiculoController {
    public static void main(String[] args) {
        Carro carro = new Carro("Honda", "Civic", 2019, 4);
        Moto moto = new Moto("Yamaha", "MT-07", 2020, 689.0);

        carro.exibirDados();
        System.out.println();
        moto.exibirDados();
    }
}
