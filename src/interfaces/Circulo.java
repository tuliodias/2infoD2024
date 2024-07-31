/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author T
 */
public class Circulo implements AreaCalculavel {

    double raio = 0;

    Circulo(double raio) {
        this.raio = raio;
    }

    public double calculaArea() {
        return Math.PI * raio * raio;
    }
}
