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
public class TesteConstrutor {
    
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta(1000);
        Conta c3 = new Conta(9000, 10000, 12356);
        
        System.out.println("Saldo c1:"+c1.getSaldo());
        System.out.println("Saldo c2:"+c2.getSaldo());
        System.out.println("Saldo c3:"+c3.getSaldo());
        System.out.println("Total de contas: "+Conta.getTotalDeContas());
        System.out.println("ID c1: "+c1.getIdentificador());
        System.out.println("ID c2: "+c2.getIdentificador());
        System.out.println("ID c2: "+c2.getIdentificador());
  
    }
    
}
