package com.apitwoap.secondapi.repository;

import com.apitwoap.secondapi.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
