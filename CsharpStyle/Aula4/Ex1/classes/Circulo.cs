namespace Ex1;

public class Circulo
{
    public float Raio;
    public float Pi = 3.1415f;

    public Circulo() { }
    public Circulo(float raio)
    {
        Raio = raio;
    }

    public float calculaArea()
    {
        return Pi * (Raio * Raio);
    }

    public override string ToString()
    {
        if (Raio > 0.0f)
        {
            return $"Raio do circulo: {Raio.ToString()}, área: {calculaArea().ToString()}";
        }
        return "Raio inválido";
    }
}
