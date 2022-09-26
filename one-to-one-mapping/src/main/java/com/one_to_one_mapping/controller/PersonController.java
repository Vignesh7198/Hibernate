package com.one_to_one_mapping.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.one_to_one_mapping.entity.Aadhar;
import com.one_to_one_mapping.entity.Person;

public class PersonController {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("Sundaram");
		person.setAddress("Chennai");
		
		Aadhar aadhar = new Aadhar();
		aadhar.setAadharNumber(634722601919l);
		aadhar.setFatherName("Natesan");
		
		person.setAadhar(aadhar);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("simha");
		EntityManager entityManager =       entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(aadhar);

		entityManager.persist(person);
		
		entityTransaction.commit();
		
	}

}
