package br.unipar.devbackend.fixr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Avaliacoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Cliente cliente;
    private Prestador prestador;
    private Double nota;
    private String comentario;
    private LocalDate data;
    private String sugest_melhoria;
}
