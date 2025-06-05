Exercício 1: Controle de Conta Bancária
Descrição:
Crie um programa que simule uma conta bancária, permitindo depósitos e
saques.
Requisitos:
1. Criar o pacote dominio contendo a classe ContaBancaria:
o Atributos: titular (String), saldo (double).
o Métodos:
▪ depositar(double valor): adiciona um valor ao saldo.
▪ sacar(double valor): subtrai um valor do saldo, se houver
saldo suficiente.
▪ exibirSaldo(): exibe o saldo atual.

2. Criar o pacote controle contendo a classe GerenciadorConta:
o Permitir que o usuário cadastre uma conta e realize operações
(depositar, sacar, consultar saldo).
o Utilizar um while para continuar as operações até o usuário escolher
sair.