package br.com.dio.poo.model;

public class Endereco {

    enum TipoEndereco {RESEDENCIAL, ENTREGA, TRABALHO}

    public String endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String estado;
    public String cep;
}
