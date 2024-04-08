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
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario objFuncionario = new Funcionario("Tulio");
        Funcionario objFuncionario2 = new Funcionario("Maria");
        
        //objFuncionario.setNome("Tulio");
        //objFuncionario2.setNome("Maria");
        
        objFuncionario.setSalario(10000);
        objFuncionario.bonifica(1000);
        objFuncionario.demite();
        
      objFuncionario.mostra();
      objFuncionario2.mostra();
    }
    
}
