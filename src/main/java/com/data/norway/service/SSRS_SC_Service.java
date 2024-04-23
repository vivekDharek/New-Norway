package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.SSRS_SC_DTO;

public interface SSRS_SC_Service {
	
	List<SSRS_SC_DTO> findById(String id);

}
