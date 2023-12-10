package com.backendrh.Backend.RH.controller;

import com.backendrh.Backend.RH.service.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class VagaController {
    private final VagaService vagaService;

    @Autowired
    public VagaController(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    @GetMapping("/vagas")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Map<String, String>> listarVagasComTipoVaga() {
        List<Object[]> resultados = vagaService.findAllVagasWithTipoVaga();
        List<Map<String, String>> vagasFormatadas = new ArrayList<>();

        for (Object[] resultado : resultados) {
            Map<String, String> vaga = new HashMap<>();
            vaga.put("nome", (String) resultado[0]);
            vaga.put("cidade", (String) resultado[1]);
            vaga.put("tipo", (String) resultado[2]);
            vagasFormatadas.add(vaga);
        }

        return vagasFormatadas;
    }
}
