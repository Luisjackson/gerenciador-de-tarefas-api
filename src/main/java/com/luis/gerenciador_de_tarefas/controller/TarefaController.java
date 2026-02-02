package com.luis.gerenciador_de_tarefas.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping // Define a rota base que os metodos desta classe vão seguir
public class TarefaController {

    //Adicionar 
    @PostMapping("/criar")
    public String criarTarefa(){
        return "Tarefa Criada";
    }
    
    // Mostrar
    @GetMapping("/todas")
    public String mostrarTodasTarefas(){
        return "Mostrar Tarefa";
    }

    // Mostrar tarefa por ID
    @GetMapping("/todasID")
    public String mostrarTodasTarefasPorId(){
        return "Mostrar tarefa por ID";
    }

    //Deletar
    @DeleteMapping("/deletarID")
    public String deletarTarefaPorId(){
        return "Deletar tarefa por id";
    }

    //Alterar
    @PutMapping("/alterarID")
    public String alterarTarefaPorId(){
        return "Alterar Tarefa por ID";
    }

}
