puts 'Digite a primeira nota: '
nota1 = gets.chomp.to_f
while nota1 > 10.0 || nota1 <= 0.0
  puts 'a nota deve estar entre zero e 10'
  nota1 = gets.chomp.to_f
end
puts 'Digite a segunda nota: '
nota2 = gets.chomp.to_f
while nota2 > 10.0 || nota2 <= 0.0
  puts 'A nota deve estar entre zero e dez'
  nota2 = gets.chomp.to_f
end

media = (nota1 + nota2) / 2

if media >= 8.0 && media <= 10.0
  puts "Média final: #{media}, seu conceito na matéria é: A"
elsif media >= 6.0 && media < 8
  puts "Média final: #{media}, seu conceito na matéria é: B"
elsif media >= 4.0 && media < 6.0
  puts "Média final: #{media}, seu conceito na matéria é: C"
else
  puts "Média final: #{media}, seu conceito na matéria é: D"
end
