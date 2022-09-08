namespace ex_paciente;
using ex_paciente.classes;

class Program
{
    public static void Main(string[] args)
    {
        string nome, document, endereco, telefone, nascimento, profissao;

        Console.WriteLine("Digite o seu nome: ");
        nome = Console.ReadLine();
        Console.WriteLine("Digite o número do seu RG: ");
        document = Console.ReadLine();
        Console.WriteLine("Digite o seu endereço: ");
        endereco = Console.ReadLine();
        Console.WriteLine("Digite o seu Telefone: ");
        telefone = Console.ReadLine();
        Console.WriteLine("Digite a data do seu nascimento: ");
        nascimento = Console.ReadLine();
        Console.WriteLine("Digite a sua profissão: ");
        profissao = Console.ReadLine();
        Paciente p1 = new Paciente(
            nome,
            document,
            endereco,
            telefone,
            nascimento,
            profissao
        );
        Paciente p2 = new Paciente(
            "Henrique Serigati",
            "3333333",
            "Rua Alcino Fidelis, 304",
            "(11) 99999-9999",
            "25/03/2022",
            "Analista Jr"
        );
        Console.WriteLine("------------------------------------------------------");
        Console.WriteLine($"{p1}\ne:\n{p2}");
    }
}