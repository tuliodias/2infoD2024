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
public class Professor extends Pessoa {
    //private String disciplina; // tirar diciplina colocar outro atributo
    private String numeroRegistro;
    public Professor(String nome, String cpf, String numeroRegistro) {
        super(nome, cpf);
        this.numeroRegistro = numeroRegistro;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    @Override
    public void exibirDados() {
        System.out.println("Professor: " + getNome() + ", CPF: " + getCpf() + ", Numero Registro: " + numeroRegistro);
    }
}