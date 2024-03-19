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
public class IndexController {
	
	private ContractService contractService;
	private DS_ER_Service ds_er_service;
	
	public IndexController(ContractService contractService, DS_ER_Service ds_er_service) {
		super();
		this.contractService = contractService;
		this.ds_er_service = ds_er_service;
	}

	//@RequestMapping("/")
	//public String home() {
		//return "home";
	//}
	
	@GetMapping("/")
	public String getById(Model model){
		List<ContractDTO> contract = contractService.findbyID("CON_ERTMS_TRA_27640");
		model.addAttribute("contract", contract);
		return "try";
	}

	/*@GetMapping(value = "/ds_er/{id}")
	public List<DS_ER_DTO> byId(@PathVariable("id") String id){
		return ds_er_service.findByID(id);
	}*/
	
}
