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

import com.data.norway.DTO.DS_ER_DTO;
import com.data.norway.model.DS_ER;
import com.data.norway.model.SAD;
import com.data.norway.model.SRS;
import com.data.norway.model.CONTRACT;
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

	/*@GetMapping(value = "/ds_er/{id}/rel")
	//@ResponseBody
	public List<DS_ER> byIdrel(@PathVariable("id") String id, Model model){
		Optional<DS_ER> values = ds_er_service.findRel(id);
		List<DS_ER> jsonData = values.stream().collect(Collectors.toList());
		//System.out.println(valuesList.size());
		model.addAttribute("jsonData", jsonData);
		return jsonData;
	}*/
	
	@GetMapping(value = "/ds_er/{id}/rel")
	public String byIdrel(@PathVariable("id") String id, Model model){
		Optional<DS_ER> values = ds_er_service.findRel(id);
		List<DS_ER> jsonData = values.stream().collect(Collectors.toList());
		List<Object> tempList = new ArrayList<>();
		for(DS_ER dser : jsonData) {
			tempList.add(dser);
			for (Object obj : tempList) {
				DS_ER dsER = (DS_ER) obj;
				List<SSRS_DS> tempValList = dsER.getVal();
				dsER.setVal(null);
				for(SSRS_DS ssrsds : tempValList) {
					List<SAD> tempsad = ssrsds.getRealizedTo();
					ssrsds.setRealizedTo(null);
					tempList.add(ssrsds);
					for(SAD gaSad : tempsad) {
						List<SRS> tempsrs = gaSad.getRealizesTo();
						gaSad.setRealizesTo(null);
						tempList.add(gaSad);
						for(SRS gaSrs : tempsrs) {
							List<CONTRACT> tempGasrs = gaSrs.getRealizedTo();
							gaSrs.setRealizedTo(null);
							tempList.add(gaSrs);
							for(CONTRACT contract : tempGasrs) {
								tempList.add(contract);
								model.addAttribute("tempList", tempList);
								return "tree";
							}
						}
					}
				}
	        }
		}
		return "tree";
	}
	
	@GetMapping(value = "/ds_er/{id}/rel-optional")
	public String findRel(@PathVariable("id") String id, Model model) {
		List<Map<String,Object>> jsonData = ds_er_service.findRelOptional(id);
		//List<String> valuesList = values.stream().collect(Collectors.toList());
		model.addAttribute("jsonData", jsonData);
		return "tree";
	}
	
	@GetMapping(value = "/ds_er/")
	public List<DS_ER_DTO> byId(@PathVariable String id, Model model){
		List<DS_ER_DTO> jsonData = ds_er_service.findByID(id);
		model.addAttribute("jsonData", jsonData);
		return jsonData;
	}

}
