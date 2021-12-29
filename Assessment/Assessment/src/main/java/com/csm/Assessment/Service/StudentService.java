package com.csm.Assessment.Service;

import java.util.List;

import com.csm.Assessment.Model.Student;

public interface StudentService {
	void save(Student student);
	List<Student> get();
	Student get(int regno);
	void delete(int regno);
}
