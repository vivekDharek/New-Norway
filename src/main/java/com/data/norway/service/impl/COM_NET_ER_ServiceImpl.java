package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.CAC_ER_DTO;
import com.data.norway.DTO.COM_NET_ER_DTO;
import com.data.norway.model.COM_NET_ER;
import com.data.norway.repository.COM_NET_ER_Repository;
import com.data.norway.service.COM_NET_ER_Service;

@Service
public class COM_NET_ER_ServiceImpl implements COM_NET_ER_Service {

	final Driver driver;
	private COM_NET_ER_Repository com_net_repository;
	
	public COM_NET_ER_ServiceImpl(Driver driver, COM_NET_ER_Repository com_net_repository) {
		super();
		this.driver = driver;
		this.com_net_repository = com_net_repository;
	}

	@Override
	public List<COM_NET_ER_DTO> findById(String id) {
		Optional<COM_NET_ER> com_net_ers = com_net_repository.findById(id);
		return com_net_ers.stream().map((com_net_er) -> mapToDto(com_net_er)).collect(Collectors.toList());
	}
	
	private COM_NET_ER_DTO mapToDto(COM_NET_ER com_net_er) {
		COM_NET_ER_DTO com_net_er_dto = COM_NET_ER_DTO.builder()
				.id(com_net_er.getId())
				.req_type(com_net_er.getReq_type())
				.obj_text(com_net_er.getObj_text())
				.val_statement(com_net_er.getVal_statement())
				.val_evidence(com_net_er.getVal_evidence())
				.val_proof(com_net_er.getVal_proof())
				.val_result(com_net_er.getVal_result())
				.ac_condition(com_net_er.getAc_condition())
				.validates(com_net_er.getValidates()).build();
		return com_net_er_dto;
	}
	
}
