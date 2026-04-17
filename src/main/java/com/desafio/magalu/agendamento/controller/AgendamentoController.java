package com.desafio.magalu.agendamento.controller;

import com.desafio.magalu.agendamento.models.StatusDTO;
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

    @GetMapping("/{id}")
    public ResponseEntity<?> getAgendamento(@PathVariable UUID id){
        return service.getAgendamento(id);
    }

    @GetMapping("/")
    public ResponseEntity<?> getAgendamentoReceiver(@RequestParam String receiver){
        return service.getAgendamentoByReceiver(receiver);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAgendamento(@PathVariable UUID id){
        return service.deleteAgendamento(id);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> patchAgendamento(@PathVariable UUID id, @RequestBody @Valid StatusDTO dto){
        return service.patchAgendamento(id, dto);
    }

}
