package com.desafio.magalu.agendamento.service;

import com.desafio.magalu.agendamento.models.AgendamentoEntity;
import com.desafio.magalu.agendamento.models.agendamentoDTO;
import com.desafio.magalu.agendamento.repository.AgendamentoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;


@NoArgsConstructor
@Service
public class AgendamentoService {

    private AgendamentoRepository repository;

    public AgendamentoService(AgendamentoRepository repository){
        this.repository = repository;
    }

    public ResponseEntity<?> saveAgendamento(agendamentoDTO dto){

        var SavingEntity = new AgendamentoEntity();
        SavingEntity.setReceiver(dto.getReceiver());
        SavingEntity.setDate(dto.getDate());
        SavingEntity.setMessage(dto.getMessage());
        SavingEntity.setStatus(dto.getStatus());

        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(SavingEntity));
    }

    public ResponseEntity<?> getAgendamento (UUID id){

        return ResponseEntity.status(HttpStatus.OK).body(repository.findById(id));
    }

    public ResponseEntity<?> deleteAgendamento (UUID id){

        repository.deleteById(id);

        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
