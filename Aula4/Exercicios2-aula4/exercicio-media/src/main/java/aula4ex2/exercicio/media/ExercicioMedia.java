package aula4ex2.exercicio.media;
import javax.swing.JOptionPane;

public class ExercicioMedia {

    public static void main(String[] args) {
       float media = 0;
       float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
       float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
       
       if (nota1 >=0 && nota2 >= 0 && nota1 <= 10 && nota2 <=10){
        media = (nota1 + nota2) /2;
       }
       
       if (media >= 8.0 && media <= 10.0){
           JOptionPane.showMessageDialog(null, "Média final: " + media + " conceito A");
       }else if(media >= 6.0 && media < 8){
           JOptionPane.showMessageDialog(null, "Média final: " + media + " conceito B");
       }else if(media >= 4.0 && media < 6.0){
           JOptionPane.showMessageDialog(null, "Média final: " + media + " conceito C");
        }else if(media < 4.0){
            JOptionPane.showMessageDialog(null, "Média final: " + media + " conceito D");
       }
    }
}
