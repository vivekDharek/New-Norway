package com.data.norway.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.data.norway.DTO.ContractDTO;
import com.data.norway.model.CONTRACT;
import com.data.norway.service.ContractService;

@Controller
public class ContractController {
	
	private ContractService contractService;
	
	public ContractController(ContractService contractService) {
		this.contractService = contractService;
	}

	@GetMapping("/contracts")
	public int nodeCount() {
		return contractService.nodeCount();
	}

}
