package info.damxaq.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import info.damxaq.jpa.domain.Address;
import info.damxaq.jpa.domain.Employee;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mojaKonf");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Employee employee = new Employee();
		Address address = new Address();
		
		employee.setFirstName("Damian");
		employee.setLastName("Nowak");
		employee.setSalary(1111.1);
		
		employee.setAddress(address);
		
		address.setLocality("Warszawa");
		address.setZipCode("01-011");
		address.setStreet("Zygmunta");
		address.setStreetNumber(62);
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
