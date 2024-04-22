package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.SSRS_ACS_DTO;
import com.data.norway.model.SSRS_ACS;
import com.data.norway.repository.SSRS_ACS_Repository;
import com.data.norway.service.SSRS_ACS_Service;

@Service
public class SSRS_ACS_ServiceImpl implements SSRS_ACS_Service {
	
	final Driver driver;
	private SSRS_ACS_Repository ssrs_acs_repository;
	
	public SSRS_ACS_ServiceImpl(Driver driver, SSRS_ACS_Repository ssrs_acs_repository) {
		super();
		this.driver = driver;
		this.ssrs_acs_repository = ssrs_acs_repository;
	}

	@Override
	public List<SSRS_ACS_DTO> findById(String id) {
		Optional<SSRS_ACS> ssrs_acses = ssrs_acs_repository.findById(id);
		return ssrs_acses.stream().map((ssrs_acs) -> mapToDto(ssrs_acs)).collect(Collectors.toList());
	}
	
	private SSRS_ACS_DTO mapToDto(SSRS_ACS ssrs_acs) {
		SSRS_ACS_DTO ssrs_acs_dto = SSRS_ACS_DTO.builder()
				.id(ssrs_acs.getId())
				.req_type(ssrs_acs.getReq_type())
				.stage(ssrs_acs.getStage())
				.obj_text(ssrs_acs.getObj_text())
				.req_origin(ssrs_acs.getReq_origin()).build();
		return ssrs_acs_dto;
	}
	
}
