/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces2;

/**
 *
 * @author T
 */
public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public void deposita(double quantidade) {
        super.deposita(quantidade - 0.10);

    }

    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}
