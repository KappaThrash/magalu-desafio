package com.desafio.magalu.agendamento.service;

import com.desafio.magalu.agendamento.repository.AgendamentoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AgendamentoServiceTest {

    @Mock
    AgendamentoRepository agendamentoRepository;

    @Autowired
    @InjectMocks
    AgendamentoService agendamentoService;


    @Test
    void saveAgendamento() {
    }

    @Test
    void getAgendamento() {
    }

    @Test
    void getAgendamentoByReceiver() {
    }

    @Test
    void deleteAgendamento() {
    }

    @Test
    void patchAgendamento() {
    }
}