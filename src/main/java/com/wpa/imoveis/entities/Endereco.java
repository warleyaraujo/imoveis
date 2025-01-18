package com.wpa.imoveis.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Embeddable
@Getter
@Setter
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String logradouro;

    @Column
    private Integer numero;

    @Column
    private Integer cep;

    @Column
    private String referencia;
}
