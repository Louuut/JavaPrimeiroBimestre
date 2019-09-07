package unifcv.com.br;

import java.time.LocalDateTime;

public class Pessoa {
	private LocalDateTime dataAtual = LocalDateTime.now();
	private String nome;
	private int idade;
	private String dataNacimento;
	private int dia;
	private int mes;
	private int ano;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	public void calculaIdade() {
		if (mes >= dataAtual.getMonthValue() && dia >= dataAtual.getDayOfMonth()) {
			idade = dataAtual.getYear() - ano - 1;
		} else {
			idade = dataAtual.getYear() - ano;
		}
	}

	public void informaIdade() {
		System.out.println("A idade eh: " + idade);
	}

	public void informaNome() {
		System.out.println("Nome: " + nome);
	}

	public void ajustaDataDeNascimento() {
		dia = 8;
		mes = 12;
		ano = 1995;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}