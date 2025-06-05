# Exercício 1 – Classe Pessoa → Aluno e Professor

## Objetivo: Criar uma classe genérica Pessoa e especializar em Aluno e Professor.

## Enunciado:

### Crie uma hierarquia de classes com base na generalização de uma Pessoa. Essa classe deve conter os seguintes atributos:

• String nome
• int idade

### A partir dessa classe, crie duas subclasses:

• Aluno: com o atributo extra String curso
• Professor: com o atributo extra double salario

### Implemente um método exibirDados() na classe Pessoa que mostre o nome e a idade. Faça a sobrescrita desse método nas subclasses para incluir os dados específicos.

## Requisitos:

• Use super() no construtor das subclasses.
• Teste a criação de um objeto de cada tipo e chame exibirDados() para ambos.
