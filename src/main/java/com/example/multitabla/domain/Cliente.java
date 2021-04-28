package com.example.multitabla.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String nombre;

    public Cliente(String nombre){
        this.nombre=nombre;
    }
}
