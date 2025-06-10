package Veiculos.model;

public class Caminhao extends Veiculo {
    int capacidadeCarga;

    public Caminhao(String placa, String modelo, int ano, int capacidadeCarga) {
        super(placa, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Dados do Caminhão ===");
        super.exibirDados();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " kg");
    }
}
