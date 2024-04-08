package com.kauan.PedidoDeVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kauan.PedidoDeVendas.domain.Produto;

public interface ProdutoRepository extends JpaRepository <Produto,Integer>{

}
