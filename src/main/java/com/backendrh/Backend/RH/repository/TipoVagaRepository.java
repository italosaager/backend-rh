package com.backendrh.Backend.RH.repository;

import com.backendrh.Backend.RH.model.TipoVaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoVagaRepository extends JpaRepository<TipoVaga, Long> {
}
