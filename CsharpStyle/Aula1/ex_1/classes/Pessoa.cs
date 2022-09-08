namespace ex_1.classes;

public class Pessoa
{
    private int _idade;
    private string? _name;

    public Pessoa(string name, int age)
    {
        SetName(name);
        Idade = age;
    }

    public string Name
    {
        get { return _name; }
        set
        {
            SetName(value);
        }
    }


    public int Idade
    {
        get { return _idade; }
        set
        {
            SetIdade(value);
        }
    }
    private void SetName(string name)
    {
        if (name.Length >= 3 && name != null)
        {
            _name = name;
        }
        else
        {
            Console.WriteLine("Valor inválido!");
        }
    }
    private void SetIdade(int idade)
    {
        if (idade != _idade && idade > 0)
        {
            _idade = idade;
        }
    }
}
