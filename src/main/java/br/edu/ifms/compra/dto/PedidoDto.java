package br.edu.ifms.compra.dto;

public class PedidoDto {

	private Long id;
	private String dataPedido;
	private float totalPedido;
	
	public PedidoDto() {
		// TODO Auto-generated constructor stub
	}

	public PedidoDto(Long id, String dataPedido, float totalPedido) {
		super();
		this.id = id;
		this.dataPedido = dataPedido;
		this.totalPedido = totalPedido;
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
	
	
}
