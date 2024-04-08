/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoHospital;

import java.util.List;

/**
 *
 * @author tulio
 */
public class Internacao {

    private int idInternacao;
    private double valorDiaInternacao;
    private int quantDiaInternacao;
    private String motivoInternacao;
    private double valorInternacao;
    private static int totalIdInternacao;

    Enfermeiro objEnfermeiro;
    Medico objMedico;
    Paciente objPaciente;

    public Internacao(Enfermeiro objEnfermeiro, Medico objMedico, Paciente objPaciente, double valorDiaInternacao, int quantDiaInternacao, String motivoInternacao) {
        this.objEnfermeiro = objEnfermeiro;
        this.objMedico = objMedico;
        this.objPaciente = objPaciente;

        this.valorDiaInternacao = valorDiaInternacao;
        this.quantDiaInternacao = quantDiaInternacao;
        this.motivoInternacao = motivoInternacao;

        this.valorInternacao = this.valorDiaInternacao * this.quantDiaInternacao;

        Internacao.totalIdInternacao = Internacao.totalIdInternacao + 1;
        this.idInternacao = Internacao.totalIdInternacao;
    }

    public int getIdInternacao() {
        return idInternacao;
    }

    public void setIdInternacao(int idInternacao) {
        this.idInternacao = idInternacao;
    }

    public double getValorDiaInternacao() {
        return valorDiaInternacao;
    }

    public void setValorDiaInternacao(double valorDiaInternacao) {
        this.valorDiaInternacao = valorDiaInternacao;
    }

    public int getQuantDiaInternacao() {
        return quantDiaInternacao;
    }

    public void setQuantDiaInternacao(int quantDiaInternacao) {
        this.quantDiaInternacao = quantDiaInternacao;
    }

    public String getMotivoInternacao() {
        return motivoInternacao;
    }

    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }

    public double getValorInternacao() {
        return valorInternacao;
    }

    public void setValorInternacao(double valorTotalInternacao) {
        this.valorInternacao = valorTotalInternacao;
    }

    public static int getTotalIdInternacao() {
        return totalIdInternacao;
    }

    public static void setTotalIdInternacao(int totalIdInternacao) {
        Internacao.totalIdInternacao = totalIdInternacao;
    }

    public void relatorioInternacao() {
        System.out.println("--------RELATÓRIO DE INTERNAÇÃO--------");
        System.out.println("Paciente: " + this.objPaciente.getNomePaciente());
        System.out.println("Medico: " + objMedico.getNomeMedico());
        System.out.println("Enfermeiro: " + objEnfermeiro.getNomeEnfermeiro());
        System.out.println("ID: " + this.getIdInternacao());
        System.out.println("Valor Dia: " + this.getValorDiaInternacao() + " Quantidade dia: " + this.getQuantDiaInternacao());
        System.out.println("Valor internação: " + this.getValorInternacao());
        System.out.println("----------------------------------------");
    }

}
