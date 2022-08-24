package aula1.mavenproject1;


public class Principal {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Vitor", 29);
        Pessoa p1 = new Pessoa("Henrique", 22);
               
    
        
        System.out.println("Nome: " 
                + p.getNome()
                + " minha idade é: " + p.getIdade()
        );
        
        System.out.println("Nome: " 
                + p1.getNome()
                + " minha idade é: " 
                + p1.getIdade());             
        
        p.setNome("v");
        
        System.out.println(p.getNome());
    }

    
}
