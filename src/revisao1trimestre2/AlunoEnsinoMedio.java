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
public class AlunoEnsinoMedio extends Aluno {

    private String curso;

    public AlunoEnsinoMedio(int nMatricula, String nome, String cpf, String rg, Turma turma, String curso) {
        super(nMatricula, nome, cpf, rg, turma);
        this.curso = curso;
    }

    @Override
    public void visualizaDados() {
        System.out.println("-----------------");
        System.out.println("Aluno Ensino Médio:");
        super.visualizaDados();
         System.out.println("Curso: " + this.curso);
        System.out.println("-----------------");
    }

}
