/*
3 - Identifique as classes e implemente um programa para a seguinte
especificação: “O supermercado vende diferentes tipos de produtos. Cada produto
tem um preço e uma quantidade em estoque. Um pedido de um cliente é composto
de itens, onde cada item especifica o produto que o cliente deseja e a
respectiva quantidade. Esse pedido pode ser pago em dinheiro, cheque ou cartão.”
*/
package br.com.unifcv;

public class Cliente {
	private String Nome;
	private int idade;
	private String CPF;
	private String RG;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
}
