package com.estudos.testes.service.impl;

import com.estudos.testes.domain.Cliente;
import com.estudos.testes.repository.ClienteRepository;
import com.estudos.testes.service.ClienteService;

public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
