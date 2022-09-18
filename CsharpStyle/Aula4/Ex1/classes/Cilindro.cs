namespace Ex1;

public class Cilindro
{
    private float _altura;
    private Circulo _base;

    public Cilindro() { }
    public Cilindro(float altura, Circulo base1)
    {
        _altura = altura;
        _base = new Circulo(base1.Raio);
    }

    public float calculaArea()
    {
        float lateral = (_base.Pi * 2) * (_base.Raio * _altura);
        float areaTotal = (2 * _base.calculaArea()) + (2 * lateral);
        return areaTotal;
    }

    public float calculaVolume()
    {
        return _altura * _base.calculaArea();
    }

    public override string ToString()
    {
        if (_altura > 0.0f)
        {

            return $" A área do cilindro com altura {_altura.ToString()} é: {calculaArea().ToString()}\nO volume deste cilindro é: {calculaVolume()}";
        }
        return "Cilindro inválido";
    }
}
