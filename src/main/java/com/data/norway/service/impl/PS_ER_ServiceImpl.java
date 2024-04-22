package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.PS_ER_DTO;
import com.data.norway.model.PS_ER;
import com.data.norway.repository.PS_ER_Repository;
import com.data.norway.service.PS_ER_Service;

@Service
public class PS_ER_ServiceImpl implements PS_ER_Service{

	final Driver driver;
	private PS_ER_Repository ps_er_repository;
	
	public PS_ER_ServiceImpl(Driver driver, PS_ER_Repository ps_er_repository) {
		super();
		this.driver = driver;
		this.ps_er_repository = ps_er_repository;
	}

	@Override
	public List<PS_ER_DTO> findById(String id) {
		Optional<PS_ER> ps_ers = ps_er_repository.findById(id);
		return ps_ers.stream().map((ps_er) -> mapToDto(ps_er)).collect(Collectors.toList());
	}
	
	private PS_ER_DTO mapToDto(PS_ER ps_er) {
		PS_ER_DTO ps_er_dto = PS_ER_DTO.builder()
				.id(ps_er.getId())
				.req_type(ps_er.getReq_type())
				.obj_text(ps_er.getObj_text())
				.val_statement(ps_er.getVal_statement())
				.val_evidence(ps_er.getVal_evidence())
				.val_proof_measure(ps_er.getVal_proof_measure())
				.val_result(ps_er.getVal_result())
				.ac_condition(ps_er.getAc_condition())
				.validates(ps_er.getValidates()).build();
		return ps_er_dto;
	}

}
