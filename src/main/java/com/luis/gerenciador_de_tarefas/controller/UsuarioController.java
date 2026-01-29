package com.luis.gerenciador_de_tarefas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controller
@RequestMapping // Define a rota base que os metodos desta classe vão seguir
public class UsuarioController {

        @GetMapping("/iniciar") // Mapeia a requisição http get para esse metodo
        public String iniciar(){
            return "Hello World";
        }

}
