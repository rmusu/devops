package com.corso.java.FinanzaSB.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.corso.java.FinanzaSB.entities.CompositeKey;
import com.corso.java.FinanzaSB.entities.Quantita;

@Repository
public interface QuantitaRepo extends JpaRepository<Quantita, CompositeKey> {

	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "Update quantita set qta = qta + ?1 where id_portafoglio=?2 and denominazione = ?3")
	void updateQta(int qta, Long idPortafoglio, String denominazione);

}
