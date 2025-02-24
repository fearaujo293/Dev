package com.Evento.Desafio.DTO;

import java.util.Set;

public class Categoria_DTO {
	private int id;
	private String descricao;

	public Categoria_DTO(int id, String descricao, Set<Categoria_DTO> categoria) {
		this.id = id;
		this.descricao = descricao;
	}

	// Construtor padrão
	public Categoria_DTO() {
	}

	// Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
