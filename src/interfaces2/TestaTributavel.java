/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces2;

/**
 *
 * @author T
 */
class TestaTributavel {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);

        System.out.println(cc.calculaTributos());
// testando polimorfismo:
        Tributavel t = cc;

        System.out.println(t.calculaTributos());
    }
}
