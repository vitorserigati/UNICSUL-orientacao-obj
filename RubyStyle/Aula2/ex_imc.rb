# frozen_string_literal: true

class IMC
  attr_reader :peso, :altura, :imc

  def initialize(peso, altura)
    @peso = peso.to_f
    @altura = altura.to_f
    @imc = calculator
  end

  private

  def calculator
    @imc = peso / (altura**2)
  end
end

puts 'Digite o seu peso: '
peso = gets.chomp
puts 'Digite a sua altura: '
altura = gets.chomp

calculo = IMC.new(peso, altura)

puts "Seu IMC é: #{calculo.imc} Kg/m²"
