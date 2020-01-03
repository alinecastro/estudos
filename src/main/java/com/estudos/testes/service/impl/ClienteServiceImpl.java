package com.estudos.testes.service.impl;

import com.estudos.testes.domain.Cliente;
import com.estudos.testes.exceptions.BussinessException;
import com.estudos.testes.repository.ClienteRepository;
import com.estudos.testes.service.ClienteService;

import java.util.Optional;

public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente salvar(Cliente cliente) throws BussinessException {
        Optional<Cliente> optionalCliente = clienteRepository.findByCpf(cliente.getCpf());
        if (optionalCliente.isPresent()) {
            throw new BussinessException();
        }

        optionalCliente = clienteRepository.findByNome(cliente.getNome());
        if (optionalCliente.isPresent()) {
            throw new BussinessException();
        }
        return clienteRepository.save(cliente);
    }
}
