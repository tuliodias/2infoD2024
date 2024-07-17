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
public class Aluno extends Pessoa {
    private String matricula;
    private double[] notas;
   private Turma turma;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
        this.notas = new double[4]; // Exemplo com 4 notas
    }

    public String getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public void exibirDados() {
        System.out.println("Aluno: " + getNome() + ", CPF: " + getCpf() + ", Matrícula: " + matricula);
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
