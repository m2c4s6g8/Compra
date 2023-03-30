package br.edu.ifms.compra.service;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.compra.model.Pedido;
import br.edu.ifms.compra.model.Produto;
import br.edu.ifms.compra.repository.RepositoryPedido;
import br.edu.ifms.compra.repository.RepositoryProduto;

@Service
public class DBService {

	@Autowired
	RepositoryPedido repositoryPedido;
	@Autowired
	RepositoryProduto repositoryProduto;
	
	public void instantiateTestDatabase() throws ParseException{
		// TODO Auto-generated method stub
		
		Pedido p1 = new Pedido(null,"2023-04-20",1);
		Pedido p2 = new Pedido(null,"2024-04-21",100);
		
		Produto pr1 = new Produto(null,"Geladeira",1500,"2023-04-21");
		Produto pr2 = new Produto(null,"Carro",3000,"2023-04-21");
		Produto pr3 = new Produto(null,"Computador",1700,"2023-04-21");
		Produto pr4 = new Produto(null,"Mesa",150,"2023-04-21");
		Produto pr5 = new Produto(null,"Caderno",15,"2023-04-21");
		
		p1.getProdutos().addAll(Arrays.asList(pr1,pr3));
		p2.getProdutos().addAll(Arrays.asList(pr2,pr4));
		
		pr1.getPedidos().addAll(Arrays.asList(p1));
		pr2.getPedidos().addAll(Arrays.asList(p2));
		pr3.getPedidos().addAll(Arrays.asList(p1));
		pr4.getPedidos().addAll(Arrays.asList(p2));
		
		
		
		repositoryPedido.saveAll(Arrays.asList(p1,p2));
		repositoryProduto.saveAll(Arrays.asList(pr1,pr2,pr3,pr4,pr5));
	}
}
