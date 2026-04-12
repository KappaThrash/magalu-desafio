package com.desafio.magalu.agendamento.models;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class agendamentoDTO {
    private Date data;
    private String Reciever;
    private String Message;
    private statusEnum status;
}
