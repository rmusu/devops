package com.corso.java.FinanzaSB.services;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.corso.java.FinanzaSB.entities.Titolo;
import com.corso.java.FinanzaSB.repositories.TitoloRepo;

@Service
public class TitoloServiceImpl implements TitoloService {

	@Autowired
	private TitoloRepo tr;

	public void aggiungi(Titolo t) {

		tr.save(t);

	}

	public Titolo getById(String denominazione) {

		return tr.findById(denominazione).get();

	}

//	public Map<String, Integer> contaTipologia(Long idPortafoglio) {
//
//		Map<String, Integer> m = tr.contaTipologia(idPortafoglio).stream().collect(
//                
//             ));
//
//	}

}
