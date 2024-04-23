package com.data.norway.controller;

import com.data.norway.service.SAD_Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SAD_Controller {
	
	private SAD_Service sad_service;

	public SAD_Controller(SAD_Service sad_service) {
		super();
		this.sad_service = sad_service;
	}
	
	@GetMapping(value = "/incominglinks")
	public String findIncomingLinks(@RequestParam("id") String id, Model model){
		List<Map<String,Object>> jsonData = sad_service.getIncommingLinks(id);
		model.addAttribute("jsonData", jsonData);
		return "tree";
	}
}
