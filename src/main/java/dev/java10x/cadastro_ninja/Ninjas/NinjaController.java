package dev.java10x.cadastro_ninja.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NinjaController {


    @GetMapping
    public String itadakimasu() {
        return "Itadakimasu!";
    }
}
