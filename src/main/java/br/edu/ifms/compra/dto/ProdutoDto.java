package br.edu.ifms.compra.dto;

public class ProdutoDto {
	private Long id;
	private String nome;
	private int preco;
	private String validade;
	
	public ProdutoDto() {
		// TODO Auto-generated constructor stub
	}

	public ProdutoDto(Long id, String nome, int preco, String validade) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.validade = validade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	
	
}
