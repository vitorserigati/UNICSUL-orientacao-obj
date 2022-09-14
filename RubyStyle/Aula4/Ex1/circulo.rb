class Circulo
  attr_reader :raio, :pi

  def initialize(raio)
    @raio = raio
    @pi = 3.1415
  end

  def calc_area
    @pi * (raio**2)
  end

  def to_s
    return "Raio do círculo:  #{@raio}  área:  #{calc_area}" unless @raio <= 0
  end
end
