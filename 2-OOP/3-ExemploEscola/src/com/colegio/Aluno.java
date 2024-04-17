package com.colegio;

public class Aluno {
    private String nome;
    private int idade;
    private int serie;
    private String sexo;

    public String getNome(){
        return nome;
    }

    public void setNome(String newNome){
        if(newNome.length() > 1){
            this.nome = newNome;
        }
        else{
            System.out.println("ATENÇÃO: Nome do aluno muito pequeno. Verificar!!!");

        }
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int newIdade){
        this.idade = newIdade;
    }

    public int getSerie(){
        return serie;
    }

    public void setSerie(int newSerie){
       this.serie = newSerie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
