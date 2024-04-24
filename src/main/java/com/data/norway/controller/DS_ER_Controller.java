package com.data.norway.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.data.norway.service.ContractService;
import com.data.norway.service.DS_ER_Service;

@Controller
public class DS_ER_Controller {

	private DS_ER_Service ds_er_service;
	
	public DS_ER_Controller(DS_ER_Service ds_er_service, ContractService contractService) {
		super();
		this.ds_er_service = ds_er_service;
	}
	
	@GetMapping(value = "/rel")
	public String findRel(@RequestParam("id") String id, Model model) {
		List<Map<String, Object>> jsonData = ds_er_service.findRelOptional(id); 
		// List<String> valuesList =values.stream().collect(Collectors.toList());
		System.out.println("Controller invoked successfully with ID: " + id);
		model.addAttribute("jsonData", jsonData);
		return "tree";
	}
	
	
	/*
	 * @GetMapping(path = "/ds_er/{id}") public List<Map<String, Object>>
	 * findRel(@PathVariable("id") String id, Model model) { List<Map<String,
	 * Object>> jsonData = ds_er_service.findRelOptional(id);
	 * //System.out.println("ID = " + id); // List<String> valuesList
	 * =values.stream().collect(Collectors.toList()); model.addAttribute("jsonData",
	 * jsonData); return jsonData; }
	 */
	
}
