package br.unipar.devbackend.fixr.Service;

import br.unipar.devbackend.fixr.Repository.UsuarioRepository;
import br.unipar.devbackend.fixr.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository repository) {this.usuarioRepository = repository;}

    public Usuario salvar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }

    public Usuario atualizar(Long id, Usuario usuarioAtualizado){
        return usuarioRepository.findById(id).map(Usuario usuario -> {
            usuario.setNome(usuarioAtualizado.getNome());

        })
    }


}
