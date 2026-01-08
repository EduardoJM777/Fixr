package br.unipar.devbackend.fixr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
@Entity
public class Prestador extends Usuario{

    @Enumerated(EnumType.STRING)
    private Profissao profissao;

    public void procurarAnuncio(){

    }
    public void cadastrarNovaProfissao(){

    }
}
