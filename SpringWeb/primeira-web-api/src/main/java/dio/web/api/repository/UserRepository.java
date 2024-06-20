package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.model.Usuario;

@Repository
public class UserRepository {

    List<Usuario> usuarios = new ArrayList<>();

     public void save(Usuario usuario){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        System.out.println("LIST - Listando os usários do sistema");
        usuarios.add(new Usuario(1, "usuario1","password"));
        usuarios.add(new Usuario(2, "usuario2","masterpass"));
        return usuarios;
    }
    public Usuario finByUsername(String username){
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equalsIgnoreCase(username)){
                usuarioEncontrado = usuario;
                break;
            } else {
                System.out.println("Usuario nao encontrado");
            }
        }
        return usuarioEncontrado;
    }
}
