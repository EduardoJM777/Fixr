package br.unipar.devbackend.fixr.model;

import java.time.LocalDate;

public class Avaliacoes {
    private Integer id;
    private Cliente cliente;
    private Prestador prestador;
    private Double nota;
    private String comentario;
    private LocalDate data;
    private String sugest_melhoria;
}
