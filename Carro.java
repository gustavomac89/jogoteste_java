package testandoObjetos;

public class Carro {
	String Nome;
	String Marca;
	Integer Ano;
	Integer Aceleracao;
	Integer VelocidadeMaxima;
	
	public void setCarro(String nome,String marca, Integer ano, Integer aceleracao, Integer velocidade ) {
		Nome = nome;
		Marca = marca;
		Ano = ano;
		VelocidadeMaxima = velocidade;
		Aceleracao = aceleracao;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public Integer getAceleracao() {
		return Aceleracao;
	}

	public void setAceleracao(Integer aceleracao) {
		Aceleracao = aceleracao;
	}

	public Integer getVelocidadeMaxima() {
		return VelocidadeMaxima;
	}

	public void setVelocidadeMaxima(Integer velocidadeMaxima) {
		VelocidadeMaxima = velocidadeMaxima;
	}
	
	
	
	
}

