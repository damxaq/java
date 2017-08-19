package info.damxaq.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import info.damxaq.jpa.domain.Employee;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mojaKonf");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Employee employee1 = new Employee();
		employee1.setFirstName("Jan");
		employee1.setLastName("Nowak");
		employee1.setSalary(2222.2);
		
		Employee employee2 = new Employee();
		employee2.setFirstName("Robert");
		employee2.setLastName("Bednarek");
		employee2.setSalary(3333.3);
		
		Employee employee3 = new Employee();
		employee3.setFirstName("Damian");
		employee3.setLastName("Stach");
		employee3.setSalary(4444.4);
		
		
		entityManager.getTransaction().begin();

		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityManager.persist(employee3);

		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
