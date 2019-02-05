package br.edu.devmedia.jackson;

import java.math.BigDecimal;
import java.util.List;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String endereco;
	private BigDecimal salario;
	List<String> musicas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<String> getMusicas() {
		return musicas;
	}
	public void setMusicas(List<String> musicas) {
		this.musicas = musicas;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + ", salario=" + salario
				+ ", musicas=" + musicas + "]";
	}
	
}
