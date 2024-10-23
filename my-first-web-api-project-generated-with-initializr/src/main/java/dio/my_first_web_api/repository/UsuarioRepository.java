package dio.my_first_web_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.my_first_web_api.model.Usuario;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if (usuario.getId() == null) {
            System.out.println("saving a new user");
        } else {
            System.out.println("updating an existent user");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println("Deleting an user");
        System.out.println(id);
    }

    public Usuario findById(Integer id) {
        System.out.println("Finding an user");
        return new Usuario("gleysson", "password");
    }

    public List<Usuario> findAll() {
        System.out.println("Listing users");

        List<Usuario>usuarios = new ArrayList<>();

        usuarios.add(new Usuario("gleysson", "password"));
        usuarios.add(new Usuario("frank", "masterpass"));

        return usuarios;
    }

    public Usuario findByUsername(Integer id) {
        System.out.println("Finding an user by his username");
        return new Usuario("gleysson", "password");
    }
}
