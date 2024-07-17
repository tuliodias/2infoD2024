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
public class Disciplina {
    private String nome;
    private Professor professor;
    private Turma turma;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }
    
    public void exibirDados() {
        System.out.println("Disciplina: " + getNome() + ", Professor: " + getProfessor().getNome() );
    }
}