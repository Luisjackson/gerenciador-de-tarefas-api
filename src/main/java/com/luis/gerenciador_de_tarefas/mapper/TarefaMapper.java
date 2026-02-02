package com.luis.gerenciador_de_tarefas.mapper;

import org.springframework.stereotype.Component;

import com.luis.gerenciador_de_tarefas.dto.TarefaDTO;
import com.luis.gerenciador_de_tarefas.model.TarefaModel;

@Component
public class TarefaMapper {
    
    public TarefaModel map(TarefaDTO tarefaDTO){
        TarefaModel tarefaModel = new TarefaModel();
        tarefaModel.setIdTarefa(tarefaDTO.getIdTarefa());
        tarefaModel.setTitulo(tarefaDTO.getTitulo());
        tarefaModel.setDescricao(tarefaDTO.getDescricao());
        tarefaModel.setStatus(tarefaDTO.getStatus());
        tarefaModel.setData_inicio(tarefaDTO.getData_inicio());
        tarefaModel.setData_final(tarefaDTO.getData_final());
        tarefaModel.setUsuario(tarefaDTO.getUsuario());

        return tarefaModel;
    }

    public TarefaDTO map(TarefaModel tarefaModel) {
        TarefaDTO tarefaDTO = new TarefaDTO();
        
        tarefaDTO.setIdTarefa(tarefaModel.getIdTarefa());
        tarefaDTO.setTitulo(tarefaModel.getTitulo());
        tarefaDTO.setDescricao(tarefaModel.getDescricao());
        tarefaDTO.setStatus(tarefaModel.getStatus());
        tarefaDTO.setData_inicio(tarefaModel.getData_inicio());
        tarefaDTO.setData_final(tarefaModel.getData_final());
        tarefaDTO.setUsuario(tarefaModel.getUsuario());

        return tarefaDTO;
}
}
