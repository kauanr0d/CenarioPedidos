package com.kauan.PedidoDeVendas.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pagamento",schema ="teste")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;
   
    @Id
    private Integer id;

    @OneToOne(mappedBy = "pagamento")
    private Pedido pedido;


    
    public Pagamento(Integer id, String situacao, Double valor) {
        this.id = id;
        this.situacao = situacao;
        this.valor = valor;
    }

    public Pedido getPedido() {
        return pedido;
    }

    private String situacao;
    private Double valor;
    
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Pagamento(String situacao, Double valor) {
        this.situacao = situacao;
        this.valor = valor;
    }


}
