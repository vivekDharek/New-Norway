package com.data.norway;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.data.norway.DTO.*;
import com.data.norway.service.*;

@Controller
public class SearchController {
	
	private DS_ER_Service ds_er_service;
	private ContractService contractService;
	private ACS_ER_Service acs_er_Service;
	private AMAC_ER_Service amac_er_Service;
	private CAC_ER_Service cac_er_Service;
	private COM_NET_ER_Service com_net_er_Service;
	private CSF_Service csf_service;
	private DNS_ER_Service dns_er_service;
	private JRS_ER_Service jrs_er_service;
	private KMS_ER_Service kms_er_service;
	private PS_ER_Service ps_er_service;
	private SSRS_ACS_Service ssrs_acs_service;
	private SSRS_AMAC_Service ssrs_amac_service;
	
	public SearchController(DS_ER_Service ds_er_service, 
			ContractService contractService,
			ACS_ER_Service acs_er_Service,
			AMAC_ER_Service amac_er_Service,
			CAC_ER_Service cac_er_Service,
			COM_NET_ER_Service com_net_er_Service,
			CSF_Service csf_service,
			DNS_ER_Service dns_er_service,
			JRS_ER_Service jrs_er_service,
			KMS_ER_Service kms_er_service,
			PS_ER_Service ps_er_service,
			SSRS_ACS_Service ssrs_acs_service,
			SSRS_AMAC_Service ssrs_amac_service) {
		super();
		this.ds_er_service = ds_er_service;
		this.contractService = contractService;
		this.acs_er_Service = acs_er_Service;
		this.amac_er_Service = amac_er_Service;
		this.cac_er_Service = cac_er_Service;
		this.com_net_er_Service = com_net_er_Service;
		this.csf_service = csf_service;
		this.dns_er_service = dns_er_service;
		this.jrs_er_service = jrs_er_service;
		this.kms_er_service = kms_er_service;
		this.ps_er_service = ps_er_service;
		this.ssrs_acs_service = ssrs_acs_service;
		this.ssrs_amac_service = ssrs_amac_service;
	}

	@GetMapping(path = "/")
	public String byId(String id, Model model){
		if(id == null) {
			return "temphtml";
		}
		else if(id.startsWith("DS_ER_ISO9001_")){
			List<DS_ER_DTO> jsonData = ds_er_service.findByID(id);
			model.addAttribute("jsonData", jsonData);
			return "temphtml";
		}else if(id.startsWith("CON_ERTMS_TRA_")) {
			List<ContractDTO> jsonData = contractService.findbyID(id);
			model.addAttribute("jsonData", jsonData);
			return "temphtml";
		}else if(id.startsWith("ACS_ER_ISO9001_")) {
			List<ACS_ER_DTO> jsonData = acs_er_Service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "temphtml";
		}else if(id.startsWith("AMAC_ER_ISO9001_")){
			List<AMAC_ER_DTO> jsonData = amac_er_Service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "temphtml";
		}else if(id.startsWith("CaC_ER_ISO9001_")){
			List<CAC_ER_DTO> jsonData = cac_er_Service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "temphtml";
		}else if(id.startsWith("Com_Network_ER_ISO9001_")){
			List<COM_NET_ER_DTO> jsonData = com_net_er_Service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "temphtml";
		}else if(id.startsWith("CSF_ER_ISO9001_")){
			List<CSF_DTO> jsonData = csf_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "temphtml";
		}else if(id.startsWith("ETCS_DNS_ER_ISO9001_")){
			List<DNS_ER_DTO> jsonData = dns_er_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "temphtml";
		}else if(id.startsWith("JRS_ER_ISO9001_")){
			List<JRS_ER_DTO> jsonData = jrs_er_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "temphtml";
		}else if(id.startsWith("KMS_ER_ISO9001_")){
			List<KMS_ER_DTO> jsonData = kms_er_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "temphtml";
		}else if(id.startsWith("PS_ER_ISO9001_")){
			List<PS_ER_DTO> jsonData = ps_er_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "temphtml";
		}else if(id.startsWith("SSRS_ACS_")){
			List<SSRS_ACS_DTO> jsonData = ssrs_acs_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "temphtml";
		}else if(id.startsWith("SSRS_AMAC_")){
			List<SSRS_AMAC_DTO> jsonData = ssrs_amac_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "temphtml";
		}
		return "temphtml";
	}
	
	/*
	 * @GetMapping(path = "/temp") public String byIdtemp(){ return "d3temp"; }
	 */
}
