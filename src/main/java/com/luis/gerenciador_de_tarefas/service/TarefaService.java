package com.luis.gerenciador_de_tarefas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.luis.gerenciador_de_tarefas.dto.TarefaDTO;
import com.luis.gerenciador_de_tarefas.mapper.TarefaMapper;
import com.luis.gerenciador_de_tarefas.model.TarefaModel;
import com.luis.gerenciador_de_tarefas.repository.TarefaRepository;

@Service
public class TarefaService {

    private TarefaRepository tarefaRepository; // Injetar dependencia para Fazer comunicação do service com repository
    private TarefaMapper tarefaMapper; 


    public TarefaService(TarefaRepository tarefaRepository, TarefaMapper tarefaMapper) {
        this.tarefaRepository = tarefaRepository;
        this.tarefaMapper = tarefaMapper;
    }

    public List<TarefaModel> mostrarTodasTarefas(){
        return tarefaRepository.findAll();
    }

    public TarefaModel mostrarTarefaPorId(Long id){
        Optional<TarefaModel> tarefaPorId = tarefaRepository.findById(id);
        return tarefaPorId.orElse(null);
    }

    public TarefaDTO criarTarefa(TarefaDTO tarefaDTO){
        TarefaModel tarefa = tarefaMapper.map(tarefaDTO);
        tarefa =  tarefaRepository.save(tarefa);
        return tarefaMapper.map(tarefa);
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
