package com.martaCode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martaCode.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{

	Usuario findByNombre(String username);

	

}
