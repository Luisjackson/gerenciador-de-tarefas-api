package com.luis.gerenciador_de_tarefas.Usuario;

import java.util.List;

import com.luis.gerenciador_de_tarefas.Tarefa.TarefaModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity // Transforma a classe em uma entidade do DB
@Table(name = "Usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment do DB

    Long idUsuario;

    private String email;
    private String senha;
    private String nome;
    private String telefone;


    @OneToMany(mappedBy="usuario") // Um usuario pode ter varias tarefas
    private List<TarefaModel> tarefas;

    
    public UsuarioModel(String email, String senha, String nome, String telefone) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
    }

    public UsuarioModel() {
    }



    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   
    
}
