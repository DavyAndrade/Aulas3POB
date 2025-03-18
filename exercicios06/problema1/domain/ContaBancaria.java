package exercicios06.problema1.domain;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para deposito.");
        }
    }

    public void sacar(double valor) {
        if (saldo < 0) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo de " + titular + ": " + saldo);
    }
}