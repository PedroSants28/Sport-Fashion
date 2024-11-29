package com.exemplo.camisastime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CamisaController {
    private List<Camisa> camisas = new ArrayList<>();

    // Exemplo de camisa já cadastrada
    public CamisaController() {
        camisas.add(new Camisa(1L, "Camisa 1", "Time A", 99.90));
        camisas.add(new Camisa(2L, "Camisa 2", "Time B", 119.90));
    }

    // Endpoint para listar todas as camisas
    @GetMapping("/camisas")
    public List<Camisa> getCamisas() {
        return camisas;
    }

    // Endpoint para adicionar uma nova camisa
    @PostMapping("/camisas")
    public String adicionarCamisa(@RequestBody Camisa camisa) {
        camisas.add(camisa);
        return "Camisa adicionada com sucesso!";
    }
}
