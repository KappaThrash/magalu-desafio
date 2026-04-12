package com.desafio.magalu.agendamento;

import com.desafio.magalu.agendamento.models.agendamentoDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {

    @PostMapping
    public ResponseEntity<?> postAgendamento(@RequestBody @Valid agendamentoDTO DTO){
        //AgendamentoService
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
