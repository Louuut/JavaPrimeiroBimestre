package br.com.unifcv;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
	List<Item> carrinho = new ArrayList<Item>();
	
	public void AddCarrinho(Item i) {
		carrinho.add(i);
	}
}
