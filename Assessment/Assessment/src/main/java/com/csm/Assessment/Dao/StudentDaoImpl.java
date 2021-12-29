package com.csm.Assessment.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.csm.Assessment.Model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	
	@Autowired
	private EntityManager entityManager;

	@Override
	public void save(Student student) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(student);
	}

	@Override
	public List<Student> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Student> query = currentSession.createQuery("from Student", Student.class);
		List<Student> list = query.getResultList();
		return list;
	}

	@Override
	public Student get(int regno) {
		Session currentSession = entityManager.unwrap(Session.class);
		Student student = currentSession.get(Student.class, regno);
		return student;
	}

	@Override
	public void delete(int regno) {
		Session currentSession = entityManager.unwrap(Session.class);
	Student student = currentSession.get(Student.class, regno);
		currentSession.delete(student);
	}

}
