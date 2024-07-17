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
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar instâncias de Professores
        Professor professor1 = new Professor("Carlos Silva", "123.456.789-00", "32231123");
        Professor professor2 = new Professor("Maria Souza", "987.654.321-00", "225373343");

        // Criar instâncias de Disciplinas
        Disciplina matematica = new Disciplina("Matemática", professor1);
        Disciplina portugues = new Disciplina("Português", professor2);

        // Criar instância de Turma
        Turma turma1 = new Turma("Turma 1A");

        // Adicionar Disciplinas à Turma
        turma1.adicionarDisciplina(matematica);
        turma1.adicionarDisciplina(portugues);

        // Matricular Alunos
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF do aluno:");
        String cpf = scanner.nextLine();
        System.out.println("Digite a matrícula do aluno:");
        String matricula = scanner.nextLine();

        Aluno aluno1 = new Aluno(nome, cpf, matricula);
        turma1.adicionarAluno(aluno1);

        // Lançar notas
        System.out.println("Lançar notas para o aluno " + aluno1.getNome());
        double[] notas = new double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }
        aluno1.setNotas(notas);

        // Exibir informações
        turma1.exibirAlunos();
        turma1.exibirDisciplinas();
        System.out.println("Média do aluno " + aluno1.getNome() + ": " + aluno1.calcularMedia());
        
       // Teste teste = new Teste();
        exibirInformacoes(aluno1);
        exibirInformacoes(professor1);
      
    }

    public static void exibirInformacoes(Pessoa pessoa) {
        pessoa.exibirDados();
    }
}
