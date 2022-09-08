namespace ex_imc.classes;

public class Imc
{
    private float Weigth { get; }
    private float Height { get; }
    public float ImcFinal { get; private set; }

    public Imc(float weigth, float height)
    {
        Weigth = weigth;
        Height = height;
        ImcFinal = Calculator();
    }

    private float Calculator()
    {
        return Weigth / (Height * Height);
    }
}
