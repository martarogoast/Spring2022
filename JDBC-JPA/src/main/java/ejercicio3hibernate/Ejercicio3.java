package ejercicio3hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Ejercicio3 {

	private static EntityManagerFactory managerFactory = Persistence
			.createEntityManagerFactory("ejsHibernate");
	
	public static void main(String[] args) {
		EntityManager em = managerFactory.createEntityManager();
		
		Employee employee = new Employee();
		employee.setId(123422L);
		employee.setName("Hibernate2");
		
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		em.persist(employee);
		tran.commit();
		em.close();
	}

}
