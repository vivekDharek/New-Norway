package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.SSRS_AMAC_DTO;
import com.data.norway.model.SSRS_AMAC;
import com.data.norway.repository.SSRS_AMAC_Repository;
import com.data.norway.service.SSRS_AMAC_Service;

@Service
public class SSRS_AMAC_ServiceImpl implements SSRS_AMAC_Service {
	
	final Driver driver;
	private SSRS_AMAC_Repository ssrs_amac_repository;
	
	public SSRS_AMAC_ServiceImpl(Driver driver, SSRS_AMAC_Repository ssrs_amac_repository) {
		super();
		this.driver = driver;
		this.ssrs_amac_repository = ssrs_amac_repository;
	}

	@Override
	public List<SSRS_AMAC_DTO> findById(String id) {
		Optional<SSRS_AMAC> ssrs_amacs = ssrs_amac_repository.findById(id);
		return ssrs_amacs.stream().map((ssrs_amac) -> mapToDto(ssrs_amac)).collect((Collectors.toList()));
	}
	
	private SSRS_AMAC_DTO mapToDto(SSRS_AMAC ssrs_amac) {
		SSRS_AMAC_DTO ssrs_amac_dto = SSRS_AMAC_DTO.builder()
				.id(ssrs_amac.getId())
				.stage(ssrs_amac.getStage())
				.req_type(ssrs_amac.getReq_type())
				.obj_text(ssrs_amac.getObj_text())
				.req_origin(ssrs_amac.getReq_origin()).build();
		return ssrs_amac_dto;
	}

	
	
	
}
