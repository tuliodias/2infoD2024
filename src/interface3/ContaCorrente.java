/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interface3;

/**
 *
 * @author T
 */
public class ContaCorrente implements Conta{
    private int numero;
    private double saldo;
    private double limite;
    
     public  int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public void retira(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void atualiza(double taxaSelic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}
