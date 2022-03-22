package com.corso.java.FinanzaSB.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.corso.java.FinanzaSB.entities.Titolo;

@Repository
public interface TitoloRepo extends JpaRepository<Titolo, String> {

	@Query(nativeQuery = true, value = "SELECT t.tipologia, count(t.tipologia) as conta FROM quantita as q join titoli as t on  t.denominazione = q.denominazione where q.id_portafoglio = ?1 group by t.tipologia")
	List<Object[]>contaTipologia(Long idPortafoglio);

}
