package br.unipar.devbackend.fixr.Service;

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
            usuarioAtualizado.setNome(usuario.getNome());
            usuarioAtualizado.setEmail(usuario.getEmail());
            usuarioAtualizado.setUserType(usuario.getUserType());
            return repository.save(usuario);
        }).orElseThrow (() -> new RuntimeException("Erro"));
    }


}
