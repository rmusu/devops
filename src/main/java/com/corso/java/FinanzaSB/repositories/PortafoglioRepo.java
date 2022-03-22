package com.corso.java.FinanzaSB.repositories;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.corso.java.FinanzaSB.entities.Portafoglio;

@Repository
public interface PortafoglioRepo extends JpaRepository<Portafoglio, Long> {

	

}
