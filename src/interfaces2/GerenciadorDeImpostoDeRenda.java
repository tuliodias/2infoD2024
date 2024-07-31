/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces2;

/**
 *
 * @author T
 */
class GerenciadorDeImpostoDeRenda {

    private double total;

    void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);
        this.total += t.calculaTributos();
    }

    public double getTotal() {
        return this.total;
    }
}
