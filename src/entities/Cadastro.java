package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cadastro {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String cpf;
	private String nome;
	private Date nascimento;
	private String cep;
	private String email;
	private String senha;
	
	public Cadastro() {
	}

	public Cadastro(String cpf, String senha) { 
		//login
		this.cpf = cpf;
		this.senha = senha;
	}
	
	public Cadastro(String cpf, String nome, Date nascimento, String cep, String email, String senha) {
		//cadastro
		this.cpf = cpf;
		this.nome = nome;
		this.nascimento = nascimento;
		this.cep = cep;
		this.email = email;
		this.senha = senha;
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

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getSenha() {
		return senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
