/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao1trimestre;

/**
 *
 * @author tulio
 */
import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;

    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void exibirAlunos() {
        System.out.println("Alunos da turma: "+this.getNome());
        for (Aluno aluno : alunos) {
            aluno.exibirDados();
        }
    }
    public void exibirDisciplinas() {
        System.out.println("Disciplinas da turma: ");
        for (Disciplina disciplina : disciplinas) {
            disciplina.exibirDados();
        }
    }
}