package com.kauan.PedidoDeVendas.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
 
import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "Produto",schema = "teste")
public class Produto  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double precoAtual;
    private Integer quantidadeEstoque;

    @ManyToMany
    @JoinTable(name = "produto_categoria",schema = "teste", joinColumns = @JoinColumn(name = "id_produto"), inverseJoinColumns = @JoinColumn(name = "id_categoria"))
    private Set<Categoria> categorias = new HashSet<Categoria>();
     


    public Produto(Integer id, String nome, Double precoAtual, Integer quantidadeEstoque) {
        this.id = id;
        this.nome = nome;
        this.precoAtual = precoAtual;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoAtual() {
        return precoAtual;
    }

    public void setPrecoAtual(Double precoAtual) {
        this.precoAtual = precoAtual;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Set<Categoria> getCategorias() {
        return categorias;
    }
}
