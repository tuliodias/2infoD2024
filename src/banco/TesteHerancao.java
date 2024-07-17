/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author tulio
 */
public class TesteHerancao {
    public static void main(String[] args) {
        Funcionario objFuncionario = new Gerente(232, 660, "Maria");
        Gerente objGerente = new Gerente(123, 1000, "Pedro");
        Supervisor objSupervisor = new Supervisor("José");
        
        objFuncionario.setSalario(1000);
        objGerente.setSalario(1000);
        objSupervisor.setSalario(1000);
        
        
        objFuncionario.setNome("Maria");
        objGerente.setNome("Pedro");
        objSupervisor.setNome("José");
        
        objGerente.mostra();
        objGerente.setSenha(123);
        objGerente.autentica(145);
        
        objSupervisor.mostra();
        objFuncionario.mostra();
        
        
        
        
    }
    
}
