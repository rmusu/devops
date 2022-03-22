package com.corso.java.FinanzaSB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name="portafogli")
public class Portafoglio implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_portafoglio")
	private Long idPortafoglio;

	@Column(name = "nome_cliente")
	private String nomeCliente;
	
	@Column(name = "somma_investita")
	private double sommaInvestita;

	public Portafoglio(Long idPortafoglio, String nomeCliente, double sommaInvestita) {
		this.idPortafoglio = idPortafoglio;
		this.nomeCliente = nomeCliente;
		this.sommaInvestita = sommaInvestita;
	}
	
	public Portafoglio() {
		
		
	}

	public Long getIdPortafoglio() {
		return idPortafoglio;
	}

	public void setIdPortafoglio(Long idPortafoglio) {
		this.idPortafoglio = idPortafoglio;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSommaInvestita() {
		return sommaInvestita;
	}

	public void setSommaInvestita(double sommaInvestita) {
		this.sommaInvestita = sommaInvestita;
	}
	
	
	
	
	

}
