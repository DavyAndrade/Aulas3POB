package exercicios07.problema1.controller;

import exercicios07.problema1.model.Estagiario;
import exercicios07.problema1.model.Funcionario;
import exercicios07.problema1.model.Gerente;

public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 3000.00);
        Estagiario estagiario = new Estagiario("Maria", 1500.00);
        Gerente gerente = new Gerente("Carlos", 5000.00);

        System.out.println("Salário de " + funcionario.getNome() + ": R$ " + funcionario.calcularSalario());
        System.out.println("Salário de " + estagiario.getNome() + ": R$ " + estagiario.calcularSalario());
        System.out.println("Salário de " + gerente.getNome() + ": R$ " + gerente.calcularSalario());
    }
}
