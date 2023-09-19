package com.bootcamp.ada.models;

public non-sealed class Reclamacao extends Postagem{
    @Override
    public String getTipo() {
        return this.getClass().getSimpleName();
    }
}
