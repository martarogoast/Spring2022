package com.martaCode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martaCode.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
