using System.Globalization;

float media = 0f;
Console.WriteLine("Digite a primeira nota: ");
float nota1 = float.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
while (nota1 < 0.0 || nota1 > 10.0)
{
    Console.WriteLine("A nota deve estar entre 0 e 10");
    nota1 = float.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
}
Console.WriteLine("Digite a segunda nota: ");
float nota2 = float.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
while (nota2 < 0.0 || nota2 > 10.0)
{
    Console.WriteLine("A nota deve estar entre 0 e 10");
    nota2 = float.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
}

media = (nota1 + nota2) / 2;

if (media >= 8.0 && media <= 10.0)
{
    Console.WriteLine($"Média final: {media.ToString()} Seu conceito na matéria é: A");
}
else if (media >= 6.0 && media < 8.0)
{
    Console.WriteLine($"Média final: {media.ToString()} Seu conceito na matéria é: B");
}
else if (media >= 4.0 && media < 6.0)
{
    Console.WriteLine($"Média final: {media.ToString()} Seu conceito na matéria é: C");
}
else
{
    Console.WriteLine($"Média final: {media.ToString()} Seu conceito na matéria é: D");
}