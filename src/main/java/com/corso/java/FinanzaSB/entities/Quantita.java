package com.corso.java.FinanzaSB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "quantita")
public class Quantita implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CompositeKey ck;

	@Column(name = "qta")
	private int qta;

	public Quantita(CompositeKey ck, int qta) {
		this.ck = ck;
		this.qta = qta;
	}

	public Quantita() {

	}

	public CompositeKey getCk() {
		return ck;
	}

	public void setCk(CompositeKey ck) {
		this.ck = ck;
	}

	public int getQta() {
		return qta;
	}

	public void setQta(int qta) {
		this.qta = qta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
