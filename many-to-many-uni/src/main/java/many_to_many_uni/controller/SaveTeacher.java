package many_to_many_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_uni.entity.Subject;
import many_to_many_uni.entity.Teacher;

public class SaveTeacher {

	public static void main(String[] args) {
Subject subject1 = new Subject();

subject1.setName("maths");
subject1.setDuration(20);

Subject subject2 = new Subject();

subject2.setName("Physics");
subject2.setDuration(16);

Subject subject3 = new Subject();

subject3.setName("Computers");
subject3.setDuration(24);


List<Subject> subjects = new ArrayList();

subjects.add(subject1);
subjects.add(subject2);
subjects.add(subject3);

Teacher teacher = new Teacher();

teacher.setName("Maddy");
teacher.setAge(23);
teacher.setAddress("Chennai");
teacher.setSubjects(subjects);

EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("simha");

EntityManager entityManager = entityManagerFactory.createEntityManager();

EntityTransaction entityTransaction =  entityManager.getTransaction();

entityTransaction.begin();
entityManager.persist(subject3);
entityManager.persist(subject2);
entityManager.persist(subject1);
entityManager.persist(teacher);

entityTransaction.commit();

	}

}
