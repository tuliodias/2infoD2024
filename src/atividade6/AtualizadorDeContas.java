/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade6;

/**
 *
 * @author tulio
 */
public class AtualizadorDeContas {
    private double saldoTotal = 0;
private double selic;
AtualizadorDeContas(double selic) {
this.selic = selic;
}
void roda(Conta c) {
    System.out.println("Saldo anterior"+ c.getSaldo());
    c.atualiza(selic);
     System.out.println("Saldo Final: "+c.getSaldo());
    saldoTotal = saldoTotal + c.getSaldo();
 
// aqui voce imprime o saldo anterior, atualiza a conta,
// e depois imprime o saldo final
// lembrando de somar o saldo final ao atributo saldoTotal
}

// outros métodos, colocar o getter para saldoTotal!

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    
}
