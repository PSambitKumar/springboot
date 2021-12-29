package com.csm.Assessment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.csm.Assessment.Model.Batch;
import com.csm.Assessment.Service.BatchService;

@Controller
public class BatchController {
	
	@Autowired
	BatchService batchService;

	@RequestMapping(value = "AddBatch")
	public ModelAndView addBatch() {
		ModelAndView mav = new ModelAndView("AddBatch");
		mav.addObject("addbatch", new Batch());
		return mav;
	}
	
	@PostMapping("/AddBatch")
	public ModelAndView save(@ModelAttribute("addbatch") Batch batch) {
		ModelAndView mav = new ModelAndView("Home");
		System.out.println(batch.toString());
		batchService.save(batch);
		List<Batch> list = batchService.get();
		mav.addObject("list", list);
		return mav;
	}
	
	
	@RequestMapping(value = "ViewBatch")
	public ModelAndView viewBatch() {
		ModelAndView mav = new ModelAndView("ViewBatch");
		List<Batch> list = batchService.get();
		mav.addObject("list", list);
		return mav;
	}
	
	@RequestMapping("/edit2/{batchid}")
	public ModelAndView get(@PathVariable int batchid) {
		ModelAndView mav = new ModelAndView("AddBatch2");
		Batch batch = batchService.get(batchid);
		if(batch == null) {
			throw new RuntimeException("Batch not found"+batchid);
		}
		mav.addObject("addbatch2", batch);		
		return mav;
	}
	
	@RequestMapping("/AddBatch2")
	public ModelAndView update(@ModelAttribute("addbatch2") Batch batch) {
		ModelAndView mav = new ModelAndView("ViewBatch");
		//System.out.println(batch.toString());
		batchService.save(batch);
		List<Batch> list = batchService.get();
		mav.addObject("list", list);
		return mav;
	}
	
	
	@RequestMapping(value = "delete/{batchid}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("batchid") int batchid) {
		ModelAndView mav = new ModelAndView("ViewBatch");
		batchService.delete(batchid);
		List<Batch> list = batchService.get();
		mav.addObject("list", list);
		return mav;
	}
}
