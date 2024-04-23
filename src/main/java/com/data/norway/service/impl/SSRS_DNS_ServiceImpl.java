package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.SSRS_DNS_DTO;
import com.data.norway.model.SSRS_DNS;
import com.data.norway.repository.SSRS_DNS_Repository;
import com.data.norway.service.SSRS_DNS_Service;

@Service
public class SSRS_DNS_ServiceImpl implements SSRS_DNS_Service {
	
	final Driver driver;
	private SSRS_DNS_Repository ssrs_dns_repository;
	
	public SSRS_DNS_ServiceImpl(Driver driver, SSRS_DNS_Repository ssrs_dns_repository) {
		super();
		this.driver = driver;
		this.ssrs_dns_repository = ssrs_dns_repository;
	}

	@Override
	public List<SSRS_DNS_DTO> findById(String id) {
		Optional<SSRS_DNS> ssrs_dnses = ssrs_dns_repository.findById(id);
		return ssrs_dnses.stream().map((ssrs_dns) -> mapToDto(ssrs_dns)).collect(Collectors.toList());
	}

	private SSRS_DNS_DTO mapToDto(SSRS_DNS ssrs_dns) {
		SSRS_DNS_DTO ssrs_dns_dto = SSRS_DNS_DTO.builder()
				.id(ssrs_dns.getId())
				.req_origin(ssrs_dns.getReq_origin())
				.stage(ssrs_dns.getStage())
				.obj_text(ssrs_dns.getObj_text())
				.req_type(ssrs_dns.getReq_type()).build();
		return ssrs_dns_dto;
	}
	
}
