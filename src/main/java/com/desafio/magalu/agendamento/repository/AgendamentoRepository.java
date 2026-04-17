package com.desafio.magalu.agendamento.repository;

import com.desafio.magalu.agendamento.models.AgendamentoEntity;
import com.desafio.magalu.agendamento.models.statusEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.List;

import java.util.UUID;

@Repository
public interface AgendamentoRepository extends JpaRepository<AgendamentoEntity, UUID> {
    List<AgendamentoEntity> findByStatus(statusEnum status);
    List<AgendamentoEntity> findByReceiver(String receiver);

    List<AgendamentoEntity> findByDateBefore(OffsetDateTime dateBefore);
}
