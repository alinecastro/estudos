package com.estudos.testes.service;

import com.estudos.testes.domain.Cliente;
import com.estudos.testes.repository.ClienteRepository;
import com.estudos.testes.service.impl.ClienteServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.verify;

@RunWith(SpringJUnit4ClassRunner.class)
public class ClienteServiceTest {

    private static final String ANA_MARIA = "Ana Maria";
    private static final String CPF = "123456789";
    private static final long ID = 1L;
    public static final String DDDD = "dddd";

    private ClienteService clienteService;

    private Cliente cliente;

    @MockBean
    private ClienteRepository clienteRepository;

    @Before
    public void setUp() {
        clienteService = new ClienteServiceImpl(clienteRepository);
        cliente = new Cliente();
        cliente.setId(ID);
        cliente.setNome(ANA_MARIA);
        cliente.setCpf(CPF);
        cliente.setSenha(DDDD);
    }

    @Test
    public void deveSalvarClienteNoRepositorio() throws Exception {
        clienteService.salvar(cliente);
        verify(clienteRepository).save(cliente);
    }
}
