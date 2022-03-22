package com.corso.java.FinanzaSB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "titoli")
public class Titolo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "denominazione")
	private String denominazione;

	@Column(name = "tipologia")
	@NotBlank(message="name is mandatory")
	private String tipologia;
	
	@Column(name = "valore_mercato")
	private double valoreMercato;

	public Titolo(String denominazione, String tipologia, double valoreMercato) {

		this.denominazione = denominazione;
		this.tipologia = tipologia;
		this.valoreMercato = valoreMercato;
	}

	public Titolo() {
		
	}

	public String getDenominazione() {
		return denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public double getValoreMercato() {
		return valoreMercato;
	}

	public void setValoreMercato(double valoreMercato) {
		this.valoreMercato = valoreMercato;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
