package com.kauan.PedidoDeVendas.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Entity
@Table(name = "Pedido",schema = "teste")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double desconto;
    private Double frete;
 
    @OneToOne
    @JoinColumn(name = "id_pedido")
    private Pagamento pagamento;
   
    @OneToOne
    private EnderecoEntrega enderecoEntrega;

    @ManyToOne 
    @JoinColumn(name = "id_cliente",nullable = false) 
    private Cliente cliente;

    public Pedido(Integer id, Double desconto, Double frete) {
        this.id = id;
        this.desconto = desconto;
        this.frete = frete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }
}