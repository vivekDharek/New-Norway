package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.service.*;
import com.data.norway.DTO.SSRS_CSF_DTO;
import com.data.norway.model.SSRS_CSF;
import com.data.norway.repository.SSRS_CSF_Repository;

@Service
public class SSRS_CSF_ServiceImpl implements SSRS_CSF_Service  {
	
	final Driver driver;
	private SSRS_CSF_Repository ssrs_csf_repository;
	
	public SSRS_CSF_ServiceImpl(Driver driver, SSRS_CSF_Repository ssrs_csf_repository) {
		super();
		this.driver = driver;
		this.ssrs_csf_repository = ssrs_csf_repository;
	}

	@Override
	public List<SSRS_CSF_DTO> findById(String id) {
		Optional<SSRS_CSF> ssrs_csfs = ssrs_csf_repository.findById(id);
		return ssrs_csfs.stream().map((ssrs_csf) -> mapToDto(ssrs_csf)).collect(Collectors.toList());
	}
	
	private SSRS_CSF_DTO mapToDto(SSRS_CSF ssrs_csf) {
		SSRS_CSF_DTO ssrs_csf_dtos = SSRS_CSF_DTO.builder()
				.id(ssrs_csf.getId())
				.req_type(ssrs_csf.getReq_type())
				.stage(ssrs_csf.getStage())
				.obj_text(ssrs_csf.getObj_text()).build();
		return ssrs_csf_dtos;
				
	}
	
	

}
