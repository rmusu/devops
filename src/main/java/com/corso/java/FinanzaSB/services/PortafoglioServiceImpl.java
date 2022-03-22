package com.corso.java.FinanzaSB.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corso.java.FinanzaSB.entities.Portafoglio;
import com.corso.java.FinanzaSB.repositories.PortafoglioRepo;

@Service
public class PortafoglioServiceImpl implements PortafoglioService{

	@Autowired
	private PortafoglioRepo pr;
	
	public void aggiungi(Portafoglio p) {
		pr.save(p);
		
	}
	
	public Portafoglio getById(Long idPortafoglio) {
		
		return pr.findById(idPortafoglio).get();
		
	}
	
	

}
