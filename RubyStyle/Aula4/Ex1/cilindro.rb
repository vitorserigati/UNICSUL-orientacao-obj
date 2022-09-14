class Cilindro
  require_relative 'circulo'

  attr_reader :altura, :circulo

  def initialize(altura, circulo)
    @altura = altura
    @circulo = Circulo.new(circulo.raio)
  end

  def calc_area
    lateral = (@circulo.pi * 2) * (@circulo.raio * @altura)
    (2 * @circulo.calc_area) + (2 * lateral)
  end

  def calc_volume
    altura * @circulo.calc_area
  end

  def to_s
    unless @altura <= 0
      "A área do cilindro com altura #{@altura} é: #{calc_area}\nO volume deste cilindro é: #{calc_volume}"
    end
  end
end
