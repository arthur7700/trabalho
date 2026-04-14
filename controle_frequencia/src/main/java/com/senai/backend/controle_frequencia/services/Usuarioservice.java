package com.senai.backend.controle_frequencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.controle_frequencia.models.Usuario;
import com.senai.backend.controle_frequencia.repositories.Usuariorepository;

@Service
public class Usuarioservice {

    @Autowired
    private Usuariorepository Usuariorepository;

    public Long contarUsuario() {

        return Usuariorepository.count();

    }

    public Usuario buscarUsuario(Integer id) {

        return Usuariorepository.findById(id).get();

    }

    public List<Usuario> listarUsuario() {

        return Usuariorepository.findAll();

    }

    public Boolean deletarUsuario(Integer id) {

        if (Usuariorepository.existsById(id)) {

            Usuariorepository.deleteById(id);
            return true;

        }
        return false;
    }

    public Usuario cadastrarUsuariol(Usuario usuario) {

        return Usuariorepository.save(usuario);

    }

    public Usuario atualizarUsuario(Integer id, Usuario usuario) {

        Usuario usuarioRecuperado = buscarUsuario(id);

        if (usuarioRecuperado != null) {

            usuarioRecuperado.setId(id);

            if (usuario.getNome() != null) {
                usuarioRecuperado.setNome(usuario.getNome());
            }
            if (usuario.getDataNascimento() != null) {

                usuarioRecuperado.setDataNascimento(usuario.getDataNascimento());

            }
            return Usuariorepository.save(usuarioRecuperado);
        }
        return null; 
    }
}
