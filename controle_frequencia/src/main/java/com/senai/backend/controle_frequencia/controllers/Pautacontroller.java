package com.senai.backend.controle_frequencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.controle_frequencia.models.pauta;
import com.senai.backend.controle_frequencia.services.PautaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/pauta")
public class Pautacontroller {

    @Autowired
    private PautaService pautaService;

    @GetMapping("/contar-pauta")
    public Long contarPauta() {
        return pautaService.contarPautas();

    }

    @GetMapping("/buscar-pauta/{id}")
    public pauta buscarPauta(@PathVariable Integer id) {

        return pautaService.buscarPauta(id);

    }

    public List<pauta> listarPauta() {

        return pautaService.listarPautas();

    }

    @DeleteMapping("/deletar-Pauta/{id}")
    public String deletarPauta(@PathVariable Integer id) {

        if (pautaService.deletarPauta(id)) {
            return "Pauta deletada com sucesso";
        }
        return "falha ao deletar Pauta";
    }

    @PostMapping("salvar-pauta")
    public pauta cadastarPauta(@RequestBody pauta Pauta){

        return pautaService.cadastrarPauta(Pauta);

    }
@PutMapping("/atualizar-Pauta/{id}")
public String atualizarPauta(@PathVariable Integer id, @RequestBody pauta Pauta){

if (pautaService.atualizarPauta(id, Pauta) != null) {
    return "Pauta atualizada com sucesso";
}
return "Falha ao atualizar pauta";
}
}
