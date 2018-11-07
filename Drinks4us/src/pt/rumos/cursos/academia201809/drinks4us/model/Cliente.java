package pt.rumos.cursos.academia201809.drinks4us.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
	
	private String numeroCC;
	private String nome;
	private LocalDate dataNascimento;
	
	public Cliente(String numeroCC, String nome, LocalDate dataNascimento) {
		this.numeroCC = numeroCC;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNumeroCC() {
		return numeroCC;
	}
	public void setNumeroCC(String numeroCC) {
		this.numeroCC = numeroCC;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return numeroCC + "," + nome + "," + dataNascimento.format(DateTimeFormatter.ISO_DATE);
	}
		
}
