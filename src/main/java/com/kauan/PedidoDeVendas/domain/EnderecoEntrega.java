package com.kauan.PedidoDeVendas.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.io.Serializable;


@Entity
@Table(name = "EnderecoEntrega",schema = "teste")
public class EnderecoEntrega implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    private String logradouro;
    private String numero;
    private String bairro;
    private String CEP;

    
    @OneToOne(mappedBy = "enderecoEntrega")
    @MapsId
    private Pedido pedido;

    public EnderecoEntrega(String logradouro, String numero, String bairro, String CEP) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
}
