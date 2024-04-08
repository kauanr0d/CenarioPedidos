package com.kauan.PedidoDeVendas.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;


@Entity
@Table(name = "PagamentoCartao",schema = "teste")
@PrimaryKeyJoinColumn(name="idPagamento")
public class PagamentoCartao extends Pagamento implements Serializable{
	private static final long serialVersionUID = 1L;

    

    public PagamentoCartao(Integer id, String situacao, Double valor, Integer quantidadeParcelas) {
        super(id, situacao, valor);
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public PagamentoCartao(String situacao, Double valor, Integer quantidadeParcelas) {
        super(situacao, valor);
        this.quantidadeParcelas = quantidadeParcelas;
    }

    private Integer quantidadeParcelas;

    public Integer getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(Integer quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }
}
