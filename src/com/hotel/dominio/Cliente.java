package com.hotel.dominio;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private LocalDate dataNascimento;
    private String documento;
    private EstadoCivilTipo estadoCivilTipo;
    private String telefone;
    private SexoTipo sexoTipo;

    public Cliente(String nome, LocalDate dataNascimento, String documento, EstadoCivilTipo estadoCivilTipo, String telefone, SexoTipo sexoTipo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.documento = documento;
        this.estadoCivilTipo = estadoCivilTipo;
        this.telefone = telefone;
        this.sexoTipo = sexoTipo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getDocumento() {
        return documento;
    }

    public EstadoCivilTipo getEstadoCivilTipo() {
        return estadoCivilTipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public SexoTipo getSexoTipo() {
        return sexoTipo;
    }
}
