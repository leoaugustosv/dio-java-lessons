package edu.candidatura.vagas;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"ALBERTO","JOSIAS","MARCO","MARIA","JENNIFER"};

        for (String s : candidatos) {
            entrandoEmContato(s);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando =! atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }
            else{
                System.out.println("Contato realizado com sucesso.");
            }

        }
        while(continuarTentando && tentativasRealizadas < 3);


        if (atendeu) {
            System.out.println("Conseguimos contato com "+ candidato +" na "+ tentativasRealizadas+ " tentativa.");
        } else {
            System.out.println("Não conseguimos contato com "+ candidato+", NÚMERO MÁXIMO DE TENTATIVAS REALIZADAS!");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"ALBERTO","JOSIAS","MARCO","MARIA","JENNIFER"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de nº "+ (i+1) +" é "+ candidatos[i]);
        }

        // FORMA ABREVIADA
        for (String s : candidatos) {
            System.out.println("O candidato selecionado foi "+ s);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"ALBERTO","JOSIAS","MARCO","MARIA","JENNIFER","LUCIO","WELLINGTON","EVERTON","BEATRIZ","JOSE","AIRTON","CAIO","PAULO","ABIGAIL","SILVIO","HUGO","VICTOR"};
        int candidatoSelecionado = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatoSelecionado < 5 && candidatosAtual < candidatos.length){

            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println((candidatoSelecionado+1)+" - "+candidatos[candidatoSelecionado]+ " tem salário pretendido de "+ salarioPretendido);
            
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga!");
                candidatoSelecionado++;
            }
            candidatosAtual++;
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        System.out.println("SALÁRIO DO CANDIDATO É: "+salarioPretendido);
        if (salarioBase >= salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO\n");
        }
        else if(salarioBase < salarioPretendido){
            System.out.println("NÃO LIGAR PARA O CANDIDATO\n");
        }
        
    }

}