package com.backendrh.Backend.RH.repository;

import com.backendrh.Backend.RH.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long> {
    @Query("SELECT v.nome, v.cidade, tv.nome FROM Vaga v INNER JOIN v.tipoVaga tv")
    List<Object[]> findVagasWithTipoVaga();
}
