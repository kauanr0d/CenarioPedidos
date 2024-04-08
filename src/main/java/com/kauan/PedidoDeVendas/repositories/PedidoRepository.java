package com.kauan.PedidoDeVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kauan.PedidoDeVendas.domain.Pedido;

public interface PedidoRepository extends JpaRepository <Pedido,Integer> {

}
