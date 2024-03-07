package com.data.norway.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.data.norway.DTO.ContractDTO;

@Service
public interface ContractService  {
	List<ContractDTO> findbyID(String id);
	int nodeCount();
}
