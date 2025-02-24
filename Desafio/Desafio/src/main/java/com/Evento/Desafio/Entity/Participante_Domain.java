package com.Evento.Desafio.Entity;
import java.util.Set;

import  com.Evento.Desafio.Entity.Atividade_Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table (name = "tb_participante")

	public class Participante_Domain{

		@Id @GeneratedValue( strategy = GenerationType.IDENTITY)
		private Integer id;
	    private String nome;
	    private String email;
	    private Set<Atividade_Domain> atividades;
	    
	    
	    
	    
	    
	    public Participante_Domain(Integer id, String nome, String email) {
	    	this.id = id;
	    	this.nome = nome;
	    	this.email = email;
	    }
	    
	    public Participante_Domain() {
	    	
	    }
		
		public Integer getId() {
			return id;
		}
		
		public void setId(Integer id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	    
	    
	    

	   
	}


