package com.luis.gerenciador_de_tarefas.service;

import java.time.LocalDate;
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

    public TarefaModel criarTarefa(TarefaModel tarefa){
        return tarefaRepository.save(tarefa);
    }

    public void deletarTarefaPorId(Long id){
        tarefaRepository.deleteById(id);
    }


    public TarefaModel alterarTarefaPorId(Long id, TarefaModel tarefaAtualizada){
        if(tarefaRepository.existsById(id)){
            tarefaAtualizada.setIdTarefa(id);
            return tarefaRepository.save(tarefaAtualizada);
        }
        return null;
    }


}           
