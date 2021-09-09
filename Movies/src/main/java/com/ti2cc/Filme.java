package com.ti2cc;

public class Filme {
	private int codigo;
	private String nome;
	private String diretor;
	private int duracao;
	
	public Filme() {
		this.codigo = -1;
		this.nome = "";
		this.diretor = "";
		this.duracao = 0;
	}
	
	public Filme(int codigo, String nome, String diretor, int duracao) {
		this.codigo = codigo;
		this.nome = nome;
		this.diretor = diretor;
		this.duracao = duracao;
	}

	public String toString() {
		return "Filme [codigo=" + codigo + ", nome=" + nome + ", diretor=" + diretor + ", duracao=" + duracao + "]";
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
}
