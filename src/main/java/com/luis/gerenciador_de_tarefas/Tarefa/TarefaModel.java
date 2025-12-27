package com.luis.gerenciador_de_tarefas.Tarefa;

import java.time.LocalDate;

import com.luis.gerenciador_de_tarefas.Usuario.UsuarioModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

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

    public TarefaModel(String titulo, String descricao, String status, LocalDate data_inicio, LocalDate data_final) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.data_inicio = data_inicio;
        this.data_final = data_final;
    }


    public Long getIdTarefa() {
        return idTarefa;
    }


    public void setIdTarefa(Long idTarefa) {
        this.idTarefa = idTarefa;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public LocalDate getData_inicio() {
        return data_inicio;
    }


    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }


    public LocalDate getData_final() {
        return data_final;
    }


    public void setData_final(LocalDate data_final) {
            this.data_final = data_final;
        }


    public UsuarioModel getUsuario() { 
        return usuario; 
    }

    public void setUsuario(UsuarioModel usuario) { 
        this.usuario = usuario; 
    }

    
    

}
