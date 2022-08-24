package aula1.mavenproject1;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(){}
    
    public Pessoa(String nome, int idade){
        if(nome.length() > 0){
            this.nome = nome; 
            this.idade = idade;
        }
        
        
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setNome(String nome){
        if(!nome.equals(this.nome) && nome.length() > 2){
            this.nome = nome;    
        }        
    }
    
    public void setIdade(int idade){
        if(idade != this.idade && idade > 0){
            this.idade = idade;
        }
    }
}
