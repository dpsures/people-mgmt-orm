package org.joker.orm.app;

import javax.persistence.EntityManager;

import org.joker.orm.pojo.Person;
import org.joker.orm.utils.EntityManagerUtils;

public class RunJpaApp {

	public static void main(String[] args) {
		runPersonCreate();
	}
	
	private static void runPersonCreate(){
		EntityManager emObj = EntityManagerUtils.getEntityManager();
		
		emObj.getTransaction().begin();
		System.out.println("Person object creation transaction start ... ");
		
		Person person = new Person();
		person.setFirstName("Suresh Kumar");
		person.setLastName("Devaraj");
		person.setAge(25);
		
		emObj.persist(person);
		
		emObj.getTransaction().commit();
		emObj.clear();
		System.out.println("Person object creation transaction done ... ");
	}

}
