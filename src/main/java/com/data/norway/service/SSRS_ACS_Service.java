package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.SSRS_ACS_DTO;

public interface SSRS_ACS_Service {

	List<SSRS_ACS_DTO> findById(String id); 
	
}
