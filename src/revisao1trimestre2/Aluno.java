/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao1trimestre2;

/**
 *
 * @author tulio
 */
public class Aluno extends Pessoa {

    private int nMatricula;
    private String senha;
    private Turma turma;

    public Turma getTurma() {
        return turma;
    }

    public Aluno(int nMatricula, String nome, String cpf, String rg, Turma turma) {
        super(nome, cpf, rg);
        this.nMatricula = nMatricula;
        this.turma = turma;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    @Override
    public void visualizaDados() {
        System.out.println("-----------------");
        System.out.println("Aluno:");
        super.visualizaDados();
        System.out.println("Matricula: " + this.nMatricula);
    }

    

}
