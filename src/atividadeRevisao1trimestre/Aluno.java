/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeRevisao1trimestre;

/**
 *
 * @author tulio
 */
public class Aluno extends Pessoa {

    private String nMatricula, senha;
    private Turma objTurma;

    public String getnMatricula() {
        return nMatricula;
    }

    public Turma getObjTurma() {
        return objTurma;
    }

    
    
    public Aluno(String nome, String cpf, String rg, String nMatricula, Turma objTurma) {
        super(nome, cpf, rg);
        this.nMatricula = nMatricula;
        this.objTurma = objTurma;
    }

    @Override
    public void visualizarDados() {
        System.out.println("------------Dados do Aluno--------------");
        super.visualizarDados();
        System.out.println("Matricula: " + this.nMatricula);
        System.out.println("Turma: "+this.objTurma.getNomeTurma());

    }

}
