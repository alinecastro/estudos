package com.estudos.testes.service;

import com.estudos.testes.repository.ClienteRepository;
import com.estudos.testes.service.impl.ClienteServiceImpl;
import org.junit.jupiter.api.BeforeEach;

public class ClienteServiceTest {

    private ClienteService clienteService;
    private ClienteRepository clienteRepository;

    @BeforeEach
    void setUp() {
        clienteService = new ClienteServiceImpl(clienteRepository);

    }
}
