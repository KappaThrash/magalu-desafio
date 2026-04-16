package com.desafio.magalu.agendamento.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatusDTO {
    @NonNull
    private statusEnum status;
}
