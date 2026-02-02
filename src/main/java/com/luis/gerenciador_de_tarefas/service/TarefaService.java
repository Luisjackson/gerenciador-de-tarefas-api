package com.luis.gerenciador_de_tarefas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.luis.gerenciador_de_tarefas.model.TarefaModel;
import com.luis.gerenciador_de_tarefas.repository.TarefaRepository;

@Service
public class TarefaService {

    private TarefaRepository tarefaRepository; // Injetar dependencia para Fazer comunicação do service com repository

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public List<TarefaModel> mostrarTodasTarefas(){
        return tarefaRepository.findAll();
    }

    public TarefaModel mostrarTarefaPorId(Long id){
        Optional<TarefaModel> tarefaPorId = tarefaRepository.findById(id);
        return tarefaPorId.orElse(null);
    }


}
