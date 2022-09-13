package aula4.projeto_circ_cil;
import javax.swing.JOptionPane;

public class Projeto_circ_cil {

    public static void main(String[] args) {
        float raio = Float.parseFloat(JOptionPane.showInputDialog(
                "Digite o valor do raio: "));
        Circulo circ = new Circulo(raio);
        circ.imprimeDados();
        float altura = Float.parseFloat(JOptionPane.showInputDialog(
                "Digite a altura do cilindro: "));
        Cilindro cil = new Cilindro(altura, circ);
        cil.imprimeDados();    
    }
}
