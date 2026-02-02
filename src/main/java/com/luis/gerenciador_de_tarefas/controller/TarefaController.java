package com.luis.gerenciador_de_tarefas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.gerenciador_de_tarefas.model.TarefaModel;
import com.luis.gerenciador_de_tarefas.repository.TarefaRepository;
import com.luis.gerenciador_de_tarefas.service.TarefaService;

@RestController
@RequestMapping // Define a rota base que os metodos desta classe vão seguir
public class TarefaController {

    private final TarefaRepository tarefaRepository;

    // Injeção de dependencia do service p se comunicar com a camada de serviço 
    private TarefaService tarefaService;
    
    public TarefaController(TarefaService tarefaService, TarefaRepository tarefaRepository){
        this.tarefaService = tarefaService;
        this.tarefaRepository = tarefaRepository;
    }

    //Adicionar 
    @PostMapping("/criarTarefa")
    public TarefaModel criarTarefa(@RequestBody TarefaModel tarefa){
        return tarefaService.criarTarefa(tarefa);
    }
    
    // Mostrar
    @GetMapping("/listarTarefas")
    public List<TarefaModel> mostrarTodasTarefas(){
        return tarefaService.mostrarTodasTarefas();
    }

    // Mostrar tarefa por ID
    @GetMapping("/listarTarefaPorID/{id}")
    public TarefaModel mostrarTarefaPorId(@PathVariable Long id){ // PathVariable para dizer que o argumento é uma variavel do caminho
        return tarefaService.mostrarTarefaPorId(id);
    }

    //Deletar
    @DeleteMapping("/deletarID/{id}")
    public void deletarTarefaPorId(@PathVariable Long id){
        tarefaService.deletarTarefaPorId(id);
    }

    //Alterar
    @PutMapping("/alterarID")
    public String alterarTarefaPorId(){
        return "Alterar Tarefa por ID";
    }

}
