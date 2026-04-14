package com.desafio.magalu.agendamento.models;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class agendamentoDTO {
    @NonNull
    private OffsetDateTime date;
    @NotBlank
    private String receiver;
    @NotBlank
    private String message;
    @NonNull
    private statusEnum status;
}
