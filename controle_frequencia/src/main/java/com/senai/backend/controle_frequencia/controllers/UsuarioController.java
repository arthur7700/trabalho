package com.senai.backend.controle_frequencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.controle_frequencia.models.Usuario;
import com.senai.backend.controle_frequencia.services.Usuarioservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/Usuario")
public class UsuarioController {

    @Autowired
    private Usuarioservice usuarioservice;

    @GetMapping("/contar-usuarios")
    public Long contarUsuario() {
        return usuarioservice.contarUsuario();

    }

    @GetMapping("/buscar-usuario/{id}")
    public Usuario buscarUsuario(@PathVariable Integer id) {

        return usuarioservice.buscarUsuario(id);

    }

    public List<Usuario> listarUsuario() {

        return usuarioservice.listarUsuario();

    }

    @DeleteMapping("/deletar-usuario/{id}")
    public String deletarUsuario(@PathVariable Integer id) {

        if (usuarioservice.deletarUsuario(id)) {
            return "Usuario deletado com sucesso";
        }
        return "falha ao deletar Usuario";
    }

    @PostMapping("/salvar-usuario")
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario) {

        return usuarioservice.cadastrarUsuario(usuario);

    }
    @PutMapping("/atualizar-usuario/{id}")
    public String atualizarUsuario(@PathVariable Integer id, @RequestBody Usuario usuario){

        if (usuarioservice.atualizarUsuario(id, usuario) != null) {
            return "Usuarios atualizados com sucesso";
        }
        return "Falha ao atualizar Usuarios";
    }
}
