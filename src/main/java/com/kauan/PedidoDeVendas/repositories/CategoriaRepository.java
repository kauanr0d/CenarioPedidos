package com.kauan.PedidoDeVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kauan.PedidoDeVendas.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer>{
    
}
