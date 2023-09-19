package com.bootcamp.ada.models;

import java.time.LocalDate;
import java.util.*;

import static java.time.LocalDate.now;
import static java.time.Period.between;

public class Cliente implements IIdade{

    private UUID uuid;
    private String nome;
    private String email;
    private String senha;
    private LocalDate dataNascimento;

    public Cliente(){
    }
    public Cliente(UUID uuid, String nome, String email, String senha, LocalDate dataNascimento) {
        this.uuid = uuid;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int getIdade() {
        return between(dataNascimento, now()).getYears();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "uuid=" + uuid +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
