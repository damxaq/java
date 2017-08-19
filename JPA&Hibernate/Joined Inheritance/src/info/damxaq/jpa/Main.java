package info.damxaq.jpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import info.damxaq.jpa.domain.Professor;
import info.damxaq.jpa.domain.Student;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mojaKonf");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Professor professor = new Professor();
		professor.setFirstName("Jan");
		professor.setLastName("Nowak");
		professor.setSalary(7684.0);
		
		Student student = new Student();
		student.setFirstName("Marek");
		student.setLastName("Kowalski");
		student.setAverageGrade(4.25);
		
		entityManager.getTransaction().begin();
		entityManager.persist(professor);
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
