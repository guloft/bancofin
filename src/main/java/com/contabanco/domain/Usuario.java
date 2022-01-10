package com.contabanco.domain;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String cpf;
	private String nome;
	private String login;
	private String senha;
	private String perfil;
	
	public Usuario () {
		}

	public Usuario(Integer id, String cpf, String nome, String login, String senha, String perfil) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.perfil = perfil;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}



}
