package com.corso.java.FinanzaSB.services;


import com.corso.java.FinanzaSB.entities.Portafoglio;


public interface PortafoglioService {
	
	public void aggiungi(Portafoglio p);
	
	public Portafoglio getById(Long idPortafoglio);
	
	

}
