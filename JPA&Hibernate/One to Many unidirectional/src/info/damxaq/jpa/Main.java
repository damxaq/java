package info.damxaq.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import info.damxaq.jpa.domain.Employee;
import info.damxaq.jpa.domain.Phones;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mojaKonf");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Employee employee = new Employee();
		Phones phone1 = new Phones();
		Phones phone2 = new Phones();
		
		employee.setFirstName("Jan");
		employee.setLastName("Nowak");
		employee.setSalary(1234.5);
		
		phone1.setType("mobile");
		phone1.setNumber("123456789");
		phone2.setType("Home");
		phone2.setNumber("987456752");
		
		List<Phones> phones = new ArrayList<>();
		
		phones.add(phone2);
		phones.add(phone1);
		
		employee.setPhones(phones);

		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.persist(phone2);
		entityManager.persist(phone1);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
