namespace ex_1;
using ex_1.classes;
class Program
{
    public static void Main(string[] args)
    {
        Pessoa p = new Pessoa("Vitor Serigati", 29);
        Pessoa p2 = new Pessoa("Henrique Serigati", 22);

        Console.WriteLine($"Nome: {p.Name}, minha idade é: {p.Idade}");
        Console.WriteLine($"Nome: {p2.Name}, minha idade é: {p2.Idade}");
        p.Name = "Vitor";
        Console.WriteLine(p.Name);
    }
}