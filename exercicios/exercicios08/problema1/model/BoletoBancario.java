package exercicios08.problema1.model;

public class BoletoBancario implements Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Boleto Bancário.");
    }

}
