package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.SSRS_CSF_DTO;

public interface SSRS_CSF_Service {
	
	List<SSRS_CSF_DTO> findById(String id);

}
