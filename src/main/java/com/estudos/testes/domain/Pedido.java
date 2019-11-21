package com.estudos.testes.domain;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {
    private Long id;
    private Cliente cliente;
    private BigDecimal valorTotal;
    private String formaPagamento;
    private List<ItemPedido> itemPedidos;
}
