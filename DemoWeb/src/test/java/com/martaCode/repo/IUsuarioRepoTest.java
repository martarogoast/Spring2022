package com.martaCode.repo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.martaCode.model.Usuario;

@SpringBootTest
class IUsuarioRepoTest {
	@Autowired
	private IUsuarioRepo usuRepo;

	@Test
	void testAgregar() {
		Usuario usu = new Usuario(0,"Marta", "martita");
		Usuario usuRetorno = usuRepo.save(usu);
		assertEquals("martita", usuRetorno.getClave());
	}

}
