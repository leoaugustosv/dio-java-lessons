package com.mcyum.lanche.area.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        prepararLanche();
        System.out.println("ADICIONANDO LANCHE NATURAL DE HAMBURGUER NO BALCÃO...");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCÃO...");
    }

    public void adicionarComboNoBalcao(){
        System.out.println("ADICIONANDO COMBO ABAIXO:");
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE...");
        System.out.println("---LANCHE PRONTO---");
    }

    private void prepararVitamina(){
        System.out.println("PREPARANDO VITAMINA...");
        System.out.println("---VITAMINA PRONTA---");
    }

    private void selecionarIngredientesLanche(){
        System.out.println("SELECIONADO PÃO, SALADA, OVO E CARNE.");
    }

    private void selecionarIngredientesVitamina(){
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO.");
    }

    private void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES...");
        System.out.println("INGREDIENTES LAVADOS!");
    }

	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}


}
