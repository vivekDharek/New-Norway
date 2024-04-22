package com.data.norway.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.data.norway.DTO.ACS_ER_DTO;

@Service
public interface ACS_ER_Service {

	List<ACS_ER_DTO> findById(String id);
	
}
