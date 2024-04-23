package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.SSRS_JRS_DTO;

public interface SSRS_JRS_Service {
	
	List<SSRS_JRS_DTO> findById(String id);

}
