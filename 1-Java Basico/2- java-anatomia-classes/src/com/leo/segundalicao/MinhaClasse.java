package com.leo.segundalicao;
public class MinhaClasse {
    

public static void main (String [] args) {

// System.out.print("Eu sou uma mensagem de print no Java");
String primeiroNome = "Leo";
String segundoNome = "Augusto";

String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
System.out.println(nomeCompleto);
}

public static String nomeCompleto(String primeiroNome, String segundoNome){
    return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
}

}
