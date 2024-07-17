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
public class Teste {

    public static void main(String[] args) {
        Turma turmaA = new Turma("Turma A");
        Aluno alunoTiago = new AlunoEnsinoMedio(12223, "Tiago", "m98989", "Rua dos pintados - 12", turmaA, "Técnico em Informática");
        Professor profTulio = new Professor("12342", "Tulio Dias", "09809887-90", "mg0-99055");
        Professor profJoao = new Professor("34343", "João", "09832098-90", "mg3094809");

        Disciplina programacao = new Disciplina("Linguagem de Programação", 10, profTulio, alunoTiago);
        Disciplina matematica = new Disciplina("Matemática", 9, profJoao, alunoTiago);

        profTulio.publicaNota(programacao, alunoTiago, 10, 8, 9, 10);
        profJoao.publicaNota(matematica, alunoTiago, 7, 4, 9, 10);

        alunoTiago.visualizaDados();
        matematica.relatorioAlunoDisciplina();
        programacao.relatorioAlunoDisciplina();
        
        //---------------------------------------------
        Turma turmaB = new Turma("Turma B");
        Aluno alunoPedro = new AlunoEnsinoFundamental(343434, "pedro", "ng5454", "Avenida Vital - 12", turmaB, "5º");
        Professor profMaria = new Professor("12342", "Tulio Dias", "09809887-90", "mg0-99055");
       

        Disciplina portugues = new Disciplina("Português", 1, profMaria, alunoPedro);
        Disciplina redacao = new Disciplina("Redação", 2, profMaria, alunoPedro);

        profMaria.publicaNota(portugues, alunoPedro, 7, 4, 2, 4);
        profMaria.publicaNota(redacao, alunoPedro, 6, 4, 9, 9);

        alunoPedro.visualizaDados();
        portugues.relatorioAlunoDisciplina();
        redacao.relatorioAlunoDisciplina();

    }

}
