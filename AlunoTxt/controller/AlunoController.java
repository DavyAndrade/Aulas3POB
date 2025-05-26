package AlunoTxt.controller;

import AlunoTxt.model.Aluno;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AlunoController {
    private ArrayList<Aluno> alunos;
    private final String arquivoAlunos = "alunos.txt";

    public AlunoController() {
        alunos = new ArrayList<>();
        carregarAlunos();
    }

    public void adicionarAluno(int matricula, String nome, double cr) {
        Aluno aluno = new Aluno(matricula, nome, cr);
        salvarAlunos();
        System.out.println("Aluno adicionado com sucesso!");
    }
}
