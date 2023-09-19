package com.bootcamp.ada.models;

import java.util.UUID;

public class Empresa {

    private UUID uuid;

    private String nome;

    private Setor setor;

    private enum Setor {
        BANCO, LIVRARIA, ACOUGUE, PADARIA, OFICINA, FLORICULTURA
    }



}
