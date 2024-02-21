/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

/**
 *
 * @author tulio
 */
public class Metodos {
    
    double n1,n2,resultado; // atributos ou variáveis de instância
    
    public void soma(){ // método sem retorno (void) e sem passagem de parâmetro
        this.resultado = this.n1+ this.n2;
    }
    
    public double soma2(){// metodo com retorno(double) e sem passagem de parâmetro
        return this.resultado = this.n1+ this.n2;
    }
    
    public double soma3(double n1, double n2){// método com retorno e passagem com parâmetro
        this.n1 = n1;
        this.n2 = n2;
        return this.resultado = this.n1+ this.n2;
    }
    public void soma4(double n1, double n2){// método com retorno e passagem com parâmetro
        this.n1 = n1;
        this.n2 = n2;
        //return 
        this.resultado = this.n1+ this.n2;
    }
    
    
    
}
