package com.colegio;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Aluno NovoAluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        NovoAluno.setNome(sc.nextLine());

        System.out.println("Digite a idade do aluno: ");
        NovoAluno.setIdade(sc.nextInt());

        System.out.println("Digite a série do aluno: ");
        NovoAluno.setSerie(sc.nextInt());

        System.out.printf("O aluno %s tem %s anos e está na %sª série.", NovoAluno.getNome(), NovoAluno.getIdade(), NovoAluno.getSerie());

        sc.close();
    }
}
