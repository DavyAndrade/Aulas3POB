package Veiculos.controller;

import java.util.ArrayList;

import Veiculos.model.Veiculo;

public class VeiculoController {

    public void cadastrarVeiculo(ArrayList<Veiculo> veiculos, Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void listarVeiculos(ArrayList<Veiculo> veiculos) {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            System.out.println("--------------------------");
            System.out.println("Lista de Veículos:");
            for (Veiculo veiculo : veiculos) {
                veiculo.exibirDados();
                System.out.println("-------------------------");
            }
        }
    }
}
