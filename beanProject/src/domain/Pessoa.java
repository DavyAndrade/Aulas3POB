package src.domain;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private char sexo;

    public Pessoa(String nome, int idade, double altura, double peso, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void listarPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
        if (sexo == 'M') {
            System.out.println("Sexo: Masculino");
        } else {
            System.out.println("Sexo: Feminino");
        }
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public void classificarIMC() {
        double imc = calcularIMC();

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do Peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso Adequado");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade Grau II");
        } else {
            System.out.println("Classificação: Obesidade Grau III");
        }
    }
}
