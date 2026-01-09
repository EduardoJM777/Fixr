package br.unipar.devbackend.fixr.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Chats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate dataInicio;

    @ManyToOne(cascade = CascadeType.ALL)
    private Usuario usuario1;

    @ManyToOne(cascade = CascadeType.ALL)
    private Usuario usuario2;

}
