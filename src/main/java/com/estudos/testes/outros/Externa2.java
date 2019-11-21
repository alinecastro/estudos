package com.estudos.testes.outros;

public class Externa2 {

    public boolean imprimeTextoClasseLocal() {
        class ClasseLocal {
            private String texto = "texto classe local";

            public void imprimeTexto() {
                System.out.println(texto);
            }
        }
        ClasseLocal classeLocal = new ClasseLocal();
        classeLocal.imprimeTexto();
        return classeLocal.texto.equals("texto classe local");
    }
}
