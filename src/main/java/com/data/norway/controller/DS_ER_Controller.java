package com.data.norway.controller;

import java.util.*;
import java.util.stream.Collectors;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.norway.DTO.ContractDTO;
import com.data.norway.DTO.DS_ER_DTO;
import com.data.norway.model.DS_ER;
import com.data.norway.model.SAD;
import com.data.norway.model.SRS;
import com.data.norway.model.CONTRACT;
import com.data.norway.model.SSRS_DS;
import com.data.norway.repository.DS_ER_Repository;
import com.data.norway.service.ContractService;
import com.data.norway.service.DS_ER_Service;

@Controller
public class DS_ER_Controller {

	private DS_ER_Service ds_er_service;
	private ContractService contractService;
	
	public DS_ER_Controller(DS_ER_Service ds_er_service, ContractService contractService) {
		super();
		this.ds_er_service = ds_er_service;
		this.contractService = contractService;
	}
	
	@GetMapping(value = "/ds_er/{id}/rel-optional")
	public String findRel(@PathVariable("id") String id, Model model) {
		List<Map<String,Object>> jsonData = ds_er_service.findRelOptional(id);
		//List<String> valuesList = values.stream().collect(Collectors.toList());
		model.addAttribute("jsonData", jsonData);
		return "tree";
	}
}
