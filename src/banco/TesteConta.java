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
public class TesteConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();// criei um objeto
        Conta c2 = new Conta();// criei um objeto
        c1.deposita(3000.50);
        c2.deposita(100000);
        //c1.setCliente("Pedro");
        c1.objCliente.setNomeCliente("Pedro");
        c2.objCliente.setNomeCliente("Maria");
        
        
        c1.saca(50000);
        c2.saca(100);
        
        System.out.println("Saldo da conta c1:"+c1.getSaldo());
        System.out.println("Saldo da conta c2:"+c2.getSaldo());
        System.out.println("Cliente c1: "+c1.objCliente.getNomeCliente());
        System.out.println("Cliente c2: "+c2.objCliente.getNomeCliente());
    }
    
}
