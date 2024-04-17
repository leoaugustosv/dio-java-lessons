package com.exemplo.sistemacadastro;

import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) throws Exception {
        
        Usuarios user = new Usuarios();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        user.setNome(sc.nextLine());

        System.out.printf("%s - %s - %s", user.getNome(),user.getCpf(),user.getEndereco());

        sc.close();
    }
}
