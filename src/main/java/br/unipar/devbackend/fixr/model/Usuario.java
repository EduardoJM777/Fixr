package br.unipar.devbackend.fixr.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String email;
    private String senhaHash;
    private LocalDate dataCadastro;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    public void login(){

    }

    public void editarPerfil(){

    }

    public void excluirConta(){

    }

    public void adicionarContato(){

    }

    public void avaliar(){

    }
}
