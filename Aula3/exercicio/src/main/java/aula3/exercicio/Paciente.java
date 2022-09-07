
package aula3.exercicio;

/**
 *
 * @author autologon
 */
public class Paciente {
    private String nome;
    private String rg;
    private String endereco;
    private String telefone;
    private String dataNascimento;
    private String profissao;
    
    public Paciente(){}
    public Paciente(String nome, 
            String rg, 
            String endereco, 
            String telefone, 
            String dataNascimento, 
            String profissao){
        SetNome(nome);
        SetRg(rg);
        SetEndereco(endereco);
        SetTelefone(telefone);
        SetNascimento(dataNascimento);
        SetProfissao(profissao);
    }
    
    private void SetNome(String nome){
        if (nome != null && nome.length() > 3){
            this.nome = nome;
        }else{
            System.out.println("Nome errado");
        }
    }
    private void SetRg(String rg){
        if (rg != null && rg.length() > 4){
            this.rg = rg;
        }else{
            System.out.println("RG inválido.");
        }
    }
    private void SetEndereco(String endereco){
        if (endereco != null && endereco.length() > 3){
            this.endereco = endereco;
        }else{
            System.out.println("Endereço inválido.");
        }
    }
    private void SetTelefone(String telefone){
        if (telefone != null && telefone.length() > 4){
            this.telefone = telefone;
        }else{
            System.out.println("Telefone inválido.");
        }
    }
    private void SetNascimento(String dataNascimento){
        if (dataNascimento != null && dataNascimento.length() > 5){
            this.dataNascimento = dataNascimento;
        }else{
            System.out.println("Data de nascimento inválida.");
        }
    }
    private void SetProfissao(String profissao){
        if (profissao != null && profissao.length() > 4){
            this.profissao = profissao;
        }else{
            System.out.println("Profissão inválida.");
        }
    }
    
    public String nome(){
        return this.nome;
    }
    public String rg(){
        return this.rg;
    }
    public String endereco(){
        return this.endereco;
    }
    public String telefone(){
        return this.telefone;
    }
    public String dataNascimento(){
        return this.dataNascimento;
    }
    public String profissao(){
        return this.profissao;
    }
    
    public String Info(){
        return "Nome: " + nome() +
                "\nRG: " + rg() +
                "\nEndereço: " + endereco() +
                "\nTelefone: " + telefone() + 
                "\nData de Nascimento: " + dataNascimento() +
                "\nProfissão: " + profissao();
    }
    
    
}
