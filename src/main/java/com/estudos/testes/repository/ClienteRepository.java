package com.estudos.testes.repository;

import com.estudos.testes.domain.Cliente;

import java.util.Optional;

public interface ClienteRepository {
    Cliente save(Cliente cliente);

    Optional<Cliente> findByCpf(String cpf);

    Optional<Cliente> findByNome(String nome);
}
