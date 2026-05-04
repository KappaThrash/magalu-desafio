package com.desafio.magalu.agendamento.exceptions.ExceptionHandler;

public class AgendamentoNotFound extends RuntimeException {
    public AgendamentoNotFound(String message)   {
        super(message);
    }
}
