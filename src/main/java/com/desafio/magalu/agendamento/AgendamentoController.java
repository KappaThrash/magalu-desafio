package com.desafio.magalu.agendamento;

import com.desafio.magalu.agendamento.models.agendamentoDTO;
import com.desafio.magalu.agendamento.service.AgendamentoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {

    AgendamentoService service;

    public AgendamentoController( AgendamentoService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> postAgendamento(@RequestBody @Valid agendamentoDTO DTO){
        service.validateDTO(DTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<?> getAgendamento(@RequestParam(required = true) int id){
        //AgendamentoService
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAgendamento(@RequestParam(required = true) int id){
        //AgendamentoService
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
