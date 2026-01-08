package br.unipar.devbackend.fixr.Controller;

import br.unipar.devbackend.fixr.Service.UsuarioService;
import br.unipar.devbackend.fixr.model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService service){
        this.usuarioService = service;
    }

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario){return usuarioService.salvar(usuario);}

    @PutMapping("/id")
    public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario usuario)
    { return usuarioService.atualizar(id, usuario);}

    @GetMapping
    public List<Usuario> listar(){return usuarioService.listar();}

    @GetMapping("/id")
    public Usuario buscarPorId(long id){return usuarioService.buscarPorId(id);}

}
