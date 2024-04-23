package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.SSRS_COM_DTO;
import com.data.norway.model.SSRS_COM;
import com.data.norway.repository.SSRS_COM_Repository;
import com.data.norway.service.SSRS_COM_Service;

@Service
public class SSRS_COM_ServiceImpl implements SSRS_COM_Service {

	final Driver driver;
	private SSRS_COM_Repository ssrs_com_repository;
	
	public SSRS_COM_ServiceImpl(Driver driver, SSRS_COM_Repository ssrs_com_repository) {
		super();
		this.driver = driver;
		this.ssrs_com_repository = ssrs_com_repository;
	}

	@Override
	public List<SSRS_COM_DTO> findById(String id) {
		Optional<SSRS_COM> ssrs_coms = ssrs_com_repository.findById(id);
		return ssrs_coms.stream().map((ssrs_com) -> mapToDto(ssrs_com)).collect(Collectors.toList());
	}
	
	private SSRS_COM_DTO mapToDto(SSRS_COM ssrs_com) {
		SSRS_COM_DTO ssrs_com_dto = SSRS_COM_DTO.builder()
				.id(ssrs_com.getId())
				.req_type(ssrs_com.getReq_type())
				.stage(ssrs_com.getStage())
				.obj_text(ssrs_com.getObj_text()).build();
		return ssrs_com_dto;
	}
	
}
