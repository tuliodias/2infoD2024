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
public class Disciplina {

    private String nomeDisciplina;
    private int idDisciplina;
    private double nota1, nota2, nota3, nota4, media;
    Professor objProfessor;
    Aluno objAluno;

    public Disciplina(String nomeDisciplina, int idDisciplina, Professor objProfessor, Aluno objAluno) {
        this.nomeDisciplina = nomeDisciplina;
        this.idDisciplina = idDisciplina;
        this.objProfessor = objProfessor;
        this.objAluno = objAluno;

    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMedia() {
        media = (this.getNota1() + this.getNota2() + this.getNota3() + this.getNota4()) / 4;
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public void relatorioAlunoDisciplina() {
        System.out.println("\nAluno: "+objAluno.getNome()+" Turma: "+objAluno.getTurma().getNomeTurma());
        System.out.println("Disciplina: " + this.getNomeDisciplina() + " Professor: " + this.objProfessor.getNome());
        System.out.println("Nota1: " + this.getNota1() + " Nota2: " + this.getNota2() + " Nota3: " + this.getNota3() + " Nota4: " + this.getNota4());
        if (this.getMedia() < 4) {
            System.out.print("Aluno Reprovado");
        } else if (this.getMedia() < 6) {
            System.out.print("Aluno de recuperação");
        } else {
            System.out.print("Aluno Aprovado");
        }
        System.out.println(" com média: " + this.getMedia());
        System.out.println("--------------------------------");

    }

}
