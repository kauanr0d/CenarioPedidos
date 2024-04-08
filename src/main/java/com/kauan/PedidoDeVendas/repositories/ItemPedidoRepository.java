package com.kauan.PedidoDeVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kauan.PedidoDeVendas.domain.ItemPedido;
import com.kauan.PedidoDeVendas.domain.pk.ItemPedidoPK;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPK>{

}
