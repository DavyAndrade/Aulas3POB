# Requisitos Técnicos

## 1. Crie a interface Exibivel com o seguinte método:

void exibirDados();

## 2. Crie a classe abstrata Veiculo que:

- Implemente a interface Exibivel
- Possua os atributos: placa, modelo e ano
- Inclua um construtor e os métodos getters e setters

## 3. Crie as classes:

- Carro (atributo adicional: qtdPortas)
- Moto (atributo adicional: cilindrada)
- Caminhao (atributo adicional: capacidadeCarga)
  Todas devem herdar de Veiculo e sobrescrever o método exibirDados()

## 4. Crie uma classe principal para:

- Armazenar os veículos em um ArrayList<Veiculo>
- Permitir que o usuário cadastre veículos e visualize a lista cadastrada

## Exemplo de Fluxo Esperado

1 - Cadastrar novo veículo
2 - Listar veículos
3 - Sair

> > 1
> > Tipo (1-Carro, 2-Moto, 3-Caminhão): 2
> > Modelo: XTZ 250
> > Placa: ABC-1234
> > Ano: 2022
> > Cilindrada: 250
> > 2
> > Moto - Modelo: XTZ 250 | Placa: ABC-1234 | Ano: 2022 | Cilindrada: 250cc

# Dicas

- Use a classe Scanner para capturar entrada do usuário.
- Utilize o construtor da superclasse com super().
- Aplique o polimorfismo utilizando ArrayList<Veiculo>.
- Crie um menu interativo dentro de um loop.
