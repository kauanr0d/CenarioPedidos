package com.kauan.PedidoDeVendas.domain.pk;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import com.kauan.PedidoDeVendas.domain.Produto;
import com.kauan.PedidoDeVendas.domain.Pedido;
import java.io.Serializable;
 
@Embeddable
public class ItemPedidoPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    public ItemPedidoPK() {
    }

    public Pedido getPedido() {
        return this.pedido;
    }

    public Produto getProduto() {
        return this.produto;
    }


}
