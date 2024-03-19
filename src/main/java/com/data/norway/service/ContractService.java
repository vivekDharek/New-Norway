package com.data.norway.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.data.norway.DTO.ContractDTO;
import com.data.norway.model.CONTRACT;

@Service
public interface ContractService  {
	List<ContractDTO> findbyID(String id);
	int nodeCount();
}
