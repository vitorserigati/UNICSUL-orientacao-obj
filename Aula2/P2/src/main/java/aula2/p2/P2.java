package aula2.p2;
import javax.swing.JOptionPane;

public class P2 {

    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
        
        ImcCalculator imc = new ImcCalculator(peso, altura);
        imc.Calculator();
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc.Imc() + " kg/m²");
    }
}
