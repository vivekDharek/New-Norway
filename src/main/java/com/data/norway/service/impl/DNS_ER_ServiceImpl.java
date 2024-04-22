package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.DNS_ER_DTO;
import com.data.norway.model.DNS_ER;
import com.data.norway.repository.DNS_ER_Repository;
import com.data.norway.service.DNS_ER_Service;

@Service
public class DNS_ER_ServiceImpl implements DNS_ER_Service {
	
	final Driver driver;
	private DNS_ER_Repository dns_er_repository;
	
	public DNS_ER_ServiceImpl(Driver driver, DNS_ER_Repository dns_er_repository) {
		super();
		this.driver = driver;
		this.dns_er_repository = dns_er_repository;
	}

	@Override
	public List<DNS_ER_DTO> findById(String id) {
		Optional<DNS_ER> dns_ers = dns_er_repository.findById(id);
		
		return dns_ers.stream().map((dns_er) -> mapToDto(dns_er)).collect(Collectors.toList());
	}
	
	private DNS_ER_DTO mapToDto(DNS_ER dns_er) {
		DNS_ER_DTO dns_er_Dto = DNS_ER_DTO.builder()
				.id(dns_er.getId())
				.req_type(dns_er.getReq_type())
				.obj_text(dns_er.getObj_text())
				.val_statement(dns_er.getVal_statement())
				.val_evidence(dns_er.getVal_evidence())
				.val_proof_measure(dns_er.getVal_proof_measure())
				.val_result(dns_er.getVal_result())
				.ac_condition(dns_er.getAc_condition())
				.validates(dns_er.getValidates()).build();
		return dns_er_Dto;
	}

}
