package com.luis.gerenciador_de_tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luis.gerenciador_de_tarefas.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> { // No extends utilizo Classe/Tipo do ID

}
