package com.csm.Assessment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.csm.Assessment.Model.Student;
import com.csm.Assessment.Service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = { "/", "/home","Home"})
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView("Home");
		return mav;
	}
	
	@RequestMapping(value = "AddStudent")
	public ModelAndView addStudent() {
		ModelAndView mav = null;
		try {
			mav = new ModelAndView("AddStudent");
			mav.addObject("addstudent", new Student());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
		
	@PostMapping(value = "AddStudent")
	public ModelAndView save(@ModelAttribute("addstudent") Student student) {
		ModelAndView mav = null;
		try {
			mav = new ModelAndView("Home");
			mav.addObject("addstudent", new Student());
			//System.out.println(student.toString());
			studentService.save(student);
			System.out.println("Student Added/Updated Successfully!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
	
	@RequestMapping(value = "ViewStudent")
	public ModelAndView viewStudent() {
		ModelAndView mav = null;
		try {
			mav = new ModelAndView("ViewStudent");
			List<Student> list = studentService.get();
			mav.addObject("list", list);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
	
	@RequestMapping(value = "edit1/{regno}")
	public ModelAndView get(@PathVariable("regno") int regno) {
		ModelAndView mav = null;
		try {
			mav = new ModelAndView("AddStudent2");
			Student student = studentService.get(regno);
			if(student == null) {
				throw new RuntimeException("Student not found"+regno);
			}
			mav.addObject("addstudent2", student);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
	
	@PostMapping(value = "AddStudent2")
	public ModelAndView update(@ModelAttribute("addstudent2") Student student) {
		ModelAndView mav = null;
		try {
			mav = new ModelAndView("Home");
			mav.addObject("addstudent2", new Student());
			System.out.println(student.toString());
			studentService.save(student);
			System.out.println("Student Updated Successfully!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
	
	@RequestMapping(value = "delete1/{regno}")
	public ModelAndView delete(@PathVariable("regno") int regno) {
		ModelAndView mav = null;
		try {
			mav = new ModelAndView("ViewStudent");
			studentService.delete(regno);
			List<Student> list = studentService.get();
			mav.addObject("list", list);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
}
