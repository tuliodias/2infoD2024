/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces2;


/**
 *
 * @author T
 */
public class Conta {

    private int numero;
    private double saldo;
    private double limite;


     public  int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

// construtor
Conta(){

}




    public double getSaldo() {
        return this.saldo;
    }



    public void saca(double quantidade) {

        if (quantidade > this.saldo + this.limite) {
            System.out.println("Não posso sacar fora do limite!");
        } else {
            this.saldo = this.saldo - quantidade;
        }
    }

    public void deposita(double quantidade) {
        this.saldo += quantidade;

    }

 


}

