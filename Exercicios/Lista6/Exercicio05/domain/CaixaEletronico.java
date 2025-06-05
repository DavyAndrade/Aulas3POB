package Exercicios.Lista6.Exercicio05.domain;

public class CaixaEletronico {
    private double saldo;

    public CaixaEletronico(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if (valor % 10 == 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            return true;
        } else if (valor % 10 != 0) {
            System.out.println("Valor inválido para saque. O valor deve ser multiplo de 10.");
            return false;
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
            return false;
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo Atual: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
