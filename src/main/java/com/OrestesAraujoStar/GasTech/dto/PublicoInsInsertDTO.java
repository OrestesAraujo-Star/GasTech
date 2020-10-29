package com.OrestesAraujoStar.GasTech.dto;

import java.io.Serializable;

import com.OrestesAraujoStar.GasTech.entities.Publico;

public class PublicoInsInsertDTO implements Serializable {
	private static final long serialVersionUID = 1L;
		
	private Long id;
	private String nome;
	private String email;
	private String cpf;
	private String cnpj;
	private String sugestao;
	private String respondido;
	
	public PublicoInsInsertDTO() {		
	}
	
	public PublicoInsInsertDTO(Publico entity) {
		
		id = entity.getId();
		nome = entity.getNome();
		email = entity.getEmail();
		cpf = entity.getCpf();
		cnpj = entity.getCnpj();
		sugestao = entity.getSugestao();
		respondido = entity.getRespondido();				
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSugestao() {
		return sugestao;
	}

	public void setSugestao(String sugestao) {
		this.sugestao = sugestao;
	}

	public String getRespondido() {
		return respondido;
	}

	public void setRespondido(String respondido) {
		this.respondido = respondido;
	}
	
	

}
