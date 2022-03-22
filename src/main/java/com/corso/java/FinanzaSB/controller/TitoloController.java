package com.corso.java.FinanzaSB.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.corso.java.FinanzaSB.entities.Titolo;

import com.corso.java.FinanzaSB.services.TitoloService;

@RestController
public class TitoloController {

	@Autowired
	TitoloService ts;

	@PostMapping("/aggiungiTitolo")
	public void aggiungi(@Valid @RequestBody Titolo t) {

		ts.aggiungi(t);
	}

//	@GetMapping("/contaTipologia/{idPortafoglio}")
//	public Map<String, Integer> contaTipologia(@PathVariable Long idPortafoglio) {
//		return ts.contaTipologia(idPortafoglio);
//	}
	
	
	  @ExceptionHandler(MethodArgumentNotValidException.class)
	  @ResponseStatus(HttpStatus.BAD_REQUEST)
	  public ResponseEntity<String> handleNoSuchElementFoundException(
	      NoSuchElementFoundException exception
	  ) {
	    return ResponseEntity
	        .status(HttpStatus.NOT_FOUND)
	        .body(exception.getMessage());
	  }

}
