package br.edu.ifms.compra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.compra.dto.PedidoDto;
import br.edu.ifms.compra.model.Pedido;
import br.edu.ifms.compra.repository.RepositoryPedido;

@Service
public class PedidoService {
	
	@Autowired
	private RepositoryPedido repositoryPedido;
	
	public List<Pedido> buscarTodos(){
		return repositoryPedido.findAll();
	}
	
	public Pedido buscarId(Long id) {
		Optional <Pedido> pedido = repositoryPedido.findById(id);
		return pedido.orElseThrow();
	}
	
	public Pedido inserir(Pedido pedido) {
		pedido.setId(null);
		return repositoryPedido.save(null);
	}
	
	public void remover(Long id) {
		buscarId(id);
		repositoryPedido.deleteById(id);
	}
	
	public Pedido atualizar(Pedido pedido) {
		Pedido pedidoNovo = buscarId(pedido.getId());
		pedidoNovo.setDataPedido(pedido.getDataPedido());
		pedidoNovo.setTotalPedido(pedido.getTotalPedido());
		return repositoryPedido.save(pedidoNovo);
	}
	
	public Pedido formDto(PedidoDto pedidoDto) {
		return new Pedido(pedidoDto.getId(),pedidoDto.getDataPedido(),pedidoDto.getTotalPedido());
	}
}
