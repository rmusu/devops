package com.corso.java.FinanzaSB.services;

import java.util.List;


import com.corso.java.FinanzaSB.entities.Quantita;
public interface QuantitaService {
	
	
	public void aggiungi(Quantita q);
	
	public List<Quantita> getAll();

	public Quantita getById(Long idPortafoglio, String denominazione);
	
	public void vendita(int qta, Long idPortafoglio, String denominazione);

	public void rimozione(Long idPortafoglio, String denominazione);
		
	

}
