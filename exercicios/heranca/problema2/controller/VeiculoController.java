package heranca.problema2.controller;

import heranca.problema2.model.Carro;
import heranca.problema2.model.Moto;

public class VeiculoController {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", 2020, 4);
        Moto moto = new Moto("Honda", 2019, true);

        System.out.println("Dados do Carro:");
        carro.exibirDados();

        System.out.println("\nDados da Moto:");
        moto.exibirDados();
    }
}
