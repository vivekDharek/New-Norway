package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.CAC_ER_DTO;
import com.data.norway.model.CAC_ER;
import com.data.norway.repository.CAC_ER_Repository;
import com.data.norway.service.CAC_ER_Service;

@Service
public class CAC_ER_ServiceImpl implements CAC_ER_Service {

	
	final Driver driver;
	private CAC_ER_Repository cac_er_repository;
	
	public CAC_ER_ServiceImpl(Driver driver, CAC_ER_Repository cac_er_repository) {
		super();
		this.driver = driver;
		this.cac_er_repository = cac_er_repository;
	}

	@Override
	public List<CAC_ER_DTO> findById(String id) {
		Optional<CAC_ER> cac_ers = cac_er_repository.findById(id);
		return cac_ers.stream().map((cac_er) -> mapToDto(cac_er)).collect(Collectors.toList());
	}
	
	private CAC_ER_DTO mapToDto(CAC_ER cac_er) {
		CAC_ER_DTO cac_er_dto = CAC_ER_DTO.builder()
				.id(cac_er.getId())
				.req_type(cac_er.getReq_type())
				.obj_text(cac_er.getObj_text())
				.val_statement(cac_er.getVal_statement())
				.val_evidence(cac_er.getVal_evidence())
				.val_proof(cac_er.getVal_proof())
				.val_result(cac_er.getVal_result())
				.ac_condition(cac_er.getAc_condition())
				.validates(cac_er.getValidates()).build();
		return cac_er_dto;
	}
	
	

}
