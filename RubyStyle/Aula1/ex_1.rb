class Pessoa
  
  attr_reader :nome, :idade
  def initialize(nome, idade)
    @nome = set_nome(nome)
    @idade = set_idade(idade)
  end
  
  def set_nome(nome)
    if nome.length >= 3 
      @nome = nome
    end
  end

  def set_idade(idade)
    if idade != @idade && idade > 0
      @idade = idade
    end
  end

end


p = Pessoa.new('Vitor Serigati', 29)
p1 = Pessoa.new('Henrique Serigati', 22)

puts "Nome: #{p1.nome}, minha idade é: #{p1.idade}"
puts "Nome: #{p.nome}, minha idade é: #{p.idade}"
p.set_nome('vit')

puts p.nome