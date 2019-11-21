package com.estudos.testes.service.impl;

import com.estudos.testes.repository.ClienteRepository;
import com.estudos.testes.service.ClienteService;

public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
}
