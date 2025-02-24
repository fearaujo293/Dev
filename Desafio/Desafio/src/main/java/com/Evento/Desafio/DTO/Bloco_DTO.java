package com.Evento.Desafio.DTO;

import java.time.Instant;
import java.util.Set;

public class Bloco_DTO {
	private int id;
	private Instant inicio;
	private Instant fim;

	// Construtor com parâmetros
	public Bloco_DTO(int id, Instant inicio, Instant fim, Set<Bloco_DTO> horario) {
		this.id = id;
		this.inicio = inicio;
		this.fim = fim;
	}

	public Bloco_DTO() {
	}

	// Getters e Setters
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
