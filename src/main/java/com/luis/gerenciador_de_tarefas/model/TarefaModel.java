package com.luis.gerenciador_de_tarefas.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Tarefa")
public class TarefaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTarefa;

    private String titulo;
    private String descricao;
    private String status;
    private LocalDate data_inicio;
    private LocalDate data_final;

    @ManyToOne // Muitas tarefas podem pertencer a um único usuário
    @JoinColumn(name = "Usuario_idUsuario") // FK
    private UsuarioModel usuario; 

}
