package com.kauan.PedidoDeVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kauan.PedidoDeVendas.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento,Integer>{

}
