/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces2;

/**
 *
 * @author T
 */
public class TestaGerenciadorDeImpostoDeRenda {

    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);

        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adiciona(cc);

        System.out.println(gerenciador.getTotal());
    }
}
