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
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel) {
        return ninjaService.criarNinja(ninjaModel);
    }

    // Mostrar todos os Ninjas
    @GetMapping("/listar")
    public List<NinjaModel> listarTodosNinjas() {
        return ninjaService.listarTodosNinjas();
    }

    // Mostrar Ninja2 por ID
    // localhost:8080/ninja/listarNinjaPorID/1...
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaPorID(@PathVariable Long id) {
        return ninjaService.listarNinjaPorID(id);
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