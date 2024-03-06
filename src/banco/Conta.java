/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author tulio
 */
public class Conta {

    private int numero;
    private double saldo;
    private double limite;
    private int identificador;
    private static int totalDeContas; // variável static pertece a classe
    Cliente objCliente = new Cliente();

    public int getIdentificador() {
        return identificador;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    Conta() { // construtor padrão
        Conta.totalDeContas = Conta.totalDeContas + 1;
        this.identificador = Conta.totalDeContas;
        System.out.println("Construindo uma conta");
    }

    Conta(double saldo) {
        this(); //chama o construtor padrão
        this.saldo = saldo;
    }

    Conta(double saldo, double limite, int numero) {
        this(saldo); // chama o construtor acima
        this.limite = limite;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo + limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean saca(double quantidade) {
        if (this.getSaldo() >= quantidade) {
            this.saldo = this.saldo - quantidade;
            return true;
        } else {
            System.out.println("Saldo insuficiente: " + this.getSaldo());
            return false;
        }

    }

    public void deposita(double quantidade) {
        this.saldo = this.saldo + quantidade;
    }

    public void transfere(Conta destino, double quantidade) {
        if (this.saca(quantidade)) {
            destino.deposita(quantidade);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Transferência não realizada");
        }

    }

}
