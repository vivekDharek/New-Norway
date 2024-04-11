package com.data.norway;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.data.norway.DTO.ContractDTO;
import com.data.norway.DTO.DS_ER_DTO;
import com.data.norway.service.ContractService;
import com.data.norway.service.DS_ER_Service;

@Controller
public class SearchController {
	
	private DS_ER_Service ds_er_service;
	private ContractService contractService;
	
	public SearchController(DS_ER_Service ds_er_service, ContractService contractService) {
		super();
		this.ds_er_service = ds_er_service;
		this.contractService = contractService;
	}

	@GetMapping(path = "/")
	public String byId(String id, Model model){
		if(id == null) {
			return "temphtml";
		}
		if(id.startsWith("DS_ER_ISO9001_")){
			List<DS_ER_DTO> jsonData = ds_er_service.findByID(id);
			model.addAttribute("jsonData", jsonData);
			return "temphtml";
		}else if(id.startsWith("CON_ERTMS_TRA_")) {
			List<ContractDTO> jsonData = contractService.findbyID(id);
			model.addAttribute("jsonData", jsonData);
			return "temphtml";
		}
		return "temphtml";
	}
	
}
