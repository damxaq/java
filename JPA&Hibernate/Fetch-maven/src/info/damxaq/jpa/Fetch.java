package info.damxaq.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import info.damxaq.jpa.domain.Employee;
import info.damxaq.jpa.domain.Phones;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mojaKonf");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Employee employee = entityManager.find(Employee.class, 1L);
		List<Phones> phones = employee.getPhones();
		System.out.println(phones);
		entityManager.close();
		entityManagerFactory.close();
	}

}
