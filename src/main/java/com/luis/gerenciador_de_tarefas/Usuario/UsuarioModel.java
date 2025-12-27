package com.luis.gerenciador_de_tarefas.Usuario;

import java.util.List;

import com.luis.gerenciador_de_tarefas.Tarefa.TarefaModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Transforma a classe em uma entidade do DB
@Table(name = "Usuario")
@NoArgsConstructor // Criar construtor com lombok
@AllArgsConstructor
@Data // Get e Set Com lombok
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment do DB
    Long idUsuario;

    @Column(unique=true)
    private String email;
    private String senha;
    private String nome;
    private String telefone;

    @OneToMany(mappedBy="usuario") // Um usuario pode ter varias tarefas
    private List<TarefaModel> tarefas;

    
}
