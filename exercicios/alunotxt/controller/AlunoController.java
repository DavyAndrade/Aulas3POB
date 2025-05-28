package alunotxt.controller;

import alunotxt.model.Aluno;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AlunoController {
    private ArrayList<Aluno> alunos;
    private final String arquivoAlunos = "alunos.txt";

    public AlunoController() {
        this.alunos = new ArrayList<>();
        carregarAlunos();
    }

    // Método para adicionar um aluno em um ArrayList e salvar no arquivo alunos.txt
    public void adicionarAluno(int matricula, String nome, double cr) {
        Aluno aluno = new Aluno(matricula, nome, cr);
        alunos.add(aluno);
        salvarAlunos();
        System.out.println("Aluno adicionado com sucesso!");
    }

    // Método para listar todos os alunos cadastrados
    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            System.out.println("====================");
            for (Aluno aluno : alunos) {
                aluno.mostrarInfo();
                System.out.println("====================");
            }
        }
    }

    public void atualizarAluno(int matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);

        if (aluno != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Novo nome do Aluno: ");
            String nome = scanner.nextLine();
            System.out.println("Novo CR do Aluno: ");
            double cr = scanner.nextDouble();

            aluno.setNome(nome);
            aluno.setCr(cr);
            salvarAlunos();
            System.out.println("Aluno atualizado com sucesso!");
        } else {
            System.out.println("Aluno(a) com a matrícula " + matricula + " não encontrado(a)!");
        }
    }

    public void removerAluno(int matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);

        if (aluno != null) {
            alunos.remove(aluno);
            salvarAlunos();
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno(a) com a matrícula " + matricula + " não encontrado(a)!");
        }
    }

    // Método para buscar um aluno por matrícula
    public Aluno buscarAlunoPorMatricula(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    public void carregarAlunos() {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoAlunos))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 3) {
                    int matricula = Integer.parseInt(dados[0]);
                    String nome = dados[1];
                    double cr = Double.parseDouble(dados[2]);
                    alunos.add(new Aluno(matricula, nome, cr));
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar alunos: " + e.getMessage());
        }
    }

    public void salvarAlunos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoAlunos))) {
            for (Aluno aluno : alunos) {
                bw.write(aluno.getMatricula() + "," + aluno.getNome() + "," + aluno.getCr());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar alunos: " + e.getMessage());
        }
    }
}