namespace Ex1;
using System.Globalization;

class Program
{

    static void Main(string[] args)
    {
        Console.WriteLine("Digite o valor do raio: ");
        float raio = float.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
        Circulo circ = new Circulo(raio);
        Console.WriteLine(circ.ToString());

        Console.WriteLine("Digite a altura do cilindro: ");
        float altura = float.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
        Cilindro cil = new Cilindro(altura, circ);
        Console.WriteLine(cil.ToString());
    }
}