package com.exemplo.sistemacadastro;

public class Usuarios {
    private String nome;
    private String cpf;
    private String endereco;

    public Usuarios(){
        this.nome = "NOME NÃO INFORMADO";
        this.cpf = "CPF NÃO INFORMADO";
        this.endereco = "ENDEREÇO NÃO INFORMADO";
    }

    public String getNome(){
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
