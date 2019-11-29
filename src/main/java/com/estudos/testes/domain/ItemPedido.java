package com.estudos.testes.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ItemPedido {

    private Long id;
    private Produto produto;
    private Integer quantidade;
    private BigDecimal valorProduto;
}
