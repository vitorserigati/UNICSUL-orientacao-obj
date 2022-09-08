require_relative 'paciente'

puts 'Digite o seu nome: '
nome = gets.chomp
puts 'Digite o número do seu RG: '
document = gets.chomp
puts 'Digite o seu endereço: '
endereco = gets.chomp
puts 'Digite o seu telefone: '
telefone = gets.chomp
puts 'Digite a data do seu nascimento: '
nascimento = gets.chomp
puts 'Digite a sua profissão: '
profissao = gets.chomp

p1 = Paciente.new(nome, document, endereco, telefone, nascimento, profissao)
p2 = Paciente.new('Henrique Serigati',
                  '3333333333',
                  'Rua Alcino Fidelis, 304',
                  '(11)99999-9999',
                  '25/03/2022',
                  'Analista Jr')

puts "#{p1.info}\ne:\n#{p2.info}"
