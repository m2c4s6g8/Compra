package br.edu.ifms.compra.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dataPedido;
	private float totalPedido;
	
	@ManyToMany(mappedBy = "pedidos")
	private List<Produto> produtos = new ArrayList<Produto>();
	
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Pedido(Long id, String dataPedido, float totalPedido) {
		super();
		this.id = id;
		this.dataPedido = dataPedido;
		this.totalPedido = totalPedido;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDataPedido() {
		return dataPedido;
	}


	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}


	public float getTotalPedido() {
		return totalPedido;
	}


	public void setTotalPedido(float totalPedido) {
		this.totalPedido = totalPedido;
	}


	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}


	
	
}
