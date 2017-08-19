package info.damxaq.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import info.damxaq.jpa.domain.Employee;

public class Main {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;

	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory("mojaKonf");
		entityManager = entityManagerFactory.createEntityManager();
		
		addEmployees();
		
		// seleclt e from Employee e where e.salary>3000 and e.salary<5000

		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> employee = criteriaQuery.from(Employee.class);
		
		Path<Double> salary = employee.get("salary");
		criteriaQuery.select(employee).where(criteriaBuilder.and(criteriaBuilder.greaterThan(salary, 3000.0), criteriaBuilder.lessThan(salary, 5000.0)));
		
		TypedQuery<Employee> query = entityManager.createQuery(criteriaQuery);
		List<Employee> employees = query.getResultList();
		
		for (Employee emp: employees) {
			System.out.println(emp.getFirstName());
			System.out.println(emp.getLastName());
			System.out.println(emp.getSalary());
			
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
