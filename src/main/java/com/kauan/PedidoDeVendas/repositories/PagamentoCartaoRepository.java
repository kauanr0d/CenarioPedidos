package com.kauan.PedidoDeVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kauan.PedidoDeVendas.domain.PagamentoCartao;
public interface PagamentoCartaoRepository extends JpaRepository <PagamentoCartao, Integer> {

}
