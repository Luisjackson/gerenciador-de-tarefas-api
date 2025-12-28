package com.luis.gerenciador_de_tarefas.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> { // No extends utilizo Classe/Tipo do ID

}
