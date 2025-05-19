package dev.java10x.cadastro_ninja.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NinjaController {

    // Criar Ninja
    @GetMapping("/adicionarNinja")
    public String adicionarNinja() {
        return "Ninja adicionado com sucesso!";
    }

    // Mostrar todos os Ninjas
    @GetMapping("/mostrarNinjas")
    public String mostrarTodosNinjas() {
        return "Todos os Ninjas";
    }

    // Mostrar Ninja por ID
    @GetMapping("/mostrarNinjaPorID")
    public String mostrarNinjaPorID() {
        return "Ninja por ID";
    }

    // Atualizar Ninja
    @PutMapping("/atualizarNinjaPorID")
    public String atualizarNinjaPorID(){
        return "Ninja atualizado com sucesso!";
    }

    // Deletar Ninja
    @DeleteMapping("/deletarNinjaPorID")
    public String deletarNinjaPorID(){
        return "Ninja deletado com sucesso!";
    }
}