package com.ty.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raju");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Person person=new Person();
		person.setP_name("RAJU GUTTEDAR");
		person.setP_age(26);
		person.setPhone(9874563211l);
		
		PanCard card1=new PanCard();
		card1.setAddress("YADGIR");
		card1.setPanNo("CFRE2554J");
		
		person.setCard(card1);
		
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(card1);
		entityTransaction.commit();
	}
}
