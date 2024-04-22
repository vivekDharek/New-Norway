package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.JRS_ER_DTO;
import com.data.norway.model.JRS_ER;
import com.data.norway.repository.JRS_ER_Repository;
import com.data.norway.service.JRS_ER_Service;

@Service
public class JRS_ER_ServiceImpl implements JRS_ER_Service {
	
	final Driver driver;
	private JRS_ER_Repository jrs_er_repository;
	
	public JRS_ER_ServiceImpl(Driver driver, JRS_ER_Repository jrs_er_repository) {
		super();
		this.driver = driver;
		this.jrs_er_repository = jrs_er_repository;
	}

	@Override
	public List<JRS_ER_DTO> findById(String id) {
		Optional<JRS_ER> jrs_ers = jrs_er_repository.findById(id);
		
		return jrs_ers.stream().map((jrs_er) -> mapToDto(jrs_er)).collect(Collectors.toList());
	}
	
	private JRS_ER_DTO mapToDto(JRS_ER jrs_er) {
		JRS_ER_DTO jrs_er_dto = JRS_ER_DTO.builder()
				.id(jrs_er.getId())
				.req_type(jrs_er.getReq_type())
				.obj_text(jrs_er.getObj_text())
				.val_statement(jrs_er.getVal_statement())
				.val_evidence(jrs_er.getVal_evidence())
				.val_proof_measure(jrs_er.getVal_proof_measure())
				.val_result(jrs_er.getVal_result())
				.ac_condition(jrs_er.getAc_condition())
				.validates(jrs_er.getValidates()).build();
		return jrs_er_dto;
	}
	

}
