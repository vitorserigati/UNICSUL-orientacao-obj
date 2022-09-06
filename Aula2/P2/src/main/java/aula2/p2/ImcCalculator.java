package aula2.p2;

/**
 *
 * @author autologon
 */
public class ImcCalculator {
    private double peso;
    private double altura;
    private double imc;
    
    public ImcCalculator(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }
    
    public double Imc(){
        return this.imc;
    }
    
    
    public void Calculator(){
        this.imc = this.peso/(this.altura*this.altura);
    }
}
