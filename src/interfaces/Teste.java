/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author T
 */
public class Teste {

    public static void main(String args[]) {
        Quadrado quad = new Quadrado(10);
        double teste = quad.calculaArea();

        Retangulo ret = new Retangulo(12,12);
        Circulo circulo = new Circulo(12);
        System.out.println("valor teste: "+teste);
        System.out.println("valor retangulo: "+ret.calculaArea());
        System.out.printf("valor circulo: %.2f", circulo.calculaArea());
     
    }
}
