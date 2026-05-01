package com.desafio.magalu.agendamento.repository;

import com.desafio.magalu.agendamento.models.AgendamentoDTO;
import com.desafio.magalu.agendamento.models.AgendamentoEntity;
import com.desafio.magalu.agendamento.models.statusEnum;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class AgendamentoRepositoryTest {

    @Autowired
    AgendamentoRepository agendamentoRepository;

    @Autowired
    EntityManager entityManager;

    @Test
    @DisplayName("")
    void findByStatusSucess() {
        AgendamentoDTO data = new AgendamentoDTO(OffsetDateTime.now(),"danielkuhin@gmail.com", "teste123~~´´~~]]", statusEnum.CANCELED);
        this.createAgendamento(data);

        List<AgendamentoEntity> foundAgendamento = agendamentoRepository.findByStatus(data.getStatus());

        assertThat(foundAgendamento.isEmpty()).isFalse();
    }

    //@Test
    //void findByReceiver() {
    //}

//    @Test
//    void findByDateBefore() {
//    }

    private AgendamentoEntity createAgendamento(AgendamentoDTO data){
        AgendamentoEntity newEnt = new AgendamentoEntity(data);
        this.entityManager.persist(newEnt);

        return newEnt;
    }
}