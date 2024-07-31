/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

class Retangulo implements AreaCalculavel {

    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calculaArea() {
        return this.largura * this.altura;
    }
}
