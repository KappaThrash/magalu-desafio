package com.desafio.magalu.agendamento.controller;

import com.desafio.magalu.agendamento.models.agendamentoDTO;
import com.desafio.magalu.agendamento.service.AgendamentoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {

    AgendamentoService service;

    public AgendamentoController( AgendamentoService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> postAgendamento(@RequestBody @Valid agendamentoDTO DTO){

        return service.saveAgendamento(DTO);
    }

    @GetMapping
    public ResponseEntity<?> getAgendamento(@RequestParam(required = true) UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAgendamento(id));
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAgendamento(@RequestParam(required = true) UUID id){
        //AgendamentoService
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
