package unifcv.com.br;

public class Principal {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Eduardo");
		pessoa.setDataNacimento("20/05/2000");
		pessoa.setDia(20);
		pessoa.setMes(05);
		pessoa.setAno(2000);
		
		pessoa.informaNome();
		pessoa.calculaIdade();
		pessoa.informaIdade();
		pessoa.ajustaDataDeNascimento();
	}

}
