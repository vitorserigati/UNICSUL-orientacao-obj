package aula4.projeto_circ_cil;
import javax.swing.JOptionPane;


public class Cilindro {
    private float altura;
    private Circulo base;
    
    public Cilindro(){}
    
    public Cilindro(float altura, Circulo base){
        this.altura = altura;
        this.base = new Circulo(base.raio);
    }
    
    public float calculaArea(){
        float lateral = (this.base.pi * 2) * (this.base.raio * altura);
        float areaTotal = (2 * this.base.calculaArea()) + (2 * lateral);
        return areaTotal;
    }
    
    public float calculaVolume(){
        return this.altura * this.base.calculaArea();
    }
    
    public void imprimeDados(){
    if(altura > 0.0f){
        JOptionPane.showMessageDialog(null, "A área do cilindro com altura " +
                this.altura + 
                " é: " + calculaArea() +
                "\n O volume deste cilíndro é: " + 
                calculaVolume());
    }
    }
}
