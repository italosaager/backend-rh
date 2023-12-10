package com.backendrh.Backend.RH.service;

import com.backendrh.Backend.RH.repository.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VagaService {
    private final VagaRepository vagaRepository;

    @Autowired
    public VagaService(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }

    public List<Object[]> findAllVagasWithTipoVaga() {
        return vagaRepository.findVagasWithTipoVaga();
    }
}

