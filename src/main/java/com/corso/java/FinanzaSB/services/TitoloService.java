package com.corso.java.FinanzaSB.services;

import java.util.Map;

import com.corso.java.FinanzaSB.entities.Titolo;

public interface TitoloService {

	public void aggiungi(Titolo t);

	public Titolo getById(String denominazione);

//	public Map<String, Integer> contaTipologia(Long idPortafoglio);

}
