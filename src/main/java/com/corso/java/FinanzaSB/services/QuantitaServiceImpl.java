package com.corso.java.FinanzaSB.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corso.java.FinanzaSB.entities.CompositeKey;
import com.corso.java.FinanzaSB.entities.Portafoglio;
import com.corso.java.FinanzaSB.entities.Quantita;
import com.corso.java.FinanzaSB.entities.Titolo;
import com.corso.java.FinanzaSB.repositories.PortafoglioRepo;
import com.corso.java.FinanzaSB.repositories.QuantitaRepo;
import com.corso.java.FinanzaSB.repositories.TitoloRepo;

@Service
public class QuantitaServiceImpl implements QuantitaService {

	@Autowired
	private QuantitaRepo qr;

	@Autowired
	private PortafoglioRepo pr;

	@Autowired
	private TitoloRepo tr;

	public List<Quantita> getAll() {

		return qr.findAll();
	}

	public void updateQta(int qta, Long idPortafoglio, String denominazione) {

		qr.updateQta(qta, idPortafoglio, denominazione);

	}

	public void aggiungi(Quantita q) {

		Long idPortafoglio = q.getCk().getPortafoglio().getIdPortafoglio();
		String denominazione = q.getCk().getTitolo().getDenominazione();
		int qta = q.getQta();

		if (getById(idPortafoglio, denominazione) != null) {

			qr.updateQta(qta, idPortafoglio, denominazione);

		} else {

			qr.save(q);
		}

	}

	public Quantita getById(Long idPortafoglio, String denominazione) {

		Portafoglio p = pr.getById(idPortafoglio);

		Titolo t = tr.getById(denominazione);

		CompositeKey ck = new CompositeKey(p, t);

		try {

			return qr.findById(ck).get();

		} catch (NoSuchElementException e) {

			return null;

		}

	}

	public void vendita(int qta, Long idPortafoglio, String denominazione) {

		if (getById(idPortafoglio, denominazione) != null) {

			if (getById(idPortafoglio, denominazione).getQta() > qta) {

				qta *= -1;
				qr.updateQta(qta, idPortafoglio, denominazione);

			} else if (getById(idPortafoglio, denominazione).getQta() == qta) {

				rimozione(idPortafoglio, denominazione);
			} else {
				throw new IllegalArgumentException("Quantità posseduta minore di quantità inserita");
			}

		} else {

			throw new IllegalArgumentException("Titolo non presente in portafoglio");
		}

	}

	public void rimozione(Long idPortafoglio, String denominazione) {

		qr.delete(getById(idPortafoglio, denominazione));

	}

}
