package dev.java10x.cadastro_ninja.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;



    // Criar Ninja
    @GetMapping("/adicionarNinja")
    public String adicionarNinja() {
        return "Ninja adicionado com sucesso!";
    }

    // Mostrar todos os Ninjas
    @GetMapping("/listarTodosNinjas")
    public List<NinjaModel> listarTodosNinjas() {
        return ninjaService.listarTodosNinjas();
    }

    // Mostrar Ninja2 por ID
    @GetMapping("/listarNinjaPorID")
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