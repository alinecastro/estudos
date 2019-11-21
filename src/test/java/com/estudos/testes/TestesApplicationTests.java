package com.estudos.testes;

import com.estudos.testes.domain.Cliente;
import com.estudos.testes.outros.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestesApplicationTests {

    @Test
    void imprimeTextoClasseExterna() {
        Externa externa = new Externa();
        assertEquals(externa.texto, "texto externo");
    }

    @Test
    void imprimeTextoClasseInterna() {
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();
        assertEquals(interna.texto, "texto interno");
    }

    @Test
    void imprimeTextoDaClasseLocalDaClasseExterna2() {
        Externa2 externa2 = new Externa2();
        assertTrue(externa2.imprimeTextoClasseLocal());
    }

    @Test
    void imprimeTextoClasseAnonima() {
        Anonima anonima = new Anonima() {
            public void imprimeTexto() {
                System.out.println("qualquer texto instancia classe anonima");
            }
        };
        anonima.imprimeTexto();
    }

    @Test
    void imprimeTextoInterface() {
        Texto texto = new Texto() {
            @Override
            public void imprimeTexto() {
                System.out.println("texto interface");
            }

            @Override
            public void exibe() {

            }
        };
        texto.imprimeTexto();
    }

    @Test
    void testeAutenticaSenhaCliente() {
        Cliente cliente = new Cliente();

        System.out.println(cliente.autenticaSenha("5"));
    }
}
