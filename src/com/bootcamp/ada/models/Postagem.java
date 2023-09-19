package com.bootcamp.ada.models;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract sealed class Postagem permits Resposta, Reclamacao, Elogio {

    private UUID uuid;
    private String descricao;
    private LocalDateTime dataDaPostagem;
    private int classificacao;

    public abstract String getTipo();

}
