 package com.Evento.Desafio.Entity;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_bloco")
public class Bloco_Domain {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Instant inicio;
    private Instant fim;
//
//    // Relacionamento Muitos para Um com Atividade




    public Bloco_Domain(int id, Instant inicio, Instant fim, Atividade_Domain atividade) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Bloco_Domain() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getInicio() {
        return inicio;
    }

    public void setInicio(Instant inicio) {
        this.inicio = inicio;
    }

    public Instant getFim() {
        return fim;
    }

    public void setFim(Instant fim) {
        this.fim = fim;
    }


}



