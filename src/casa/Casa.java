/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author tulio
 */
public class Casa {
    
    private String cor;
    Porta porta1;// = new Porta();
    Porta porta2;// = new Porta();
    Porta porta3;// = new Porta();

    public Casa(Porta porta1, Porta porta2, Porta porta3) {
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }
    
    public void pinta(String cor){
        this.cor = cor;
    }
    
    public int quantasPortasEstaoAbertas(){
        int cont=0;
        if(porta1.estaAberta()){
            cont = cont+1;
        }
        if(porta2.estaAberta()==true){
            cont = cont+1;
        }
        if(porta3.estaAberta()==true){
            cont = cont+1;
        }
        return cont;
    }
}
