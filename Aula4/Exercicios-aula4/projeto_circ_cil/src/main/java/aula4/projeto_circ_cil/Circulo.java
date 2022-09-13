package aula4.projeto_circ_cil;
import javax.swing.JOptionPane;


public class Circulo {
    
    public float raio;
    public final float pi = 3.1415f;
    
    public Circulo(){}
    public Circulo(float raio){
        this.raio = raio;
    }
    
    public float calculaArea(){
        return pi * (raio*raio);
    }
    
    public void imprimeDados(){
        if(raio > 0.0f){
        JOptionPane.showMessageDialog(null,
                "Raio do círculo: " + 
                        this.raio + 
                        " área: " + 
                        calculaArea());
        }      
    }
    
}
