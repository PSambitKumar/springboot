package com.csm.Assessment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.csm.Assessment.Model.Batch;
import com.csm.Assessment.Model.BatchAllocate;
import com.csm.Assessment.Model.Student;
import com.csm.Assessment.Service.BatchAllocateService;
import com.csm.Assessment.Service.BatchService;
import com.csm.Assessment.Service.StudentService;

@Controller
public class BatchAllocateController {

	@Autowired
	BatchAllocateService batchAllocateService;
	@Autowired
	StudentService studentService;
	@Autowired
	BatchService batchService;
	
	
	@RequestMapping(value = "AllocateBatch")
	public ModelAndView addBatch() {
		ModelAndView mav = null;
		try {
			mav = new ModelAndView("AllocateBatch");
			List<Student> list = studentService.get();
			List<Batch> list1 = batchService.get();
			mav.addObject("list", list);
			mav.addObject("list1", list1);
			mav.addObject("allocatebatch", new BatchAllocate());
		}catch(Exception e){
			e.printStackTrace();
		}
		return mav;
	}
	
	@PostMapping(value = "AllocateBatch")
	public ModelAndView save(@ModelAttribute("allocatebatch") BatchAllocate batchAllocate) {
		ModelAndView mav = null;
		try {
			mav = new ModelAndView("Home");
			batchAllocateService.save(batchAllocate);
			System.out.println("Batch Allocated Successfully!!");

		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Reg no with " + batchAllocate.getRegno() + " Can't Allocate Again with same Batch.");
		}
		return mav;
	}
	
	@RequestMapping(value = "ViewAllocateBatch")
	public ModelAndView viewBatch() {
		ModelAndView mav =  null;
		try {
			mav = new ModelAndView("ViewAllocateBatch");
			List<BatchAllocate> list = batchAllocateService.get();
			mav.addObject("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
	
}
