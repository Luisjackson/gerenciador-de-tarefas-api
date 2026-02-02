package com.luis.gerenciador_de_tarefas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.gerenciador_de_tarefas.model.TarefaModel;
import com.luis.gerenciador_de_tarefas.service.TarefaService;

@RestController
@RequestMapping // Define a rota base que os metodos desta classe vão seguir
public class TarefaController {

    // Injeção de dependencia do service p se comunicar com a camada de serviço 
    private TarefaService tarefaService;
    public TarefaController(TarefaService tarefaService){
        this.tarefaService = tarefaService;
    }

    //Adicionar 
    @PostMapping("/criar")
    public String criarTarefa(){
        return "Tarefa Criada";
    }
    
    // Mostrar
    @GetMapping("/todas")
    public List<TarefaModel> mostrarTodasTarefas(){
        return tarefaService.mostrarTodasTarefas();
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
