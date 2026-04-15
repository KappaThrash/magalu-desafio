package com.desafio.magalu.agendamento.service;

import com.desafio.magalu.agendamento.models.AgendamentoEntity;
import com.desafio.magalu.agendamento.models.agendamentoDTO;
import com.desafio.magalu.agendamento.repository.AgendamentoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;

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

    public ResponseEntity<?> getAgendamento(UUID id) {
        return repository.findById(id)
                .map(agendamentoEntity -> {
                    var dto = new agendamentoDTO(
                            agendamentoEntity.getDate(),
                            agendamentoEntity.getReceiver(),
                            agendamentoEntity.getMessage(),
                            agendamentoEntity.getStatus()
                    );
                    return ResponseEntity.status(HttpStatus.OK).body(dto);
                })
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }


    public ResponseEntity<?> deleteAgendamento (UUID id){
        repository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
