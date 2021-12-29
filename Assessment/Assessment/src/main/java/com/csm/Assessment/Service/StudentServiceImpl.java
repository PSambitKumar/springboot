package com.csm.Assessment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csm.Assessment.Dao.StudentDao;
import com.csm.Assessment.Model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	
	@Transactional
	@Override
	public void save(Student student) {
		studentDao.save(student);
	}

	@Transactional
	@Override
	public List<Student> get() {
		return studentDao.get();
	}

	@Transactional
	@Override
	public Student get(int regno) {
		return studentDao.get(regno);
	}
	
	@Transactional
	@Override
	public void delete(int regno) {
		studentDao.delete(regno);
	}
	

}
