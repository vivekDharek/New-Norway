package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;

import com.data.norway.DTO.SSRS_DS_DTO;
import com.data.norway.model.SSRS_DS;
import com.data.norway.repository.SSRS_DS_Repository;
import com.data.norway.service.SSRS_DS_Service;

public class SSRS_DS_ServiceImpl implements SSRS_DS_Service {

	final Driver driver;
	
	private SSRS_DS_Repository ssrs_ds_Repository;
	
	public SSRS_DS_ServiceImpl(Driver driver, SSRS_DS_Repository ssrs_ds_Repository) {
		super();
		this.driver = driver;
		this.ssrs_ds_Repository = ssrs_ds_Repository;
	}

	@Override
	public List<SSRS_DS_DTO> findByID(String id) {
		Optional<SSRS_DS> ssrss = ssrs_ds_Repository.findById(id);
		return ssrss.stream().map((ssrs) -> mapToDto(ssrs)).collect(Collectors.toList());
	}
	
	private SSRS_DS_DTO mapToDto(SSRS_DS ssrs) {
		SSRS_DS_DTO ssrs_dto = SSRS_DS_DTO.builder()
				.id(ssrs.getId())
				.obj_text(ssrs.getObj_text())
				.req_type(ssrs.getReq_type())
				.stage(ssrs.getStage())
				.bypass(ssrs.getBypass())
				.realizes(ssrs.getRealizes())
				.req_origin(ssrs.getReq_origin())
				.req(ssrs.getReq())
				.build();
		return ssrs_dto;
	}
}
