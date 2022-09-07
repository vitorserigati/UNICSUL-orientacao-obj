/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula3.exercicio;
import javax.swing.JOptionPane;
/**
 *
 * @author autologon
 */
public class Exercicio {

    public static void main(String[] args) {
        String nome, rg, endereco, telefone, nascimento, profissao;
        Paciente p1, p2;
        
        
        
        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        rg = JOptionPane.showInputDialog("Digite o seu rg: ");
        endereco = JOptionPane.showInputDialog("Digite o seu endereco: ");
        telefone = JOptionPane.showInputDialog("Digite o seu telefone: ");
        nascimento = JOptionPane.showInputDialog("Digite a data do seu nascimento");
        profissao = JOptionPane.showInputDialog("Digite a sua profissão: ");
        
       p1 = new Paciente(nome,
                rg,
                endereco,
                telefone,
                nascimento,
                profissao);
        p2 = new Paciente("Henrique Serigati",
        "3000000",
        "Rua Alcino Fidelis, 304",
        "(11) 99999-9999",
        "25/03/2000",
        "Analista jr");
        JOptionPane.showMessageDialog(null,"Dados: \n" + p1.Info()+ "\n e: \n" + p2.Info());
        
    }
}
