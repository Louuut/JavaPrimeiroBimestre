package br.com.unifcv;

public class Item {
	private String produto;
	private int quantidade;
	private int preco;
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	public void pagamento(){
		System.out.println("Escolha forma de pagamento!");
	}
	

}
