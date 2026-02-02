package com.luis.gerenciador_de_tarefas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.luis.gerenciador_de_tarefas.model.TarefaModel;
import com.luis.gerenciador_de_tarefas.repository.TarefaRepository;

@Service
public class TarefaService {

    private TarefaRepository tarefaRepository; // Injetar dependencia para Fazer comunicação do service com repository

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    // Listar todas as tarefas
    public List<TarefaModel> mostrarTodasTarefas(){
        return tarefaRepository.findAll();
    }

}
