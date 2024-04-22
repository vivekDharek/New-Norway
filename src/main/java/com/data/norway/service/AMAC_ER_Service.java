package com.data.norway.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.data.norway.DTO.AMAC_ER_DTO;
import com.data.norway.model.AMAC;

@Service
public interface AMAC_ER_Service {
	
	List<AMAC_ER_DTO> findById(String id);
	int nodeCount();

}
