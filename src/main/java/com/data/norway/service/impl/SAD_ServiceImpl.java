package com.data.norway.service.impl;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;

import com.data.norway.DTO.SAD_DTO;
import com.data.norway.model.SAD;
import com.data.norway.repository.SAD_Repository;
import com.data.norway.service.SAD_Service;

public class SAD_ServiceImpl implements SAD_Service {

	
	final Driver driver;
	private SAD_Repository sad_repository;
	
	public SAD_ServiceImpl(Driver driver, SAD_Repository sad_repository) {
		super();
		this.driver = driver;
		this.sad_repository = sad_repository;
	}

	@Override
	public List<SAD_DTO> findByID(String id) {
		Optional<SAD> sads = sad_repository.findById(id);
		return sads.stream().map((sad) -> mapToDto(sad)).collect(Collectors.toList());
	}
	
	private SAD_DTO mapToDto(SAD sad) {
		SAD_DTO sad_dto = SAD_DTO.builder()
				.id(sad.getId())
				.req_type(sad.getReq_type())
				.stage(sad.getStage())
				.obj_text(sad.getObj_text())
				.req_forwarding(sad.getReq_forwarding())
				.realizes(sad.getRealizes())
				.req_origin(sad.getReq_origin())
				.build();
		return sad_dto;
	}

}
