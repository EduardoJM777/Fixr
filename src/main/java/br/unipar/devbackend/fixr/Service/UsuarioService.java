package br.unipar.devbackend.fixr.service;

import br.unipar.devbackend.fixr.Repository.UsuarioRepository;
import br.unipar.devbackend.fixr.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    @Autowired
    public UsuarioService(UsuarioRepository repository) {this.repository = repository;}

    public Usuario salvar(Usuario usuario){
        return repository.save(usuario);
    }

    public List<Usuario> listar(){
        return repository.findAll();
    }

    public Usuario buscarPorId(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Não encontrado"));
    }

    public Usuario atualizar(Long id, Usuario usuarioAtualizado){
        return repository.findById(id).map(usuario -> {
            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setEmail(usuarioAtualizado.getEmail());
            usuario.setUserType(usuarioAtualizado.getUserType());
            return repository.save(usuario);
        }).orElseThrow (() -> new RuntimeException("Erro"));
    }

    public void apagar(Long id){
       repository.deleteById(id);
    }

}
