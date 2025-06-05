# Exercício 2 – Veículo → Carro e Moto

## Objetivo: Exercitar o conceito de herança com atributos e métodos específicos por especialização.

## Enunciado:

### Implemente uma classe genérica chamada Veiculo com os seguintes atributos:

• String marca
• int ano

### E os seguintes métodos:

• void exibirDados(): mostra marca e ano.

### Crie duas subclasses especializadas:

• Carro: possui um atributo adicional int numeroDePortas
• Moto: possui um atributo adicional boolean temPartidaEletrica

### As subclasses devem sobrescrever o método exibirDados() para incluir seus atributos específicos.

## Regras:

• Use super() no construtor das subclasses para inicializar marca e ano.
• No main, instancie um Carro e uma Moto, e chame o método exibirDados() para mostrar os
dados de cada objeto.
