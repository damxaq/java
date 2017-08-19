package info.damxaq.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import info.damxaq.jpa.domain.Employee;

public class Main {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;

	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory("mojaKonf");
		entityManager = entityManagerFactory.createEntityManager();
		
		addEmployees();

		TypedQuery<Employee> query = entityManager.createQuery(
				"select e from Pracownik e where e.salary> :minSalary", 
				Employee.class);
			query.setParameter("minSalary", 3000.0);

			List<Employee> employees = query.getResultList();

		for(Employee employee:employees){
			System.out.println(employee.getFirstName());
			System.out.println(employee.getLastName());
			System.out.println(employee.getSalary());
			System.out.println();
		}
		
		entityManager.close();
		entityManagerFactory.close();
	}

	
	private static void addEmployees(){
		addEmployee("Karol", "Mateusiak", 1241);
		addEmployee("Marika", "Bednarek", 3853);
		addEmployee("Jan", "Mateusiak", 1523);
		addEmployee("Daria", "Kowalska", 5634);
		addEmployee("Monika", "Ucinska", 5863);
		addEmployee("Ernest", "Pajak", 9869);
		addEmployee("Kamil", "Stepien", 2367);
		addEmployee("Przemek", "Maciejewski", 5473);
		addEmployee("Robert", "Wozniak", 4439);
		addEmployee("Agnieszka", "Nowak", 1000);
		addEmployee("Angelika", "Bednarska", 2000);
	}
	
	private static void addEmployee(String firstName, String lastName, double salary){
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setSalary(salary);
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);	
		entityManager.getTransaction().commit();
	}
}
