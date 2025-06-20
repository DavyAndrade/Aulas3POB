package Veiculos.model;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String modelo, int ano, int cilindradas) {
        super(placa, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Dados da Moto ===");
        super.exibirDados();
        System.out.println("Cilindradas: " + cilindradas + " cc");
    }
}
