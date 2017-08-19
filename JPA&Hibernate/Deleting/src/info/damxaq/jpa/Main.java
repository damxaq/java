package info.damxaq.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import info.damxaq.jpa.domain.Employee;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mojaKonf");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Employee employee = new Employee();
		
		employee.setFirstName("Andrzej");
		employee.setLastName("Nowak");
		employee.setSalary(3000.1);
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);	
		entityManager.getTransaction().commit();
		

		entityManager.getTransaction().begin();
		entityManager.remove(employee);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
