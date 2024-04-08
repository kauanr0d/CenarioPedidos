package com.kauan.PedidoDeVendas.domain;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.PrimaryKeyJoinColumn;


@Entity
@Table(name = "PagamentoBoleto",schema = "teste")
@PrimaryKeyJoinColumn(name="idPagamento")
public class PagamentoBoleto extends Pagamento implements Serializable {
    private static final long serialVersionUID = 1L;

    public PagamentoBoleto(Integer id, String situacao, Double valor, LocalDate dataVencimento, LocalDate dataPagamendo) {
        super(id, situacao, valor);
        this.dataVencimento = dataVencimento;
        this.dataPagamendo = dataPagamendo;
    }

    public PagamentoBoleto(String situacao, Double valor, LocalDate dataVencimento, LocalDate dataPagamendo) {
        super(situacao, valor);
        this.dataVencimento = dataVencimento;
        this.dataPagamendo = dataPagamendo;
    }

    private LocalDate dataVencimento;
    private LocalDate dataPagamendo;

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataPagamendo() {
        return dataPagamendo;
    }

    public void setDataPagamendo(LocalDate dataPagamendo) {
        this.dataPagamendo = dataPagamendo;
    }

}
