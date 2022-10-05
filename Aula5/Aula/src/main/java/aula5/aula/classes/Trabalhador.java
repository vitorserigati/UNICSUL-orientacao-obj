/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5.aula.classes;

import javax.swing.JOptionPane;

/**
 *
 * @author autologon
 */
public class Trabalhador {
    private String nome;
    private double[] salario;
    
    public Trabalhador(String nome, double[] salario){
        double media = 0;
        this.nome = nome;
        this.salario = new double[salario.length];
        for(int i = 1; i<=12; i++){
            this.salario[i] = salario[i];
            media += salario[i];
            
        }
        this.salario[0] = media/(salario.length -1);
    }
    
    public void visualiza(){
        JOptionPane.showMessageDialog(null,
               "Dados do Trabalhador: \nNome: " + 
               this.nome + "\nÚltimo Salário: R$" + 
               this.salario[this.salario.length -1] + 
               "\nMédia: R$" + this.salario[0]);
    }
}
