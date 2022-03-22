package com.corso.java.FinanzaSB.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.corso.java.FinanzaSB.entities.Portafoglio;
import com.corso.java.FinanzaSB.services.PortafoglioService;

@RestController
public class PortafoglioController {

	@Autowired
	PortafoglioService ps;

	@PostMapping("/aggiungiPortafoglio")
	public void aggiungi(@RequestBody Portafoglio p) {

		ps.aggiungi(p);
	}


}
