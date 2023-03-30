package br.edu.ifms.compra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.compra.dto.ProdutoDto;
import br.edu.ifms.compra.model.Produto;
import br.edu.ifms.compra.repository.RepositoryProduto;

@Service
public class ProdutoService {
	
	@Autowired
	private RepositoryProduto repositoryProduto;
	
	public List<Produto> buscarTodos(){
		return repositoryProduto.findAll();
	}
	
	public Produto buscarId(Long id) {
		Optional <Produto> produto = repositoryProduto.findById(id);
		return produto.orElseThrow();
	}
	
	public Produto inserir(Produto produto) {
		produto.setId(null);
		return repositoryProduto.save(null);
	}
	
	public void remover(Long id) {
		buscarId(id);
		repositoryProduto.deleteById(id);
	}

	public Produto atualizar(Produto produto) {
		Produto produtoNovo = buscarId(produto.getId());
		produtoNovo.setNome(produto.getNome());
		produtoNovo.setPreco(produto.getPreco());
		produtoNovo.setValidade(produto.getValidade());
		return repositoryProduto.save(produtoNovo);
	}
	
	public Produto formDto(ProdutoDto produtoDto) {
		return new Produto(produtoDto.getId(),produtoDto.getNome(),produtoDto.getPreco(),produtoDto.getValidade());
	}
}
