package info.damxaq.jpa;

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
		
		Query query = entityManager.createQuery(
				"select substring(e.firstName, 1, 3), trim(e.lastName), lower(e.firstName), upper(e.firstName), length(e.firstName) from Employee e where e.id=1L");
		Object[] result = (Object[])query.getSingleResult();
		System.out.println("Pierwsze trzy litery imienia: "+ result[0]);
		System.out.println("Nazwisko: "+ result[1]);
		System.out.println("male imie: "+ result[2]);
		System.out.println("duze imie: "+ result[3]);
		System.out.println("ilosc liter imienia: "+ result[4]);
/*		Query query = entityManager.createQuery(
				"select avg(e.salary), min(e.salary), max(e.salary), sum(e.salary), count(e) from Employee e");
		
		Object[] result = (Object[])query.getSingleResult();
		System.out.println("Srednia: "+ result[0]);
		System.out.println("Minimalna: "+ result[1]);
		System.out.println("Maxymalna: "+ result[2]);
		System.out.println("Suma: "+ result[3]);
		System.out.println("Ilosc: "+ result[4]);
		*/
		
		entityManager.close();
		entityManagerFactory.close();
	}

	
	private static void addEmployees(){
		addEmployee("Karol", "        Mateusiak         ", 1241);
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
