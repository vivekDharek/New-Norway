package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.SSRS_JRS_DTO;
import com.data.norway.model.SSRS_JRS;
import com.data.norway.repository.SSRS_JRS_Repository;
import com.data.norway.service.SSRS_JRS_Service;

@Service
public class SSRS_JRS_ServiceImpl implements SSRS_JRS_Service {
	
	final Driver driver;
	private SSRS_JRS_Repository ssrs_jrs_repository;
	
	public SSRS_JRS_ServiceImpl(Driver driver, SSRS_JRS_Repository ssrs_jrs_repository) {
		super();
		this.driver = driver;
		this.ssrs_jrs_repository = ssrs_jrs_repository;
	}

	@Override
	public List<SSRS_JRS_DTO> findById(String id) {
		Optional<SSRS_JRS> ssrs_jrses = ssrs_jrs_repository.findById(id);
		return ssrs_jrses.stream().map((ssrs_jrs) -> mapToDto(ssrs_jrs)).collect(Collectors.toList());
	}

	private SSRS_JRS_DTO mapToDto(SSRS_JRS ssrs_jrs) {
		SSRS_JRS_DTO ssrs_jrs_dto = SSRS_JRS_DTO.builder()
				.id(ssrs_jrs.getId())
				.req_type(ssrs_jrs.getReq_type())
				.stage(ssrs_jrs.getStage())
				.obj_text(ssrs_jrs.getObj_text())
				.req_origin(ssrs_jrs.getReq_origin()).build();
		return ssrs_jrs_dto;
	}
	
}
