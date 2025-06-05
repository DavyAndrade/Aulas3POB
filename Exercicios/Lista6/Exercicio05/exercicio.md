Exercício 5: Simulação de Um Caixa Eletrônico
Descrição:
Crie um programa que simule um caixa eletrônico, permitindo saques apenas em
múltiplos de R$ 10 e garantindo que o saldo seja suficiente.
Requisitos:
1. Criar o pacote dominio contendo a classe CaixaEletronico:
o Atributos: saldo (double).
o Métodos:
▪ sacar(double valor): verifica se o valor é múltiplo de 10 e se
há saldo suficiente.
▪ exibirSaldo(): exibe o saldo restante.
2. Criar o pacote controle contendo a classe SimuladorCaixa:
o Permitir que o usuário realize múltiplos saques, verificando a
validade do valor.
o Utilizar um while para continuar as operações até o usuário decidir
sair.