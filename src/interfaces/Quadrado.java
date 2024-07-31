/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

class Quadrado implements AreaCalculavel {

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public double calculaArea() {
        return this.lado * this.lado;
    }
}
