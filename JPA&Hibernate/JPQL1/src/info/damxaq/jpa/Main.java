package info.damxaq.jpa;

import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import info.damxaq.jpa.domain.Employee;

public class Main {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;

	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory("mojaKonf");
		entityManager = entityManagerFactory.createEntityManager();
		
		addEmployees();
		
		Query query = entityManager.createQuery("select concat(e.firstName, ' ', e.lastName), e.salary*0.2 from Employee e");
		Iterator<?> iterator = query.getResultList().iterator();
		while(iterator.hasNext()){
			Object[] item = (Object[]) iterator.next();
			String name = (String) item[0];
			double tax = (double) item[1];
			System.out.println(name+" musi zaplacic "+(int) tax + " zl");
		}
		
/*		TypedQuery<Employee> querry = entityManager.createQuery("select e from Employee e where e.salary > 3000 order by e.salary", Employee.class);
		List<Employee> employees = querry.getResultList();
		
		for (Employee employee : employees) {
			System.out.println(employee.getFirstName());
			System.out.println(employee.getLastName());
			System.out.println(employee.getSalary());
			System.out.println();
		}
		*/
		
/*		TypedQuery<Employee> querry = entityManager.createQuery("select e from Employee e where e.lastName='Pajak'", Employee.class);
		Employee employee = querry.getSingleResult();
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getSalary());*/
		
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
