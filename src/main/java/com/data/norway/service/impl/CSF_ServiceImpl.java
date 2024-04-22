package com.data.norway.service.impl;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.CSF_DTO;
import com.data.norway.repository.CSF_Repository;
import com.data.norway.service.CSF_Service;
import com.data.norway.model.*;

@Service
public class CSF_ServiceImpl implements CSF_Service{
	
	final Driver driver;
	private CSF_Repository csf_repository;
	
	public CSF_ServiceImpl(Driver driver, CSF_Repository csf_repository) {
		super();
		this.driver = driver;
		this.csf_repository = csf_repository;
	}

	@Override
	public List<CSF_DTO> findById(String id) {
		Optional<CSF> csfs = csf_repository.findById(id); 
		return csfs.stream().map((csf) -> mapToDto(csf)).collect(Collectors.toList());
	}
	
	private CSF_DTO mapToDto(CSF csf) {
		CSF_DTO csf_dto = CSF_DTO.builder()
				.id(csf.getId())
				.req_type(csf.getReq_type())
				.obj_text(csf.getObj_text())
				.val_statement(csf.getVal_statement())
				.val_evidence(csf.getVal_evidence())
				.val_proof(csf.getVal_proof())
				.ac_condition(csf.getAc_condition())
				.val_result(csf.getVal_result())
				.validates(csf.getValidates()).build();
		return csf_dto;
	}

}
