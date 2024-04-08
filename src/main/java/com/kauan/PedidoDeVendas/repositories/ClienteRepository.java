package com.kauan.PedidoDeVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kauan.PedidoDeVendas.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
