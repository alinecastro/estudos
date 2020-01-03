package com.estudos.testes.service;

import com.estudos.testes.domain.Cliente;
import com.estudos.testes.exceptions.BussinessException;

public interface ClienteService {
    Cliente salvar(Cliente cliente) throws BussinessException;
}
