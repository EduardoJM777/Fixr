package br.unipar.devbackend.fixr.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Anuncios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;
    private String descricao;
    private LocalDate dataPublicacao;

    @Enumerated(EnumType.STRING)
    private StatusAnuncio statusAnuncio;

    @Enumerated(EnumType.STRING)
    private Profissao profissao;

    @ManyToOne
    private Cliente cliente;

}
