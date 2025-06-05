Exercício 3: Simulação de Um Elevador
Descrição:
Implemente um programa que simule o funcionamento básico de um elevador,
permitindo subir, descer e exibir o andar atual.
Requisitos:
1. Criar o pacote dominio contendo a classe Elevador:
o Atributos: andarAtual (int), totalAndares (int).
o Métodos:
▪ subir(): aumenta o andar atual, se não for o último.
▪ descer(): reduz o andar atual, se não for o térreo.
▪ exibirAndar(): exibe o andar atual.

2. Criar o pacote controle contendo a classe SimuladorElevador:
o Permitir que o usuário suba e desça os andares de acordo com sua
escolha.
o Garantir que o elevador não ultrapasse os limites (térreo e último
andar).
o Utilizar um do-while para manter a simulação em execução até o
usuário escolher sair.