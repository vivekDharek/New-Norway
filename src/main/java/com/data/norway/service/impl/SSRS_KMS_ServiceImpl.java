package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.SSRS_KMS_DTO;
import com.data.norway.model.SSRS_KMS;
import com.data.norway.repository.SSRS_KMS_Repository;
import com.data.norway.service.SSRS_KMS_Service;

@Service
public class SSRS_KMS_ServiceImpl implements SSRS_KMS_Service{
	
	final Driver driver;
	private SSRS_KMS_Repository ssrs_kms_repository;
	
	public SSRS_KMS_ServiceImpl(Driver driver, SSRS_KMS_Repository ssrs_kms_repository) {
		super();
		this.driver = driver;
		this.ssrs_kms_repository = ssrs_kms_repository;
	}

	@Override
	public List<SSRS_KMS_DTO> findById(String id) {
		Optional<SSRS_KMS> ssrs_kmses = ssrs_kms_repository.findById(id);
		return ssrs_kmses.stream().map((ssrs_kms) -> mapToDto(ssrs_kms)).collect(Collectors.toList());
	}
	
	private SSRS_KMS_DTO mapToDto(SSRS_KMS ssrs_kms) {
		SSRS_KMS_DTO ssrs_kms_dto = SSRS_KMS_DTO.builder()
				.id(ssrs_kms.getId())
				.req_type(ssrs_kms.getReq_type())
				.stage(ssrs_kms.getStage())
				.obj_text(ssrs_kms.getObj_text())
				.req_origin(ssrs_kms.getReq_origin()).build();
		return ssrs_kms_dto;
	}

}
