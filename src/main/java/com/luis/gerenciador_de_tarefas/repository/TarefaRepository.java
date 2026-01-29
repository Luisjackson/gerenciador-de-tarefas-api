package com.luis.gerenciador_de_tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luis.gerenciador_de_tarefas.model.TarefaModel;

public interface TarefaRepository extends JpaRepository<TarefaModel, Long> { 

}
