package com.wordpress.carledwinj.model;

public class Usuario {

	private String nome;
	private String login;
	private String perfil;

	public Usuario() {
	}

	public Usuario(String nome, String login, String perfil) {
		super();
		this.nome = nome;
		this.login = login;
		this.perfil = perfil;
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
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
}
