package com.desafio.magalu.agendamento.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Agendamento")
public class AgendamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private OffsetDateTime date;
    private String receiver;
    private String message;

    @Enumerated(EnumType.STRING)
    private statusEnum status;

}
