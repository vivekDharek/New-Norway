package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.SSRS_AMAC_DTO;

public interface SSRS_AMAC_Service {

	List<SSRS_AMAC_DTO> findById(String id);
	
}
