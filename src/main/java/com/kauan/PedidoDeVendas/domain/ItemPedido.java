package com.kauan.PedidoDeVendas.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kauan.PedidoDeVendas.domain.pk.ItemPedidoPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import com.kauan.PedidoDeVendas.domain.pk.ItemPedidoPK;

@Entity
@Table(name = "ItemPedido",schema = "teste")
public class ItemPedido implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();
    private Double desconto;
    private Integer quantidade;

   

    public ItemPedidoPK getId() {
        return id;
    }
    public void setId(ItemPedidoPK id) {
        this.id = id;
    }
    public Double getDesconto() {
        return desconto;
    }
    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }


}
