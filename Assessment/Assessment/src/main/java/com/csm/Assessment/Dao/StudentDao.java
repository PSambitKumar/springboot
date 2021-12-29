package com.csm.Assessment.Dao;

import java.util.List;

import com.csm.Assessment.Model.Student;

public interface StudentDao {
	void save(Student student);
	List<Student> get();
	Student get(int regno);
	void delete(int regno);
}
