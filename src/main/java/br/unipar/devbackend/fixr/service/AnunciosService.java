package br.unipar.devbackend.fixr.service;

import br.unipar.devbackend.fixr.Repository.AnunciosRepository;
import br.unipar.devbackend.fixr.model.Anuncios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnunciosService {

    private final AnunciosRepository repository;

    @Autowired
    public AnunciosService(AnunciosRepository repository){
        this.repository = repository;
    }

    public Anuncios salvar(Anuncios anuncios){
        return repository.save(anuncios);
    }

    public List<Anuncios> listar(){
        return repository.findAll();
    }

    public Anuncios atualizar(Long id, Anuncios anuncioAtualizado){
        return repository.findById(id).map(anuncios -> {
            anuncios.setCliente(anuncioAtualizado.getCliente());
            anuncios.setTitulo(anuncioAtualizado.getTitulo());
            anuncios.setDescricao(anuncioAtualizado.getDescricao());
            anuncios.setDataPublicacao(anuncioAtualizado.getDataPublicacao());
            anuncios.setStatusAnuncio(anuncioAtualizado.getStatusAnuncio());
            anuncios.setProfissao(anuncioAtualizado.getProfissao());
            return repository.save(anuncios);
        }).orElseThrow(() -> new RuntimeException("Anúncio não encontrado."));
    }

    public Anuncios buscarPorId(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Anúncio não encontrado"));
    }

}
