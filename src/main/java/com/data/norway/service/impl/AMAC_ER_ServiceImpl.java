package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.AMAC_ER_DTO;
import com.data.norway.model.AMAC;
import com.data.norway.repository.AMAC_ER_Repository;
import com.data.norway.service.AMAC_ER_Service;

@Service
public class AMAC_ER_ServiceImpl implements AMAC_ER_Service {

	final Driver driver;
	private AMAC_ER_Repository amac_er_repository;
	
	public AMAC_ER_ServiceImpl(Driver driver, AMAC_ER_Repository amac_er_repository) {
		super();
		this.driver = driver;
		this.amac_er_repository = amac_er_repository;
	}

	@Override
	public List<AMAC_ER_DTO> findById(String id) {
		Optional<AMAC> amac_ers = amac_er_repository.findById(id);
		return amac_ers.stream().map((amac_er) -> mapToDto(amac_er)).collect(Collectors.toList());
	}
	
	private AMAC_ER_DTO mapToDto(AMAC amac) {
		AMAC_ER_DTO amac_er_dto = AMAC_ER_DTO.builder()
				.id(amac.getId())
				.req_type(amac.getReq_type())
				.obj_text(amac.getObj_text())
				.val_statement(amac.getVal_statement())
				.val_evidence(amac.getVal_evidence())
				.val_proof(amac.getVal_proof())
				.val_result(amac.getVal_result())
				.ac_condition(amac.getAc_condition())
				.validates(amac.getValidates()).build();
		return amac_er_dto;		
	}

	@Override
	public int nodeCount() {
		return driver.session().readTransaction(
	            tx -> tx.run("match(n:AMAC) return count(*) as nodes")
	            .single().get("nodes").asInt());
	}
}