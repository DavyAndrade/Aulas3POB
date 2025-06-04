package exercicios08.problema1.controller;

import exercicios08.problema1.model.BoletoBancario;
import exercicios08.problema1.model.CartaoCredito;
import exercicios08.problema1.model.Pagamento;

public class PagamentoController {
    public static void main(String[] args) {
        Pagamento cartaoCredito = new CartaoCredito();
        Pagamento boletoBancario = new BoletoBancario();

        cartaoCredito.realizarPagamento(150.50);
        boletoBancario.realizarPagamento(75.00);
    }
}
