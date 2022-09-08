# frozen_string_literal: true

class Paciente
  attr_reader :nome, :document, :endereco, :telefone, :data_nascimento, :profissao

  def initialize(nome, document, endereco, telefone, data_nascimento, profissao)
    _nome(nome)
    _document(document)
    _endereco(endereco)
    _telefone(telefone)
    _data_nascimento(data_nascimento)
    _profissao(profissao)
  end

  private

  def _nome(nome)
    @nome = nome if nome != "\n" && nome.length > 3
  end

  def _document(document)
    @document = document if document != "\n" && document.length > 3
  end

  def _endereco(endereco)
    @endereco = endereco if endereco != "\n" && endereco.length > 3
  end

  def _telefone(telefone)
    @telefone = telefone if telefone != "\n" && telefone.length > 3
  end

  def _data_nascimento(data_nascimento)
    @data_nascimento = data_nascimento if data_nascimento != "\n" && data_nascimento.length > 3
  end

  def _profissao(profissao)
    @profissao = profissao if profissao != "\n" && profissao.length > 3
  end

  public

  def info
    "nome: #{nome}\n
    RG: #{document}\n
    Endereco: #{endereco}\n
    Telefone: #{telefone}\n
    Data de nascimento: #{data_nascimento}\n
    Profissão: #{profissao}"
  end
end
