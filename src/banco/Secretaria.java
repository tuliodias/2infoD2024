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
public class Secretaria extends Funcionario{

    public Secretaria(String nome) {
        super(nome);
    }

    @Override
    public double getBonificacao() {
       return super.getSalario()+500;
    }
    
}
