package com.desafio.magalu.agendamento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.validator.constraints.UUID;

@Entity
public class agendamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
}
