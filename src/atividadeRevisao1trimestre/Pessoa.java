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
public class Pessoa {
    private String nome, cpf, rg;

    public String getNome() {
        return nome.toLowerCase();
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

    
    public Pessoa(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }
    
    public void visualizarDados(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("CPF: "+this.getCpf());
        System.out.println("RG: "+this.getRg());
        
    }

   
    
    
    
    
    
}
