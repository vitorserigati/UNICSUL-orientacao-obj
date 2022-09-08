namespace ex_paciente.classes;

public class Paciente
{
    public string Name { get; private set; }
    public string Document { get; private set; }
    public string Endereco { get; private set; }
    public string Telefone { get; private set; }
    public string DataNascimento { get; private set; }
    public string Profissao { get; private set; }

    public Paciente(string name,
    string document,
    string endereco,
    string telefone,
    string dataNascimento,
    string profissao)
    {
        SetNome(name);
        SetDocument(document);
        SetEndereco(endereco);
        SetTelefone(telefone);
        SetDataNascimento(dataNascimento);
        SetProfissao(profissao);
    }

    private void SetNome(string nome)
    {
        if (nome != null && nome.Length > 3)
        {
            Name = nome;
        }
    }
    private void SetDocument(string document)
    {
        if (document != null && document.Length > 3)
        {
            Document = document;
        }
    }
    private void SetEndereco(string endereco)
    {
        if (endereco != null && endereco.Length > 3)
        {
            Endereco = endereco;
        }
    }
    private void SetTelefone(string telefone)
    {
        if (telefone != null && telefone.Length > 3)
        {
            Telefone = telefone;
        }
    }
    private void SetDataNascimento(string nome)
    {
        if (nome != null && nome.Length > 3)
        {
            DataNascimento = nome;
        }
    }
    private void SetProfissao(string profissao)
    {
        if (profissao != null && profissao.Length > 3)
        {
            Profissao = profissao;
        }
    }

    public override string ToString()
    {
        return $"Nome: {Name}" +
        $"\nRG: {Document}" +
        $"\nEndereco: {Endereco}" +
        $"\nTelefone: {Telefone}" +
        $"\nData de nascimento: {DataNascimento}" +
        $"\nProfissão: {Profissao}";
    }
}