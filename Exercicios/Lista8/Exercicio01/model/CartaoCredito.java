package Exercicios.Lista8.Exercicio01.model;

public class CartaoCredito implements Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Cartão de Crédito.");
    }
}
