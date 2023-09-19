package com.bootcamp.ada.models;

import java.util.UUID;

public class Empresa {

    private UUID uuid;

    private String nome;

    private Setor setor;

    private enum Setor {
        BANCO, LIVRARIA, ACOUGUE, PADARIA, OFICINA, FLORICULTURA
    }

    public Empresa(){
    }

    public Empresa(UUID uuid, String nome, Setor setor) {
        this.uuid = uuid;
        this.nome = nome;
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "uuid=" + uuid +
                ", nome='" + nome + '\'' +
                ", setor=" + setor +
                '}';
    }
}
