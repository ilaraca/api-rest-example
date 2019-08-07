package com.produtos.apirestexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirestexample.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	Produto findById(long id);
}
