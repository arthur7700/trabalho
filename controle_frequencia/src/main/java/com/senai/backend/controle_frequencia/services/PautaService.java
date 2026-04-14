package com.senai.backend.controle_frequencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.controle_frequencia.models.pauta;
import com.senai.backend.controle_frequencia.repositories.PautaRepository;

@Service
public class PautaService {

    @Autowired
    private PautaRepository pautaRepository;

    public Long contarPautas() {

        return pautaRepository.count();

    }

    public pauta buscarPauta(Integer id) {

        return pautaRepository.findById(id).get();

    }

    public List<pauta> listarPautas() {

        return pautaRepository.findAll();

    }

    public Boolean deletarPauta(Integer id) {

        if (pautaRepository.existsById(id)) {

            pautaRepository.deleteById(id);
            return true;

        }

        return false;

    }

    public pauta cadastrarPauta(pauta Pauta){

    return pautaRepository.save(Pauta);

    }

public pauta atualizarPauta(Integer id, pauta pauta){

pauta pautarecuperada = buscarPauta(id);
if (pautarecuperada != null) {
    pautarecuperada.setId(id);
    if (pauta.getTurma() != null ) {
        pautarecuperada.setTurma(pauta.getTurma());
    }
    return pautaRepository.save(pautarecuperada);
}
return null;
}

}
