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
public class AlunoEnsinoFundamental extends Aluno{
    private String serie;

    public AlunoEnsinoFundamental(int nMatricula, String nome, String cpf, String rg, Turma turma, String serie) {
        super(nMatricula, nome, cpf, rg, turma);
        this.serie = serie;
    }
    
       @Override
    public void visualizaDados() {
        System.out.println("-----------------");
        System.out.println("Aluno Fundamental:");
        super.visualizaDados();
        System.out.println("Série: "+this.serie);
    }
    
}
