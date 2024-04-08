/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoHospital;

import java.util.Scanner;



/**
 *
 * @author tulio
 */
public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do Paciente");
        String nomePaciente = entrada.nextLine();
        Paciente cli1  = new Paciente(nomePaciente);
        
        Enfermeiro enf1 = new Enfermeiro();
        enf1.setNomeEnfermeiro("Nivaldo");
        Medico med1 = new Medico("Thadeu");
        Medico med2 = new Medico("Maria");
        Internacao inter1 = new Internacao(enf1, med1, cli1, 500.50, 10, "Covid");
        Internacao inter2 = new Internacao(enf1, med2, cli1, 500.50, 5, "Pneumonia");
    
        inter1.relatorioInternacao();
        inter2.relatorioInternacao();
        
        
      
        
    }
    
}
