package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UserRepository;

@RestController
public class UsuarioController {
    @Autowired
    private UserRepository repository;
    @GetMapping("/users") //mapeamento de URI para o Spring diferenciar os mapeamentos
    public List<Usuario> getUsers(){
        return repository.listAll();
    }

    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.finByUsername(username);
    }

    //necessita de um client HTTPS por nao ser GET ou POST
    @DeleteMapping("/users/{idDelete}")
    public void deleteUsuario(@PathVariable("idDelete")Integer id){
         repository.remove(id);
    }
}

