Exercício 2: Cálculo de Salário com Bônus
Descrição:
Crie um programa que calcule o salário final de um funcionário, considerando um
bônus de acordo com sua categoria.
Requisitos:
1. Criar o pacote dominio contendo a classe Funcionario:
o Atributos: nome (String), salarioBase (double), categoria (String).
o Método:
▪ calcularSalarioFinal(): adiciona um bônus ao salário base:
▪ "A" → +20%
▪ "B" → +10%

▪ "C" → sem bônus

2. Criar o pacote controle contendo a classe GerenciadorFuncionario:
o Permitir que o usuário cadastre um funcionário e consulte seu
salário final.
o Utilizar switch-case para aplicar a regra do bônus.