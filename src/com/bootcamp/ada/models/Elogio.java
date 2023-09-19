package com.bootcamp.ada.models;

public non-sealed class Elogio extends Postagem{
    @Override
    public String getTipo() {
        return this.getClass().getSimpleName();
    }
}
