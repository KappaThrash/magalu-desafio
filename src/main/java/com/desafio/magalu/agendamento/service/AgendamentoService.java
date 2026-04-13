package com.desafio.magalu.agendamento.service;

import com.desafio.magalu.agendamento.models.AgendamentoEntity;
import com.desafio.magalu.agendamento.models.agendamentoDTO;
import com.desafio.magalu.agendamento.repository.AgendamentoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@NoArgsConstructor
@Service
public class AgendamentoService {

    private AgendamentoRepository repository;

    public AgendamentoService(AgendamentoRepository repository){
        this.repository = repository;
    }

    public ResponseEntity<?> validateDTO(agendamentoDTO dto){

        AgendamentoEntity SavingEntity = new AgendamentoEntity();
        SavingEntity.setReceiver(dto.getReceiver());
        SavingEntity.setMessage(dto.getMessage());
        SavingEntity.setStatus(dto.getStatus());


        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
