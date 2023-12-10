package com.backendrh.Backend.RH.controller;

import com.backendrh.Backend.RH.service.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VagaController {
    private final VagaService vagaService;

    @Autowired
    public VagaController(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    @GetMapping("/vagas")
    public List<Object[]> listarVagasComTipoVaga() {
        return vagaService.findAllVagasWithTipoVaga();
    }
}
