package com.estudos.testes.domain;

import com.estudos.testes.outros.Autentica;
import lombok.Data;

@Data
public class Cliente implements Autentica {

    private Long id;
    private String nome;
    private String cpf;
    private String senha;

    @Override
    public boolean autenticaSenha(String senha) {
        return senha.equals("123");
    }
}
