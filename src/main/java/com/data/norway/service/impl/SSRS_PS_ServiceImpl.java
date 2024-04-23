package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.SSRS_PS_DTO;
import com.data.norway.model.SSRS_PS;
import com.data.norway.repository.SSRS_PS_Repository;
import com.data.norway.service.SSRS_PS_Service;

@Service
public class SSRS_PS_ServiceImpl implements SSRS_PS_Service {

	final Driver driver;
	private SSRS_PS_Repository ssrs_ps_repository;
	
	public SSRS_PS_ServiceImpl(Driver driver, SSRS_PS_Repository ssrs_ps_repository) {
		super();
		this.driver = driver;
		this.ssrs_ps_repository = ssrs_ps_repository;
	}

	@Override
	public List<SSRS_PS_DTO> findById(String id) {
		Optional<SSRS_PS> ssrs_pses = ssrs_ps_repository.findById(id);
		return ssrs_pses.stream().map((ssrs_ps) -> mapToDto(ssrs_ps)).collect(Collectors.toList());
	}
	
	private SSRS_PS_DTO mapToDto(SSRS_PS ssrs_ps) {
		SSRS_PS_DTO ssrs_ps_dto = SSRS_PS_DTO.builder()
				.id(ssrs_ps.getId())
				.req_type(ssrs_ps.getReq_type())
				.stage(ssrs_ps.getStage())
				.obj_text(ssrs_ps.getObj_text())
				.req_origin(ssrs_ps.getReq_origin()).build();
		return ssrs_ps_dto;
	}

}
