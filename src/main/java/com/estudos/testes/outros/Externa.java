package com.estudos.testes.outros;

public class Externa {
    public String texto = "texto externo";

    public class Interna {
        public String texto = "texto interno";

        public void imprimeTexto() {
            System.out.println(texto);
            System.out.println(Externa.this.texto + "externa");
        }
    }
}
