namespace ex_imc;
using ex_imc.classes;

class Program
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Digite o seu peso: ");
        float peso = float.Parse(Console.ReadLine());
        Console.WriteLine("Digite a sua altura: ");
        float altura = float.Parse(Console.ReadLine());

        Imc imc = new Imc(peso, altura);

        Console.WriteLine($"O seu Imc é: {imc.ImcFinal}");
    }
}