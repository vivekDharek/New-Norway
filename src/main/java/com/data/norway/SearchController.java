package com.data.norway;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
	private SSRS_SC_Service ssrs_sc_service;
	private SSRS_COM_Service ssrs_com_service;
	private SSRS_CSF_Service ssrs_csf_service;
	private SSRS_DNS_Service ssrs_dns_service;
	private SSRS_JRS_Service ssrs_jrs_service;
	private SSRS_KMS_Service ssrs_kms_service;
	private SSRS_PS_Service ssrs_ps_service;
	private SAD_Service sad_service;
	private SRS_Service srs_service;
	private SSRS_DS_Service ssrs_ds_service;
	
	private Links_Service links_service;
	
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
			SSRS_AMAC_Service ssrs_amac_service,
			SSRS_SC_Service ssrs_sc_service,
			SSRS_COM_Service ssrs_com_service,
			SSRS_CSF_Service ssrs_csf_service,
			SSRS_DNS_Service ssrs_dns_service,
			SSRS_JRS_Service ssrs_jrs_service,
			SSRS_KMS_Service ssrs_kms_service,
			SSRS_PS_Service ssrs_ps_service,
			SAD_Service sad_service,
			SRS_Service srs_service,
			SSRS_DS_Service ssrs_ds_service,
			Links_Service links_service) {
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
		this.ssrs_sc_service = ssrs_sc_service;
		this.ssrs_com_service =  ssrs_com_service;
		this.ssrs_csf_service = ssrs_csf_service;
		this.ssrs_dns_service = ssrs_dns_service;
		this.ssrs_jrs_service = ssrs_jrs_service;
		this.ssrs_kms_service = ssrs_kms_service;
		this.ssrs_ps_service = ssrs_ps_service;
		this.sad_service = sad_service;
		this.srs_service = srs_service;
		this.ssrs_ds_service = ssrs_ds_service;
		this.links_service = links_service;
	}
	

	@GetMapping(path = "/")
	public String byId(String id, Model model){
		if(id == null) {
			return "index";
		}
		else if(id.startsWith("DS_ER_ISO9001_")){
			List<DS_ER_DTO> jsonData = ds_er_service.findByID(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("CON_ERTMS_TRA_")) {
			List<ContractDTO> jsonData = contractService.findbyID(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("ACS_ER_ISO9001_")) {
			List<ACS_ER_DTO> jsonData = acs_er_Service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("SSRS_DS_")){
			List<SSRS_DS_DTO> jsonData = ssrs_ds_service.findByID(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("CaC_ER_ISO9001_")){
			List<CAC_ER_DTO> jsonData = cac_er_Service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("Com_Network_ER_ISO9001_")){
			List<COM_NET_ER_DTO> jsonData = com_net_er_Service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("CSF_ER_ISO9001_")){
			List<CSF_DTO> jsonData = csf_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("ETCS_DNS_ER_ISO9001_")){
			List<DNS_ER_DTO> jsonData = dns_er_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("JRS_ER_ISO9001_")){
			List<JRS_ER_DTO> jsonData = jrs_er_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("KMS_ER_ISO9001_")){
			List<KMS_ER_DTO> jsonData = kms_er_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("PS_ER_ISO9001_")){
			List<PS_ER_DTO> jsonData = ps_er_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("SSRS_ACS_")){
			List<SSRS_ACS_DTO> jsonData = ssrs_acs_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("SSRS_AMAC_")){
			List<SSRS_AMAC_DTO> jsonData = ssrs_amac_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("SSRS_SC_")){
			List<SSRS_SC_DTO> jsonData = ssrs_sc_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("SSRS_ComN_")){
			List<SSRS_COM_DTO> jsonData = ssrs_com_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("SSRS_CSF_")){
			List<SSRS_CSF_DTO> jsonData = ssrs_csf_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("SSRS_DNS_")){
			List<SSRS_DNS_DTO> jsonData = ssrs_dns_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("SSRS_JRS_")){
			List<SSRS_JRS_DTO> jsonData = ssrs_jrs_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("SSRS_KMS_")){
			List<SSRS_KMS_DTO> jsonData = ssrs_kms_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("SSRS_PS_")){
			List<SSRS_PS_DTO> jsonData = ssrs_ps_service.findById(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("GA_SAD_")){
			List<SAD_DTO> jsonData = sad_service.findByID(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}else if(id.startsWith("GA_SRS_")){
			List<SRS_DTO> jsonData = srs_service.findByID(id);
			model.addAttribute("jsonData", jsonData);
			return "index";
		}
		return "index";
	}
	
	/*@GetMapping(value = "/incominglinks")
	public String getIncomingLinks(@RequestParam("id") String id, Model model) {
		List<Map<String,Object>> jsonData = links_service.getIncommingLinks(id);
		model.addAttribute("jsonData", jsonData);
		return "tree";
	}*/
	
	@GetMapping(value = "/incominglinks")
	public String getIncomingLinks(@RequestParam("id") String id, Model model) {
		List<Map<String,Object>> jsonData = links_service.getIncommingLinks(id);
		List<Map<String,Object>> graphData = links_service.getGraph(id);
		model.addAttribute("jsonData", jsonData);
		model.addAttribute("graphData", graphData);
		return "tree";
	}
	
	@GetMapping(value = "/outgoinglinks")
	public String getOutgoingLinks(@RequestParam("id") String id, Model model) {
		List<Map<String,Object>> jsonData = links_service.getOutgoingLinks(id);
		model.addAttribute("jsonData", jsonData);
		return "tree";
	}
	
	/*
	 * @GetMapping(path = "/temp") public String byIdtemp(){ return "d3temp"; }
	 */
}
