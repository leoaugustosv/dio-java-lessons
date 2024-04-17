package com.mcyum.lanche;

import com.mcyum.lanche.area.atendimento.Atendente;
import com.mcyum.lanche.area.atendimento.cozinha.Cozinheiro;
import com.mcyum.lanche.area.cliente.Cliente;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estarem disponíveis para toda a aplicação

		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		
		Atendente atendente = new Atendente();
        atendente.pegarPedidoBalcao();
		atendente.servindoMesa();
        atendente.receberPagamento();
		//ação que somente o seu pacote cozinha precisa conhecer (default)

		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();

	}
}
