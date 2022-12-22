package ejercicio4hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Ejercicio4 {

	private static EntityManagerFactory managerFactory = Persistence
			.createEntityManagerFactory("ejsHibernate");
	
	public static void main(String[] args) {
		EntityManager em = managerFactory.createEntityManager();
		
		Address address = new Address();
		address.setId(1L);
		address.setCalle("Uría");
		address.setNumero(5);
		address.setCodigoPostal("33201");
		address.setCiudad("Gijón");
		
		Usuario usuario = new Usuario();
		usuario.setId(1L);
		usuario.setFirstname("Usuario 1");
		
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		em.persist(usuario);
		tran.commit();
		em.close();
	}
}
