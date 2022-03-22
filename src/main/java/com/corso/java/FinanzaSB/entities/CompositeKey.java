package com.corso.java.FinanzaSB.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Embeddable
//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CompositeKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_portafoglio", referencedColumnName = "id_portafoglio")
	private Portafoglio portafoglio;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "denominazione", referencedColumnName = "denominazione")
	private Titolo titolo;

	public CompositeKey(Portafoglio portafoglio, Titolo titolo) {

		this.portafoglio = portafoglio;
		this.titolo = titolo;
	}

	public CompositeKey() {

	}

	public Portafoglio getPortafoglio() {
		return portafoglio;
	}

	public void setPortafoglio(Portafoglio portafoglio) {
		this.portafoglio = portafoglio;
	}

	public Titolo getTitolo() {
		return titolo;
	}

	public void setTitolo(Titolo titolo) {
		this.titolo = titolo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
