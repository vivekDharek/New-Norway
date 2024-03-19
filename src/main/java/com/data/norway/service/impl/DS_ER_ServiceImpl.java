package com.data.norway.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.DS_ER_DTO;
import com.data.norway.model.DS_ER;
import com.data.norway.model.SSRS_DS;
import com.data.norway.repository.DS_ER_Repository;
import com.data.norway.service.DS_ER_Service;

@Service
public class DS_ER_ServiceImpl implements DS_ER_Service {

	final Driver driver;
	
	private DS_ER_Repository ds_ER_Repository;
	
	public DS_ER_ServiceImpl(Driver driver, DS_ER_Repository ds_ER_Repository) {
		super();
		this.driver = driver;
		this.ds_ER_Repository = ds_ER_Repository;
	}

	@Override
	public List<DS_ER_DTO> findByID(String id) {
		Optional<DS_ER> ds_ers = ds_ER_Repository.findById(id);
		return ds_ers.stream().map((ds_er) -> mapToDTO(ds_er)).collect(Collectors.toList());
	}
	
	private DS_ER_DTO mapToDTO(DS_ER ds_er) {
		DS_ER_DTO  ds_er_dto = DS_ER_DTO.builder()
				.id(ds_er.getId())
				.obj_text(ds_er.getObj_text())
				.req_type(ds_er.getReq_type())
				.val_evidence(ds_er.getVal_evidence())
				.val_proof(ds_er.getVal_evidence())
				.val_result(ds_er.getVal_result())
				.val_statement(ds_er.getVal_statement())
				.ac_condition(ds_er.getAc_condition())
				.validates(ds_er.getValidates()).build();
		return ds_er_dto;
				
	}

	@Override
	public Optional<DS_ER> findRel(String id) {
		Optional<DS_ER> ds_ers = ds_ER_Repository.findById(id);
		return ds_ers;
	}
}
