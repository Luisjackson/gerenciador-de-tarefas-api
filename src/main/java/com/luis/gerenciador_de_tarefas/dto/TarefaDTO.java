package com.luis.gerenciador_de_tarefas.dto;

import java.time.LocalDate;

import com.luis.gerenciador_de_tarefas.model.UsuarioModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarefaDTO {

    private Long idTarefa;
    private String titulo;
    private String descricao;
    private String status;
    private LocalDate data_inicio;
    private LocalDate data_final;
    private UsuarioModel usuario; 

}
