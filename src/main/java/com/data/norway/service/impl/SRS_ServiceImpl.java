package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.SRS_DTO;
import com.data.norway.model.SRS;
import com.data.norway.repository.SRS_Repository;
import com.data.norway.service.SRS_Service;

@Service
public class SRS_ServiceImpl implements SRS_Service {

	final Driver driver;
	
	private SRS_Repository srs_repository;
	
	public SRS_ServiceImpl(Driver driver, SRS_Repository srs_repository) {
		super();
		this.driver = driver;
		this.srs_repository = srs_repository;
	}

	@Override
	public List<SRS_DTO> findByID(String id) {
		Optional<SRS> srss = srs_repository.findById(id);
		
		return srss.stream().map((srs) -> mapToDto(srs)).collect(Collectors.toList());
	} 
	
	private SRS_DTO mapToDto(SRS srs) {
		SRS_DTO srs_dto = SRS_DTO.builder()
				.id(srs.getId())
				.req_type(srs.getReq_type())
				.stage(srs.getStage())
				.obj_text(srs.getObj_text())
				.req_forwarding(srs.getReq_forwarding())
				.realizes(srs.getRealizes())
				.build();
		return srs_dto;
	}
	

}
