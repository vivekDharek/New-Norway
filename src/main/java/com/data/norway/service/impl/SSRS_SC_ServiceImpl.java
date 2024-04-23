package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.SSRS_SC_DTO;
import com.data.norway.model.SSRS_SC;
import com.data.norway.repository.SSRS_SC_Repository;
import com.data.norway.service.SSRS_SC_Service;

@Service
public class SSRS_SC_ServiceImpl implements SSRS_SC_Service {
	
	final Driver driver;
	private SSRS_SC_Repository ssrs_sc_repository;

	public SSRS_SC_ServiceImpl(Driver driver, SSRS_SC_Repository ssrs_sc_repository) {
		super();
		this.driver = driver;
		this.ssrs_sc_repository = ssrs_sc_repository;
	}

	@Override
	public List<SSRS_SC_DTO> findById(String id) {
		Optional<SSRS_SC> ssrs_scs = ssrs_sc_repository.findById(id);
		return ssrs_scs.stream().map((ssrs_sc) -> mapToDto(ssrs_sc)).collect(Collectors.toList());
	}
	
	private SSRS_SC_DTO mapToDto(SSRS_SC ssrs_sc) {
		SSRS_SC_DTO ssrs_sc_dto = SSRS_SC_DTO.builder()
				.id(ssrs_sc.getId())
				.req_type(ssrs_sc.getReq_type())
				.stage(ssrs_sc.getStage())
				.obj_text(ssrs_sc.getObj_text()).build();
		return ssrs_sc_dto;
	}

}
