/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeRevisao1trimestre;

import java.util.Scanner;

/**
 *
 * @author tulio
 */
public class Teste {
    public static void main(String[] args) {
        Turma objTurmaD = new Turma("D");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = entrada.nextLine();
        Aluno objAluno = new Aluno(nome, "2342432", "424234", "43793", objTurmaD);
        Professor objProfTulio = new Professor("Tulio", "879797", "mg97979", "613034242");
        Professor objProfJoao = new Professor("João", "343434", "mg97944379", "3434334");
        Disciplina objDiscProgramacao = new Disciplina("Programação", objAluno, objProfTulio);
        Disciplina objDiscPortugues = new Disciplina("Português", objAluno, objProfJoao);
        objProfJoao.publicarNota(objDiscPortugues, objAluno, 10, 5, 7);
        objProfTulio.publicarNota(objDiscProgramacao, objAluno, 7, 2, 5);
        objAluno.visualizarDados();
        objDiscPortugues.relatorioAlunoDisciplina();
        objDiscProgramacao.relatorioAlunoDisciplina();
        
       // objProfJoao.visualizarDados();
        
        relatorio(objProfJoao);
        relatorio(objAluno);
       
    }
    
    public static void relatorio(Pessoa objPessoa){
        objPessoa.visualizarDados();
        
    }
    
    
    
}
