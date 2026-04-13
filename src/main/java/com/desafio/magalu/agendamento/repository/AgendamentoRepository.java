package com.desafio.magalu.agendamento.repository;

import com.desafio.magalu.agendamento.models.AgendamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AgendamentoRepository extends JpaRepository<AgendamentoEntity, UUID> {
}
