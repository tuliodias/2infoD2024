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
public class Professor extends Pessoa  {

    private String senha;
    private String codigo;
    Disciplina objDisciplina;
    Aluno objAluno;

    public Professor(String codigo, String nome, String cpf, String rg) {
        super(nome, cpf, rg);
        this.codigo = codigo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void publicaNota(Disciplina objDiscipla, Aluno objAluno, double nota1, double nota2, double nota3, double nota4) {
        this.objAluno = objAluno;
        this.objDisciplina = objDiscipla;
        objDiscipla.setNota1(nota1);
        objDiscipla.setNota2(nota2);
        objDiscipla.setNota3(nota3);
        objDiscipla.setNota4(nota4);
    }

    @Override
    public void visualizaDados() {
        System.out.println("-----------------");
        System.out.println("Professor:");
        super.visualizaDados();
        System.out.println("Código: " + this.getCodigo());
    }

   

}
