package com.estudos.testes.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Pedido {

    private Long id;
    private Cliente cliente;
    private BigDecimal valorTotal;
    private String formaPagamento;
    private List<ItemPedido> itemPedidos;
}
