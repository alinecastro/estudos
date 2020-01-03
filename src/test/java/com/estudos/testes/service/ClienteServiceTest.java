package com.estudos.testes.service;

import com.estudos.testes.domain.Cliente;
import com.estudos.testes.exceptions.BussinessException;
import com.estudos.testes.repository.ClienteRepository;
import com.estudos.testes.service.impl.ClienteServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class ClienteServiceTest {

    private static final String NOME = "Ana Maria";
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
        cliente.setNome(NOME);
        cliente.setCpf(CPF);
        cliente.setSenha(DDDD);
        when(clienteRepository.findByCpf(CPF)).thenReturn(Optional.empty());
        when(clienteRepository.findByNome(NOME)).thenReturn(Optional.empty());
    }

    @Test
    public void deveSalvarClienteNoRepositorio() throws BussinessException {
        clienteService.salvar(cliente);
        verify(clienteRepository).save(cliente);
    }

    @Test(expected = BussinessException.class)
    public void naoDeveSalvarDoisClientesComMesmoCpf() throws BussinessException {
        when(clienteRepository.findByCpf(CPF)).thenReturn(Optional.of(cliente));
        clienteService.salvar(cliente);
    }

    @Test(expected = BussinessException.class)
    public void naoDeveSalvarDoisClientesComMesmoNome() throws BussinessException {
        when(clienteRepository.findByNome(NOME)).thenReturn(Optional.of(cliente));

        clienteService.salvar(cliente);
    }

    @Test
    public void deveBuscarClientePorNome() {
        when()
    }
}
