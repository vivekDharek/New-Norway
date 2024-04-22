package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.ACS_ER_DTO;
import com.data.norway.model.ACS_ER;
import com.data.norway.repository.ACS_ER_Repository;
import com.data.norway.service.ACS_ER_Service;

@Service
public class ACS_ER_ServiceImpl implements ACS_ER_Service {
	
	final Driver driver;
	
	private ACS_ER_Repository acs_er_Repository;

	public ACS_ER_ServiceImpl(Driver driver, ACS_ER_Repository acs_er_Repository) {
		super();
		this.driver = driver;
		this.acs_er_Repository = acs_er_Repository;
	}

	@Override
	public List<ACS_ER_DTO> findById(String id) {
		Optional<ACS_ER> acs_ers = acs_er_Repository.findById(id); 
		return acs_ers.stream().map((acs_er) -> mapToDto(acs_er)).collect(Collectors.toList());
	}
	
	private ACS_ER_DTO mapToDto(ACS_ER acs_er) {
		ACS_ER_DTO acs_er_dto = ACS_ER_DTO.builder()
				.id(acs_er.getId())
				.req_type(acs_er.getReq_type())
				.obj_text(acs_er.getObj_text())
				.val_statement(acs_er.getVal_statement())
				.val_evidence(acs_er.getVal_evidence())
				.val_proof_measure(acs_er.getVal_proof_measure())
				.ac_condition(acs_er.getAc_condition())
				.validates(acs_er.getValidates()).build();
		return acs_er_dto;
	}
}