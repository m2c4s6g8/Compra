package br.edu.ifms.compra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.compra.model.Produto;

@Repository
public interface RepositoryProduto extends JpaRepository<Produto, Long> {

}
