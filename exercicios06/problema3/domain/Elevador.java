package exercicios06.problema3.domain;

public class Elevador {
    private int andarAtual, totalAndares;

    public Elevador(int andarAtual, int totalAndares) {
        this.totalAndares = totalAndares;
        this.andarAtual = andarAtual;
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("Não é possível subir. Este é o último andar.");
        }
    }

    public void descer() {
        if (andarAtual > 1) {
            andarAtual--;
        } else {
            System.out.println("Não é possível descer. Este é o primeiro andar.");
        }
    }

    public void exibirAndar() {
        System.out.println("Andar Atual: " + andarAtual);
    }
}
