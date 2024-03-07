package com.data.norway.service.impl;

import com.data.norway.model.CONTRACT;
import com.data.norway.repository.ContractRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.ContractDTO;
import com.data.norway.service.ContractService;

@Service
public class ContractServiceImpl implements ContractService {

	final Driver driver;
	
	private ContractRepository contractRepository;
	
	public ContractServiceImpl(Driver driver, ContractRepository contractRepository) {
		super();
		this.driver = driver;
		this.contractRepository = contractRepository;
	}

	@Override
	public List<ContractDTO> findbyID(String id) {
		// TODO Auto-generated method stub
		Optional<CONTRACT> contracts = contractRepository.findById(id);
        return contracts.stream().map((contract) -> mapToDto(contract)).collect(Collectors.toList());
	}

	private ContractDTO mapToDto(CONTRACT contract) {
		ContractDTO contract_DTO = ContractDTO.builder()
	            .id(contract.getId())
	            .external_id(contract.getExternal_id())
	            .req_type(contract.getReq_type())
	            .obj_text(contract.getObj_text())
	            .req_title(contract.getReq_title())
	            .req_rational(contract.getReq_rational())
	            .cust_comments(contract.getCust_comments())
	            .req_forwarding(contract.getReq_forwarding())
	            .req_varification(contract.getReq_varification())
	            .build();
	        return contract_DTO;
	}

	@Override
	public int nodeCount() {
		return driver.session().readTransaction(
	            tx -> tx.run("match(n:CONTRACT) return count(*) as nodes")
	            .single().get("nodes").asInt());
	}
	
}
