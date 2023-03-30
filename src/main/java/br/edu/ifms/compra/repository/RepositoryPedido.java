package br.edu.ifms.compra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.compra.model.Pedido;

@Repository
public interface RepositoryPedido extends JpaRepository<Pedido, Long>{

}
