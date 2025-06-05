package Exercicios.Lista8.Exercicio01.controller;

import Exercicios.Lista8.Exercicio01.model.BoletoBancario;
import Exercicios.Lista8.Exercicio01.model.CartaoCredito;
import Exercicios.Lista8.Exercicio01.model.Pagamento;

public class PagamentoController {
    public static void main(String[] args) {
        Pagamento cartaoCredito = new CartaoCredito();
        Pagamento boletoBancario = new BoletoBancario();

        cartaoCredito.realizarPagamento(150.50);
        boletoBancario.realizarPagamento(75.00);
    }
}
