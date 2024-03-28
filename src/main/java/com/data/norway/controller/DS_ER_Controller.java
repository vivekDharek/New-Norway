package com.data.norway.controller;

import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.norway.DTO.DS_ER_DTO;
import com.data.norway.model.DS_ER;
import com.data.norway.model.SSRS_DS;
import com.data.norway.repository.DS_ER_Repository;
import com.data.norway.service.DS_ER_Service;

@Controller
public class DS_ER_Controller {

	private DS_ER_Service ds_er_service;
	
	public DS_ER_Controller(DS_ER_Service ds_er_service) {
		super();
		this.ds_er_service = ds_er_service;
	}

	@GetMapping(value = "/ds_er/{id}/rel")
	//@ResponseBody
	public List<DS_ER> byIdrel(@PathVariable("id") String id, Model model){
		Optional<DS_ER> values = ds_er_service.findRel(id);
		List<DS_ER> valuesList = values.stream().collect(Collectors.toList());
		System.out.println(valuesList.size());
		//model.addAttribute("values", valuesList);
		return valuesList;
	}
	
	@GetMapping(value = "/ds_er/{id}/rel-optional")
	public String findRel(@PathVariable("id") String id, Model model) {
		List<Map<String, Object>> jsonData = ds_er_service.findRelOptional(id);
		//List<String> valuesList = values.stream().collect(Collectors.toList());
		model.addAttribute("jsonData", jsonData);
		return "demo";
	}
	
	@GetMapping(value = "/ds_er/{id}")
	public String byId(@PathVariable("id") String id, Model model){
		List<DS_ER_DTO> dsd = ds_er_service.findByID(id);
		model.addAttribute("dsd", dsd);
		return "ds";
	}

}
