package com.corso.java.FinanzaSB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.corso.java.FinanzaSB.entities.Quantita;

import com.corso.java.FinanzaSB.services.QuantitaService;

@RestController
public class QuantitaController {

	@Autowired
	QuantitaService qs;

	@GetMapping("/cercaPerId/{idPortafoglio}/{denominazione}")
	public Quantita getById(@PathVariable Long idPortafoglio, @PathVariable String denominazione) {

		return qs.getById(idPortafoglio, denominazione);
	}

	@GetMapping("/vendi/{qta}/{idPortafoglio}/{denominazione}")
	public void vendita(@PathVariable int qta, @PathVariable Long idPortafoglio, @PathVariable String denominazione) {

		qs.vendita(qta, idPortafoglio, denominazione);
	}

	@GetMapping("/listaQ")
	public List<Quantita> getAll() {

		return qs.getAll();
	}

	@PostMapping("/acquisto")
	public void aggiungi(@RequestBody Quantita q) {

		qs.aggiungi(q);
	}

}
